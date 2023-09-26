package equipo24.vistas;

import equipo24.AccesoADatos.AlumnoData;
import equipo24.Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormularioALumno extends javax.swing.JInternalFrame {

    AlumnoData alumno = new AlumnoData();
    Alumno alum = new Alumno();

    public FormularioALumno() {
        initComponents();
        ImageIcon icono = new ImageIcon("/equipo24/recursos/fernet.png");
        setFrameIcon(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jdNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("DNI");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de naciemiento:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtDni))
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jbBuscar)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrEstado)
                                .addContainerGap(218, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {

            int dni = Integer.parseInt(jtDni.getText());
            Alumno alumno2 = alumno.buscarAlumnoPorDni(dni);

            if (alumno != null) {

                jtApellido.setText(alumno2.getApellido());
                jtNombre.setText(alumno2.getNombre());
                jrEstado.setSelected(alumno2.isEstado());

                LocalDate fechaNacimientoLocalDate = alumno2.getFechaNac();
                Date fechaNacimientoDate = Date.from(fechaNacimientoLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdNacimiento.setDate(fechaNacimientoDate);

            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, " No se permiten letras, simbolos y espacios en este campo ");
        } catch (NullPointerException np) {

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrEstado.setSelected(false);

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        String textDni = (jtDni.getText());

        try {
            if (!textDni.isEmpty()) {

                int dni = Integer.parseInt(textDni);

                alumno.eliminarAlumno(dni);

                jtDni.setText("");
                jtApellido.setText("");
                jtNombre.setText("");
                jrEstado.setSelected(false);

            } else {

                JOptionPane.showMessageDialog(null, " No hay alumno a eliminar");
            }
        } catch (NullPointerException np) {

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, " No se permiten letras, simbolos y espacios en este campo ");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private boolean cosoQueValida() {

        boolean validar = true;
        int dni = Integer.parseInt(jtDni.getText());

        for (Alumno alumno : alumno.listarAlumnos()) {

            if (dni == alumno.getDni()) {
                validar = false;
            }
        }
        return validar;
    }

    private int obtenerId() {

        String textDni = (jtDni.getText());
        int dni = Integer.parseInt(textDni);
        int id = 0;

        for (Alumno nomb : alumno.listarAlumnos()) {

            if (nomb.getDni() == dni) {

                id = nomb.getIdAlumno();

            }
        }

        return id;
    }


    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {
            String textDni = (jtDni.getText());
            String textApellido = (jtApellido.getText());
            String textNombre = (jtNombre.getText());

            LocalDate fechaNac = (jdNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            if (!textDni.isEmpty()) {
                if (cosoQueValida()) {
                    if (!textApellido.isEmpty() && !textNombre.isEmpty()) {

                        int dni = Integer.parseInt(textDni);
                        String apellido = textApellido;
                        String nom = textNombre;
                        LocalDate fecha = fechaNac;

                        alum.setDni(dni);
                        alum.setApellido(apellido);
                        alum.setNombre(nom);
                        alum.setEstado(jrEstado.isSelected());
                        alum.setFechaNac(fechaNac);

                        if (apellido.matches("^[a-zA-Z\\s]+$")) {
                            if (nom.matches("^[a-zA-Z\\s]+$")) {

                                alumno.guardarAlumno(alum);

                            } else {
                                JOptionPane.showMessageDialog(null, " solo letras en nombre ");

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, " solo letras en apellido ");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, " Apellido y nombre vacios ");
                    }

                } else {

                    System.out.println(cosoQueValida());

                    if (!cosoQueValida()) {
                        System.out.println(" entre 1");
                        if (!textApellido.isEmpty() && !textNombre.isEmpty()) {
                            System.out.println(" entre 2");

                            int dni = Integer.parseInt(textDni);
                            String apellido = textApellido;
                            String nom = textNombre;
                            LocalDate fecha = fechaNac;

                            alum.setIdAlumno(obtenerId());
                            alum.setDni(dni);
                            alum.setApellido(apellido);
                            alum.setNombre(nom);
                            alum.setEstado(jrEstado.isSelected());
                            alum.setFechaNac(fechaNac);

                            if (apellido.matches("^[a-zA-Z\\s]+$")) {
                                if (nom.matches("^[a-zA-Z\\s]+$")) {

                                    alumno.modificarAlumno(alum);

                                    System.out.println(" entre 3");
                                } else {
                                    JOptionPane.showMessageDialog(null, " solo letras en nombre ");

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, " solo letras en apellido ");

                            }

                        } else {

                            JOptionPane.showMessageDialog(null, " Apellido y nombre vacios ");
                        }
                    }

                }

            } else {

                JOptionPane.showMessageDialog(null, " Falta el DNI ");
            }

        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Falta completar algun campo ");

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, " no se aceptan letras en el campo dni ");
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdNacimiento;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

}
