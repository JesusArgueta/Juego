/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;

import gameObjects.Constants;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.*;
import main.Menu;
import states.EstadoJuego;

/**
 *
 * @author FA506IV
 */
public class ConectorBBDD {

    private boolean error;
    private Connection con;
    private Statement stat;
    private PreparedStatement ps;
    private ResultSet rs;

    public static final String URL = "jdbc:mysql://localhost:3306/jumpwalkergame?allowPublicKeyRetrieval=true&useSSL=false";
    public static final String USER = "apu";
    public static final String CLAVE = "apu";

    public Connection getConexion() {

        try {

            con = DriverManager.getConnection(URL, USER, CLAVE);
            stat = con.createStatement();
            crearTablas();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public void crearTablas() {
        error = false;
        String sql, sql2;
        sql = "CREATE TABLE IF NOT EXISTS usuarios("
                + "idUsuario int(5) PRIMARY KEY auto_increment,"
                + "user VARCHAR(50) NOT NULL,"
                + "password VARCHAR(50) NOT NULL,"
                + "isAdmin boolean);";

        sql2 = "CREATE TABLE IF NOT EXISTS estadojuego("
                + "idEstadoJuego int(5) PRIMARY KEY auto_increment,"
                + "nombre VARCHAR(50) NOT NULL, "
                + "idUsuario int NOT NULL, "
                + "puntos int,"
                + "nivel int,"
                + "vidas int NOT NULL,"
                + "FOREIGN KEY (idUsuario) REFERENCES usuarios(idUsuario));";

        try {
            stat.execute(sql);
            stat.execute(sql2);

        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();
        }
    }

    public void registrarUser(JFrame j, JPasswordField jContrasenia, JTextField jUser) {
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();

        try {
            ps = conexion.prepareStatement("INSERT INTO usuarios(user,password) VALUES (?,?)");
            ps.setString(1, jUser.getText());
            ps.setString(2, String.valueOf(jContrasenia.getPassword()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(j, "El usuario se ha creado correctamente.", "Registro usuario", 1);

            } else {
                JOptionPane.showMessageDialog(j, "Error al guardar el usuario en BBDD.", "Registro usuario", 0);
                jUser.setText("");
                jContrasenia.setText("");
            }

            getConexion().close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      public void registrarEstadoJuego(JFrame j, JTextField jUser) {
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        int id = cargarIdUsuario(jUser.getText());
        try {
            ps = conexion.prepareStatement("INSERT INTO estadojuego(nombre,idUsuario,puntos,nivel,vidas) VALUES (?,?,?,?,?);");

            ps.setString(1, jUser.getText());
            ps.setInt(2, id);
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.setInt(5, 3);

            int res = ps.executeUpdate();

            if (res > 0) {

            } else {
                JOptionPane.showMessageDialog(j, "Error al guardar el usuario en BBDD.", "Registro usuario", 0);
                jUser.setText("");

            }
            rs.close();
            ps.close();
            conexion.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    

    public boolean accesoLogin(JFrame j, JPasswordField jContrasenia, JTextField jUser) {
        boolean exito = false;
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        try {

            ps = conexion.prepareStatement("SELECT user, password FROM usuarios");

            String pass = String.valueOf(jContrasenia.getPassword());
            rs = ps.executeQuery();

            while (rs.next()) {
                if (jUser.getText().equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
                    exito = true;
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(j);
                    registrarEstadoJuego(j, jUser);
                    j.dispose();
                    break;
                } else {

                }
            }
            if (!exito) {
                JOptionPane.showMessageDialog(j, "Las credenciales de acceso no son correctas.", "Error login", 0);

            }
            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exito;
    }

    public int cargarIdUsuario(String user) {
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        int idUsuario = 0;
        try {

            ps = conexion.prepareStatement("SELECT idUsuario FROM usuarios Where user=?;");
            ps.setString(1, user);
            rs = ps.executeQuery();

            while (rs.next()) {
                idUsuario = rs.getInt("idUsuario");
                System.out.println(idUsuario);
                break;
            }
            rs.close();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return idUsuario;

    }

    public int cargarIdEstadoJuego(String user) {
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        int idEstadoJuego = 0;
        try {

            ps = conexion.prepareStatement("SELECT idEstadoJuego FROM estadojuego WHERE nombre=? ORDER BY idEstadoJuego desc limit 1;");
            ps.setString(1, user);
            rs = ps.executeQuery();

            while (rs.next()) {
                idEstadoJuego = rs.getInt("idEstadoJuego");
                System.out.println(idEstadoJuego);
                break;
            }
            rs.close();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return idEstadoJuego;

    }

  

    public ArrayList<EstadoJuego> sacarPuntuaciones() {
        ArrayList<EstadoJuego> e;
        e = new ArrayList<EstadoJuego>();

        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        try {

            ps = conexion.prepareStatement("SELECT nombre,puntos FROM estadojuego order by puntos desc limit 3;");

            rs = ps.executeQuery();

            while (rs.next()) {
                EstadoJuego estado = new EstadoJuego();
                estado.setNombre(rs.getString("nombre"));
                estado.setPuntos(rs.getInt("puntos"));
                System.out.println(estado);
                System.out.println("eeeeee");
                e.add(estado);

            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return e;
    }

    public void updateEstadoJuego(int puntos, int nivel, int vidas) {
        ConectorBBDD con = new ConectorBBDD();
        Connection conexion = con.getConexion();
        int id = cargarIdEstadoJuego(Constants.NOMBRE_ESTADO_JUEGO);
        try {

            ps = conexion.prepareStatement("UPDATE estadojuego SET puntos =?, nivel=?,vidas=? WHERE idEstadoJuego = '" + id + "';");

            ps.setInt(1, puntos);
            ps.setInt(2, nivel);
            ps.setInt(3, vidas);

            ps.executeUpdate();

            rs.close();
            ps.close();
            conexion.close();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

}
