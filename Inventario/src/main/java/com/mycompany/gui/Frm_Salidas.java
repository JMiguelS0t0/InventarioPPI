package com.mycompany.gui;

import com.mycompany.modelo.Salida;
import com.mycompany.reglas.SalidaRegla;

/*------------------------------------*/
import java.util.ArrayList;
import java.util.Date;
import com.toedter.calendar.JCalendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_Salidas extends javax.swing.JInternalFrame {

    private int factura;

    private SalidaRegla regla;

    public ImageIcon cargarImagen(String rutaImagen) {
        ImageIcon img = new ImageIcon(rutaImagen);
        return img;
    }

    public Frm_Salidas() {
        initComponents();
        btnRegistrar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_nuevo.png"));
        btnBorrar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_eliminar.png"));
        lblSalida.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Salida.png"));
        regla = new SalidaRegla();
        CargarTabla();
        CargarCombobox();
    }

    public class MiFrame extends JFrame {

        private JCalendar calendario;

        public MiFrame() {
            calendario = new JCalendar();
            getContentPane().add(calendario);
            pack();
            setVisible(true);
        }
    }

    private void CargarTabla() {
        String[] tit = {"Factura", "Fecha", "Cantidad", "Articulo", "TelefonoC"};
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Salida> c = regla.ListarTodos();

        Object[][] m = new Object[c.size()][tit.length];

        for (int i = 0; i < c.size(); i++) {
            m[i][0] = c.get(i).getFactura();
            m[i][1] = c.get(i).getFecha();
            m[i][2] = c.get(i).getCantidad();
            m[i][3] = c.get(i).getArticulo();
            m[i][4] = c.get(i).getTelefonoC();
        }

        model.setDataVector(m, tit);
        tblTabla.setModel(model);
    }

    private void CargarCombobox() {
        SalidaRegla regla = new SalidaRegla();
        ArrayList<String> nombres = regla.NombresCB();
        for (String nombreArticulo : nombres) {
            cbLista.addItem(nombreArticulo);
        }
    }

    public void clean() {
        txtCantidad.setText("");
        txtFactura.setText("");
        txtTelefonoC.setText("");
        CalFecha.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        CalFecha = new com.toedter.calendar.JDateChooser();
        lblCodigo = new javax.swing.JLabel();
        cbLista = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefonoC = new javax.swing.JTextField();
        lblSalida = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 204));
        setClosable(true);
        setResizable(true);
        setTitle("Salidas");
        setFocusCycleRoot(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1046, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1046, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1046, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Fjalla One", 1, 24)); // NOI18N
        lblTitulo.setText("Salida de Productos");
        lblTitulo.setFocusable(false);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 46, -1, -1));

        lblInformacion.setFont(new java.awt.Font("Fjalla One", 2, 14)); // NOI18N
        lblInformacion.setText("Llene la información respectiva para la salida de los productos.");
        lblInformacion.setFocusable(false);
        jPanel1.add(lblInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, -1, -1));

        lblFactura.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblFactura.setText("Número de Factura *");
        lblFactura.setFocusable(false);
        jPanel1.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 101, -1, -1));

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFactura.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 122, 129, 35));

        lblFecha.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblFecha.setText("Fecha *");
        lblFecha.setFocusable(false);
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 101, -1, -1));

        CalFecha.setBackground(new java.awt.Color(255, 255, 255));
        CalFecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(CalFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 40));

        lblCodigo.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCodigo.setText("Código del Producto *");
        lblCodigo.setFocusable(false);
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 168, -1, -1));

        cbLista.setBackground(new java.awt.Color(255, 255, 255));
        cbLista.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbLista.setForeground(new java.awt.Color(0, 0, 0));
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });
        jPanel1.add(cbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 189, 137, 42));

        lblCantidad.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad *");
        lblCantidad.setFocusable(false);
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 101, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 122, 113, 35));

        lblTelefono.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblTelefono.setText("Telefono Cliente*");
        lblTelefono.setFocusable(false);
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        txtTelefonoC.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefonoC.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefonoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 200, 35));

        lblSalida.setFocusable(false);
        jPanel1.add(lblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 250, 140));

        btnRegistrar.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar Salida");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar Salida");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 243, 990, 176));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            String factura = txtFactura.getText();
            int idSalida = Integer.parseInt(factura);
            int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la salida?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                SalidaRegla regla = new SalidaRegla();
                regla.Eliminar(idSalida);
                JOptionPane.showMessageDialog(this, "Salida eliminada correctamente.");
                CargarTabla();
                clean();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la salida");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Date fecha = CalFecha.getDate();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String articulo = cbLista.getSelectedItem().toString();
            String telefonoC = txtTelefonoC.getText();
            Salida salida = new Salida(fecha, cantidad, articulo, telefonoC, factura);
            SalidaRegla regla = new SalidaRegla();
            if (regla.Insertar(salida)) {
                JOptionPane.showMessageDialog(this, "Salida registrada correctamente");
                CargarTabla();
                clean();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese los datos correctamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la salida");
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
            txtTelefonoC.setText(tblTabla.getValueAt(fila, 4).toString());

        }
    }//GEN-LAST:event_tblTablaMouseClicked

    private void txtTelefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCActionPerformed

    }//GEN-LAST:event_txtTelefonoCActionPerformed

    private void cbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaActionPerformed


    }//GEN-LAST:event_cbListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalFecha;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblTabla;
    public static javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFactura;
    public static javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}
