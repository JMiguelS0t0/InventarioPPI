package com.mycompany.gui;

import com.mycompany.modelo.Articulo;
import com.mycompany.reglas.ArticuloRegla;
/*------------------------------------*/
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Frm_Articulo extends javax.swing.JInternalFrame {

    public int ID;

    private ArticuloRegla regla;

    public ImageIcon cargarImagen(String rutaImagen) {
        ImageIcon img = new ImageIcon(rutaImagen);
        return img;

    }

    public Frm_Articulo() {
        initComponents();
        btnAgregar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_nuevo.png"));
        btnActualizar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_modificar.png"));
        btnBorrar.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/ic_eliminar.png"));
        lblProducto.setIcon(cargarImagen("src/main/java/com/mycompany/gui/Resources/Producto.png"));
        regla = new ArticuloRegla();
        regla = new ArticuloRegla();
        CargarTabla();
        regla = new ArticuloRegla();
        txtCantidad.setText("0");
    }

    private void CargarTabla() {
        String[] tit = {"ID", "Nombre", "Descripcion", "Valor", "Categoria", "Cantidad"};
        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Articulo> c = regla.ListarTodos();

        Object[][] m = new Object[c.size()][tit.length];

        for (int i = 0; i < c.size(); i++) {
            m[i][0] = c.get(i).getID();
            m[i][1] = c.get(i).getNombre();
            m[i][2] = c.get(i).getDescripcion();
            m[i][3] = c.get(i).getValor();
            m[i][4] = c.get(i).getCategoria();
            m[i][5] = c.get(i).getCantidad();
        }
        model.setDataVector(m, tit);
        tblTabla.setModel(model);
    }

    public void clean() {
        txtCantidad.setText("0");
        txtDescripcion.setText("");
        txtID.setText("");
        txtNombre.setText("");
        txtValor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        CbCategoria = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblProducto = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 204));
        setClosable(true);
        setResizable(true);
        setTitle("Productos");
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1049, 550));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1046, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1046, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(986, 458));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Fjalla One", 1, 24)); // NOI18N
        lblTitulo.setText("Registro de Productos");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblInformacion.setFont(new java.awt.Font("Fjalla One", 2, 14)); // NOI18N
        lblInformacion.setText("Llene la información respectiva para la entrada de los productos.");
        jPanel1.add(lblInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCodigo.setText("Código de Producto (ID) *");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 139, -1, -1));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 160, 169, 35));

        lblDescripcion.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripción *");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 139, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 672, 35));

        lblNombre.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblNombre.setText("Nombre*");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 77, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 98, 169, 35));

        lblCategoria.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria *");
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 77, -1, -1));

        CbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        CbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisa", "Pantalon", "Zapato", "Otros" }));
        jPanel1.add(CbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 30));

        lblCantidad.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setFocusable(false);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 169, 35));

        lblValor.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        lblValor.setText("Valor *");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 77, -1, -1));

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 98, 169, 35));

        lblProducto.setFocusable(false);
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 250, 140));

        btnActualizar.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Modificar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 438, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Eliminar");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 438, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Fjalla One", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Nuevo");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 438, -1, -1));

        tblTabla.setBackground(new java.awt.Color(255, 255, 255));
        tblTabla.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 201, 978, 225));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        int fila = tblTabla.rowAtPoint(evt.getPoint());
        if (fila >= 0) {
            txtID.setText(tblTabla.getValueAt(fila, 0).toString());
            txtNombre.setText(tblTabla.getValueAt(fila, 1).toString());
            txtDescripcion.setText(tblTabla.getValueAt(fila, 2).toString());
            txtValor.setText(tblTabla.getValueAt(fila, 3).toString());
            String categoria = tblTabla.getValueAt(fila, 4).toString();
            CbCategoria.setSelectedItem(categoria);
            txtCantidad.setText(tblTabla.getValueAt(fila, 5).toString());
        }
    }//GEN-LAST:event_tblTablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            int ID = Integer.parseInt(txtID.getText());
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            float valor = Float.parseFloat(txtValor.getText());
            String categoria = CbCategoria.getSelectedItem().toString();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            Articulo a = new Articulo(nombre, descripcion, valor, categoria, cantidad, ID);
            boolean actualizar = regla.Actualizar(a);
            if (actualizar) {
                JOptionPane.showMessageDialog(this, "Articulo actualizado correctamente.");
                CargarTabla();
                clean();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el artículo");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            int iD = Integer.parseInt(txtID.getText());
            int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el artículo?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                ArticuloRegla regla = new ArticuloRegla();
                regla.Eliminar(iD);
                JOptionPane.showMessageDialog(this, "Artículo eliminado correctamente");
                CargarTabla();
                clean();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el artículo");
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            String categoria = CbCategoria.getSelectedItem().toString();
            float valor = Float.parseFloat(txtValor.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            Articulo articulo = new Articulo(nombre, descripcion, valor, categoria, cantidad, ID);
            ArticuloRegla regla = new ArticuloRegla();
            boolean insertar = regla.insertar(articulo);
            if (insertar) {
                JOptionPane.showMessageDialog(this, "Articulo insertado correctamente.");
                CargarTabla();
                clean();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al insertar articulo.");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed


    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbCategoria;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
