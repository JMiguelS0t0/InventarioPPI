package com.mycompany.gui;

import com.mycompany.modelo.Entrada;
import com.mycompany.reglas.EntradaRegla;
/*-------------------------------*/
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Frm_Entrada extends javax.swing.JInternalFrame {

    private int factura;

    private EntradaRegla regla;

    public ImageIcon cargarImagen(String rutaImagen) {
        ImageIcon img = new ImageIcon(rutaImagen);
        return img;
    }

    public Frm_Entrada() {
        initComponents();
        btnRegistrar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_nuevo.png"));
        btnBorrar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_eliminar.png"));
        lblEntrada.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Entrada.png"));
        regla = new EntradaRegla();
        CargarTabla();
        CargarCombobox();

    }

    private void CargarTabla() {
        String[] tit = {"Factura", "Fecha", "Cantidad", "Articulo"};
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Entrada> c = regla.ListarTodos();

        Object[][] m = new Object[c.size()][tit.length];

        for (int i = 0; i < c.size(); i++) {
            m[i][0] = c.get(i).getFactura();
            m[i][1] = c.get(i).getFecha();
            m[i][2] = c.get(i).getCantidad();
            m[i][3] = c.get(i).getArticulo();
        }
        model.setDataVector(m, tit);
        tblTabla.setModel(model);
    }

    private void CargarCombobox() {
        EntradaRegla regla = new EntradaRegla();
        cbLista.removeAllItems();
        ArrayList<String> nombres = regla.NombresCB();
        for (String nombreArticulo : nombres) {
            cbLista.addItem(nombreArticulo);
        }
    }

    public void clean() {
        txtCantidad.setText("");
        txtFactura.setText("");
        CalFecha.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        CalFecha = new com.toedter.calendar.JDateChooser();
        lblProducto = new javax.swing.JLabel();
        cbLista = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblEntrada = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 204));
        setClosable(true);
        setResizable(true);
        setTitle("Entrada");
        setToolTipText("");

        Pnl1.setBackground(new java.awt.Color(0, 102, 204));
        Pnl1.setFocusable(false);
        Pnl1.setMaximumSize(new java.awt.Dimension(1046, 500));
        Pnl1.setMinimumSize(new java.awt.Dimension(1046, 500));
        Pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Fjalla One", 1, 24)); // NOI18N
        lblTitulo.setText("Entrada de Productos");
        lblTitulo.setFocusable(false);
        Pnl1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblInformacion.setFont(new java.awt.Font("Fjalla One", 2, 14)); // NOI18N
        lblInformacion.setText("Llene la información respectiva para la entrada de los productos.");
        lblInformacion.setFocusable(false);
        Pnl1.add(lblInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblFactura.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblFactura.setText("Número de Factura *");
        lblFactura.setFocusable(false);
        Pnl1.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 106, -1, -1));

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtFactura.setForeground(new java.awt.Color(0, 0, 0));
        Pnl1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 127, 129, 35));

        lblFecha.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblFecha.setText("Fecha *");
        lblFecha.setFocusable(false);
        Pnl1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 106, -1, -1));

        CalFecha.setBackground(new java.awt.Color(255, 255, 255));
        CalFecha.setDateFormatString("yyyy/MM/dd");
        Pnl1.add(CalFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 140, 30));

        lblProducto.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblProducto.setText("Producto *");
        lblProducto.setFocusable(false);
        Pnl1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 168, -1, -1));

        cbLista.setBackground(new java.awt.Color(255, 255, 255));
        cbLista.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbLista.setForeground(new java.awt.Color(0, 0, 0));
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });
        Pnl1.add(cbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 189, 137, 42));

        lblCantidad.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad *");
        lblCantidad.setFocusable(false);
        Pnl1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 106, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        Pnl1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 127, 113, 35));

        lblEntrada.setFocusable(false);
        Pnl1.add(lblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 250, 140));

        btnRegistrar.setFont(new java.awt.Font("Fjalla One", 0, 15)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar Entrada");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        Pnl1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Fjalla One", 0, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar Entrada");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        Pnl1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        tblTabla.setBackground(new java.awt.Color(255, 255, 255));
        tblTabla.setForeground(new java.awt.Color(0, 0, 0));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        Pnl1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 980, 176));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Date fecha = CalFecha.getDate();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String articulo = cbLista.getSelectedItem().toString();
            Entrada entrada = new Entrada(fecha, cantidad, articulo, factura);
            EntradaRegla regla = new EntradaRegla();
            if (regla.Insertar(entrada)) {
                JOptionPane.showMessageDialog(this, "Entrada registrada correctamente");
                CargarTabla();
                clean();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese los datos correctamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la entrada");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        int fila = tblTabla.rowAtPoint(evt.getPoint());
        if (fila >= 0) {
            txtFactura.setText(tblTabla.getValueAt(fila, 0).toString());
            Date fecha = (Date) tblTabla.getValueAt(fila, 1);
            CalFecha.setDate(fecha);
            txtCantidad.setText(tblTabla.getValueAt(fila, 2).toString());
            String nombreArticulo = tblTabla.getValueAt(fila, 3).toString();
            cbLista.setSelectedItem(nombreArticulo);
        }
    }//GEN-LAST:event_tblTablaMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        try {
            String factura = txtFactura.getText();
            int idEntrada = Integer.parseInt(factura);

            int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la entrada?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                EntradaRegla regla = new EntradaRegla();
                regla.Eliminar(idEntrada);
                JOptionPane.showMessageDialog(this, "Entrada eliminada correctamente.");
                CargarTabla();
                clean();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la entrada");
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaActionPerformed


    }//GEN-LAST:event_cbListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalFecha;
    private javax.swing.JPanel Pnl1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblTabla;
    public static javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFactura;
    // End of variables declaration//GEN-END:variables
}
