/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;

/**
 *
 * @author Silvia
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jpOptions = new javax.swing.JPanel();
        jlOpciones = new javax.swing.JLabel();
        jpControls = new javax.swing.JPanel();
        jlControles = new javax.swing.JLabel();
        jpGame = new javax.swing.JPanel();
        jlJugar = new javax.swing.JLabel();
        jpGoOut = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpOptions.setBackground(new java.awt.Color(255, 51, 51));
        jpOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpOptionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpOptionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpOptionsMouseExited(evt);
            }
        });

        jlOpciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jlOpciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlOpciones.setText("PUNTUACIONES");

        javax.swing.GroupLayout jpOptionsLayout = new javax.swing.GroupLayout(jpOptions);
        jpOptions.setLayout(jpOptionsLayout);
        jpOptionsLayout.setHorizontalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jpOptionsLayout.setVerticalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel.add(jpOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 180, 50));

        jpControls.setBackground(new java.awt.Color(255, 51, 51));
        jpControls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpControlsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpControlsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpControlsMouseExited(evt);
            }
        });

        jlControles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlControles.setForeground(new java.awt.Color(255, 255, 255));
        jlControles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlControles.setText("CONTROLES");

        javax.swing.GroupLayout jpControlsLayout = new javax.swing.GroupLayout(jpControls);
        jpControls.setLayout(jpControlsLayout);
        jpControlsLayout.setHorizontalGroup(
            jpControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlControles, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jpControlsLayout.setVerticalGroup(
            jpControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlControles, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel.add(jpControls, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 180, 50));

        jpGame.setBackground(new java.awt.Color(255, 51, 51));
        jpGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpGameMouseExited(evt);
            }
        });

        jlJugar.setBackground(new java.awt.Color(255, 255, 255));
        jlJugar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlJugar.setForeground(new java.awt.Color(255, 255, 255));
        jlJugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlJugar.setText("JUGAR");

        javax.swing.GroupLayout jpGameLayout = new javax.swing.GroupLayout(jpGame);
        jpGame.setLayout(jpGameLayout);
        jpGameLayout.setHorizontalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jpGameLayout.setVerticalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel.add(jpGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, 50));

        jpGoOut.setBackground(new java.awt.Color(255, 51, 51));
        jpGoOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpGoOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpGoOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpGoOutMouseExited(evt);
            }
        });

        jlSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("SALIR");

        javax.swing.GroupLayout jpGoOutLayout = new javax.swing.GroupLayout(jpGoOut);
        jpGoOut.setLayout(jpGoOutLayout);
        jpGoOutLayout.setHorizontalGroup(
            jpGoOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jpGoOutLayout.setVerticalGroup(
            jpGoOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel.add(jpGoOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 180, 50));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/menu.png"))); // NOI18N
        jPanel.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGameMouseClicked
     
     Window.main(null);
     this.dispose();
        
    }//GEN-LAST:event_jpGameMouseClicked

    private void jpControlsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlsMouseClicked
     Controles control=new Controles();
     control.setVisible(true);
     control.setLocationRelativeTo(this);
     this.dispose();
    }//GEN-LAST:event_jpControlsMouseClicked

    private void jpOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOptionsMouseClicked
     Puntuacion puntuacion=new Puntuacion();
     puntuacion.setVisible(true);
     puntuacion.setLocationRelativeTo(this);
     this.dispose();
    }//GEN-LAST:event_jpOptionsMouseClicked

    private void jpGoOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGoOutMouseClicked
     System.exit(0);
    }//GEN-LAST:event_jpGoOutMouseClicked

    private void jpGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGameMouseEntered
        jpGame.setBackground(Color.BLACK);
        jpGame.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpGameMouseEntered

    private void jpGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGameMouseExited
        jpGame.setBackground(new Color(255, 51, 51));
        jpGame.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpGameMouseExited

    private void jpControlsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlsMouseEntered
        jpControls.setBackground(Color.BLACK);
        jpControls.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpControlsMouseEntered

    private void jpControlsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlsMouseExited
        jpControls.setBackground(new Color(255, 51, 51));
        jpControls.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpControlsMouseExited

    private void jpOptionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOptionsMouseEntered
        jpOptions.setBackground(Color.BLACK);
        jpOptions.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpOptionsMouseEntered

    private void jpOptionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOptionsMouseExited
        jpOptions.setBackground(new Color(255, 51, 51));
        jpOptions.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpOptionsMouseExited

    private void jpGoOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGoOutMouseEntered
        jpGoOut.setBackground(Color.BLACK);
        jpGoOut.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpGoOutMouseEntered

    private void jpGoOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGoOutMouseExited
        jpGoOut.setBackground(new Color(255, 51, 51));
        jpGoOut.setForeground(Color.WHITE);
    }//GEN-LAST:event_jpGoOutMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel jlControles;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlJugar;
    private javax.swing.JLabel jlOpciones;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JPanel jpControls;
    private javax.swing.JPanel jpGame;
    private javax.swing.JPanel jpGoOut;
    private javax.swing.JPanel jpOptions;
    // End of variables declaration//GEN-END:variables
}
