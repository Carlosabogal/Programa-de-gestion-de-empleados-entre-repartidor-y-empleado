package javaapplication42;

import Models.Comercial;
import Models.Empleado;
import Models.Repartidor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmPrincipal extends javax.swing.JFrame {

    DefaultTableModel modelo = null;
    trabajonotascurso.Conexion cc = null;
    Connection cn = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    PreparedStatement ps = null;
    PreparedStatement ps1 = null;
    static List<Comercial> listaComercial = new ArrayList<Comercial>();
    static List<Repartidor> listaRepartidor = new ArrayList<Repartidor>();

    public frmPrincipal() {
        initComponents();
        cboZona.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        cboEmpresa = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        cboZona = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtComision = new javax.swing.JTextField();
        btoEliminar = new javax.swing.JButton();
        btoModificar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Salario");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cboEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comercial", "Repartidor" }));
        cboEmpresa.setOpaque(false);
        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Salario", "Bonificacion", "Comision"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla1);

        jLabel4.setText("Tipos De Empleado");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        cboZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "zona 1", "zona 2", "zona 3", "zona 4" }));
        cboZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboZonaActionPerformed(evt);
            }
        });

        jLabel5.setText("Comision");

        btoEliminar.setText("Eliminar");
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });

        btoModificar.setText("Modificar");
        btoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboZona, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnListar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btoEliminar)
                    .addComponent(jLabel4)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btoModificar)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cboZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        // TODO add your handling code here:

        txtEdad.setEnabled(true);
        txtNombre.setEnabled(true);
        txtSalario.setEnabled(true);
        cboEmpresa.setEnabled(true);
        txtComision.setEnabled(true);

        int fila = Tabla1.getSelectedRow();
        txtEdad.setText(String.valueOf(Tabla1.getValueAt(fila, 1)));
        txtNombre.setText(String.valueOf(Tabla1.getValueAt(fila, 0)));
        txtSalario.setText(String.valueOf(Tabla1.getValueAt(fila, 2)));
        cboEmpresa.setSelectedItem(String.valueOf(Tabla1.getValueAt(fila, 3)));
        txtComision.setText(String.valueOf(Tabla1.getValueAt(fila, 4)));


    }//GEN-LAST:event_Tabla1MouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:

        modelo = (DefaultTableModel) Tabla1.getModel();

        String opcion = cboEmpresa.getSelectedItem().toString();
        if (opcion.equals("Comercial")) {
            cboZona.setVisible(false);
            txtComision.setVisible(true);
            JTableHeader head = Tabla1.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(4);
            tabCM.setHeaderValue("Comision");
            Tabla1.repaint();

            modelo.setRowCount(0);
            Object[] object = new Object[5];
            for (int i = 0; i < listaComercial.size(); i++) {
                object[0] = listaComercial.get(i).getNombre();
                object[1] = listaComercial.get(i).getEdad();
                object[4] = listaComercial.get(i).getComision();
                object[3] = listaComercial.get(i).getBonificacion();
                object[2] = listaComercial.get(i).getSalario();
                modelo.addRow(object);

            }
        } else if (opcion.equals("Repartidor")) {
            cboZona.setVisible(true);
            txtComision.setVisible(false);

            JTableHeader head = Tabla1.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(4);
            tabCM.setHeaderValue("Zona");
            Tabla1.repaint();
            modelo.setRowCount(0);
            Object[] object = new Object[5];
            for (int i = 0; i < listaRepartidor.size(); i++) {

                object[0] = listaRepartidor.get(i).getNombre();
                object[1] = listaRepartidor.get(i).getEdad();
                object[2] = listaRepartidor.get(i).getSalario();
                object[3] = listaRepartidor.get(i).getBonificacion();
                object[4] = listaRepartidor.get(i).getZona();
                modelo.addRow(object);

            }

        }


    }//GEN-LAST:event_btnListarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String opcion = cboEmpresa.getSelectedItem().toString();
        if (opcion.equals("Comercial")) {
            Comercial comercial = new Comercial(Integer.parseInt(txtComision.getText()), txtNombre.getText(), Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtSalario.getText()), 0);
            comercial.AsignarBonificacion();
            listaComercial.add(comercial);
            cboZona.setVisible(false);
            if (comercial.getBonificacion() == 150000) {
                JOptionPane.showMessageDialog(null, "La bonificacion del comercial se aplico con exito");
            }
        } else if (opcion.equals("Repartidor")) {

            Repartidor repartidor = new Repartidor(cboZona.getSelectedItem().toString(), txtNombre.getText(), Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtSalario.getText()), 0);
            repartidor.AsignarBonificacion();
            listaRepartidor.add(repartidor);
            if (repartidor.getBonificacion() == 150000) {
                JOptionPane.showMessageDialog(null, "La bonificacion del repartidor se aplico con exito");
            }

        }

        JOptionPane.showMessageDialog(null, "Empleado añadido correctamente");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboZonaActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        // TODO add your handling code here:
        int fila = Tabla1.getSelectedRow();
        String opcion = cboEmpresa.getSelectedItem().toString();
        if (opcion.equals("Comercial")) {

            if (fila >= 0) {
                listaComercial.remove(fila);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccionar fila");
            }
        } else if (opcion.equals("Repartidor")) {
            if (fila >= 0) {
                listaRepartidor.remove(fila);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccionar fila");
            }

        }

    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModificarActionPerformed
   int fila = Tabla1.getSelectedRow();
      String opcion = cboEmpresa.getSelectedItem().toString();
      if (opcion.equals("Comercial")) {
        if (fila >= 0) {
                Comercial comercial = listaComercial.get(fila);
                comercial.setEdad(Integer.parseInt(txtEdad.getText()));
                comercial.setNombre(txtNombre.getText());
                comercial.setSalario(Integer.parseInt(txtSalario.getText()));
                comercial.setComision(Integer.parseInt(txtComision.getText()));
                comercial.AsignarBonificacion();
                JOptionPane.showMessageDialog(null, "Empleado actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccionar fila");
            }
      }else if (opcion.equals("Repartidor")) {
            if (fila >= 0) {
                Repartidor repartidor = listaRepartidor.get(fila);
                repartidor.setEdad(Integer.parseInt(txtEdad.getText()));
                repartidor.setNombre(txtNombre.getText());
                repartidor.setSalario(Integer.parseInt(txtSalario.getText()));
                repartidor.setZona(cboZona.getSelectedItem().toString());
                repartidor.AsignarBonificacion();
                JOptionPane.showMessageDialog(null, "Empleado actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccionar fila");
            }

        }
      

    }//GEN-LAST:event_btoModificarActionPerformed

    public static List<Comercial> ListarComercial() {

        List<Comercial> lista = new ArrayList<Comercial>();
        lista.add(new Comercial(130000, "paolo", 26, 150000, 10000));
        lista.add(new Comercial(121300, "juancho", 30, 1501100, 100000));
        lista.add(new Comercial(1500000, "Kakaroto", 16, 320000, 12000));
        lista.add(new Comercial(430000, "Pablo", 40, 310000, 210000));

        return lista;

    }

    public static List<Repartidor> ListarRepartidor() {

        List<Repartidor> lista = new ArrayList<Repartidor>();
        lista.add(new Repartidor("zona 1", "pepe", 16, 250000, 10000));
        lista.add(new Repartidor("zona 2", "juaneso", 52, 501100, 100000));
        lista.add(new Repartidor("zona 3", "Vegeta", 26, 4320000, 12000));
        lista.add(new Repartidor("Zona 4", "Po", 30, 140000, 210000));

        return lista;

    }

    public static void main(String args[]) {

        listaComercial = ListarComercial();
        listaRepartidor = ListarRepartidor();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoModificar;
    private javax.swing.JComboBox<String> cboEmpresa;
    private javax.swing.JComboBox<String> cboZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
