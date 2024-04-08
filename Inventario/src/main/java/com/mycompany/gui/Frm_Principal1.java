package com.mycompany.gui;

import com.mycompany.reglas.ArticuloRegla;
/*-------------------------------------*/
import com.mycompany.Conexion.Conexion;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Frm_Principal1 extends javax.swing.JFrame {

    public ImageIcon cargarImagen(String rutaImagen) {
        ImageIcon img = new ImageIcon(rutaImagen);
        return img;
    }

    public Frm_Principal1() {
        initComponents();
        btnProductos.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/paquete.png"));
        btnSalidas.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/venta.png"));
        btnEntradas.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/entrar.png"));
        lblFondo.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Fondo.png"));
        lblIcono.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Logo.png"));
        lblTitulo.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Titulo.png"));
        lblMenu.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/MPrincipal.png"));
    }

    private void cerrarFrame() {
        JInternalFrame[] frames = contenedor.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        contenedor = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setFocusable(false);
        jPanel1.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, 40));

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Fjalla One", 0, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setText("    Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 194, 50));

        btnEntradas.setBackground(new java.awt.Color(255, 255, 255));
        btnEntradas.setFont(new java.awt.Font("Fjalla One", 0, 18)); // NOI18N
        btnEntradas.setForeground(new java.awt.Color(0, 0, 0));
        btnEntradas.setText("    Entradas");
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 194, 50));

        btnSalidas.setBackground(new java.awt.Color(255, 255, 255));
        btnSalidas.setFont(new java.awt.Font("Fjalla One", 0, 18)); // NOI18N
        btnSalidas.setForeground(new java.awt.Color(0, 0, 0));
        btnSalidas.setText("    Salidas");
        btnSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 194, 50));

        lblIcono.setFocusable(false);
        jPanel1.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 160));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFocusable(false);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 1034, 70));

        contenedor.setBackground(new java.awt.Color(0, 102, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1046, 500));
        contenedor.setMinimumSize(new java.awt.Dimension(1046, 500));
        contenedor.setPreferredSize(new java.awt.Dimension(1040, 550));

        lblFondo.setFocusable(false);

        contenedor.setLayer(lblFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 99, 1046, 552));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        cerrarFrame();

        Frm_Articulo f = new Frm_Articulo();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        cerrarFrame();
        Frm_Entrada f = new Frm_Entrada();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        cerrarFrame();
        Frm_Salidas f = new Frm_Salidas();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_btnSalidasActionPerformed

    public static void main(String[] args) {

        Connection con = Conexion.GetConnection();

        ArticuloRegla articulo = new ArticuloRegla();

        Frm_Principal1 frm = new Frm_Principal1();
        frm.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalidas;
    public static javax.swing.JDesktopPane contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
