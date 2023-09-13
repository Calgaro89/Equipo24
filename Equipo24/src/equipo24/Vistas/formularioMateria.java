
package equipo24.vistas;

/**
 *
 * @author alberto
 */
public class formularioMateria extends javax.swing.JInternalFrame {

    
    public formularioMateria() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLcodigo = new javax.swing.JLabel();
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

        jLabel6.setText("jLabel6");

        jLcodigo.setText("Codigo");

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
                                .addComponent(jLcodigo)
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
                    .addComponent(jLcodigo)
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
       
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRadioBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLaño;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLmateria;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JRadioButton jRadioBestado;
    private javax.swing.JTextField jTexaño;
    private javax.swing.JTextField jTexcodigo;
    private javax.swing.JTextField jTexnombre;
    // End of variables declaration//GEN-END:variables
}
