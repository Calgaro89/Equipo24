package equipo24.vistas;

import equipo24.AccesoADatos.MateriaData;
import equipo24.Entidades.Materia;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class formularioMateria extends javax.swing.JInternalFrame {

    private MateriaData materiaData;
    private Materia materiaActual;

    public formularioMateria() {
        initComponents();
        materiaData = new MateriaData();
        materiaActual = new Materia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLid = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLaño = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jLmateria = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jTexcodigo = new javax.swing.JTextField();
        jTexaño = new javax.swing.JTextField();
        jTexnombre = new javax.swing.JTextField();
        jRadioBestado = new javax.swing.JRadioButton();

        jLid.setText("idMateria");

        jLnombre.setText("Nombre");

        jLaño.setText("Año");

        jLestado.setText("Estado");

        jLmateria.setText("Materia");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jRadioBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLaño)
                                    .addComponent(jLestado)
                                    .addComponent(jLnombre))
                                .addGap(38, 38, 38)
                                .addComponent(jRadioBestado)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBguardar))
                            .addComponent(jTexcodigo)
                            .addComponent(jTexnombre)
                            .addComponent(jTexaño, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jBsalir)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLmateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLid)
                    .addComponent(jBbuscar)
                    .addComponent(jTexcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaño)
                    .addComponent(jTexaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestado)
                    .addComponent(jRadioBestado))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBsalir)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        String codigoText = jTexcodigo.getText();

        if (!codigoText.isEmpty()) {
            try {
                int codigo = Integer.parseInt(codigoText);
                materiaActual = materiaData.buscarMateria(codigo);

                if (materiaActual != null) {
                    jTexnombre.setText(materiaActual.getNombre());
                    jTexaño.setText(String.valueOf(materiaActual.getAniomateria()));
                    jRadioBestado.setSelected(materiaActual.isEstado());
                } else {
                    JOptionPane.showMessageDialog(this, "Materia no encontrada");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingresa un valor numérico válido en el campo idMateria.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo idMateria no puede estar vacío.");
        }


    }//GEN-LAST:event_jBbuscarActionPerformed


    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed

        materiaActual = new Materia();

        jTexcodigo.setText("");
        jTexnombre.setText("");
        jTexaño.setText("");
        jRadioBestado.setSelected(false);

    }//GEN-LAST:event_jBnuevoActionPerformed


    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        if (materiaActual != null) {
            int idMateriaEliminar = materiaActual.getIdMateria();

            materiaData.eliminarMateria(idMateriaEliminar);

            jTexcodigo.setText("");
            jTexnombre.setText("");
            jTexaño.setText("");
            jRadioBestado.setSelected(false);

            materiaActual = null;
        } else {

            JOptionPane.showMessageDialog(this, "No hay materia para eliminar");
    }//GEN-LAST:event_jBeliminarActionPerformed
    }


    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed

        String nombreText = jTexnombre.getText();
        String anioText = jTexaño.getText();
        String idText = jTexcodigo.getText();

        if (idText.isEmpty()) {

            if (!nombreText.isEmpty() && !anioText.isEmpty()) {
                try {
                    String nom = nombreText;
                    int anio = Integer.parseInt(anioText);

                    materiaActual.setNombre(nom);
                    materiaActual.setAniomateria(anio);
                    materiaActual.setEstado(jRadioBestado.isSelected());

                    materiaData.guardarMateria(materiaActual);
                    materiaData.guardarMateriaDos(materiaActual);

                    JOptionPane.showMessageDialog(this, "Materia guardada con éxito");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingresa valores numéricos válidos en el campo Año.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Los campos nombre y Año no pueden estar vacíos.");
            }

        } else {
            
            if (!nombreText.isEmpty() && !anioText.isEmpty()) {
                try {
                    String nom = nombreText;
                    int anio = Integer.parseInt(anioText);

                    materiaActual.setNombre(nom);
                    materiaActual.setAniomateria(anio);
                    materiaActual.setEstado(jRadioBestado.isSelected());

                    materiaData.modificarMateria(materiaActual);

                    JOptionPane.showMessageDialog(this, "Materia actualizada con éxito");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingresa valores numéricos válidos en el campo Año.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Los campos nombre y Año no pueden estar vacíos.");
            }
            
            
            
            
        }


    }//GEN-LAST:event_jBguardarActionPerformed


    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed


    private void jRadioBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBestadoActionPerformed

        System.out.println("");
    }//GEN-LAST:event_jRadioBestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLaño;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLmateria;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JRadioButton jRadioBestado;
    private javax.swing.JTextField jTexaño;
    private javax.swing.JTextField jTexcodigo;
    private javax.swing.JTextField jTexnombre;
    // End of variables declaration//GEN-END:variables
}
