/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo24.vistas;

/**
 *
 * @author alberto
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumnos = new javax.swing.JMenu();
        jFormularioDeAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jFormularioDeMateria = new javax.swing.JMenuItem();
        jMenuAdministraciones = new javax.swing.JMenu();
        jManejoDeInscripciones = new javax.swing.JMenuItem();
        jManipulacionDeNotas = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jAlumnos = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jMenuAlumnos.setText("Alumno");

        jFormularioDeAlumno.setText("Formulario de Alumno");
        jFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumnos.add(jFormularioDeAlumno);

        jMenuBar1.add(jMenuAlumnos);

        jMenuMateria.setText("Materia");

        jFormularioDeMateria.setText("Formulario de Materia");
        jFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioDeMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jFormularioDeMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministraciones.setText("Administracion");

        jManejoDeInscripciones.setText("Manejo de Inscripciones");
        jManejoDeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoDeInscripcionesActionPerformed(evt);
            }
        });
        jMenuAdministraciones.add(jManejoDeInscripciones);

        jManipulacionDeNotas.setText("Manipulacion de Notas");
        jManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenuAdministraciones.add(jManipulacionDeNotas);

        jMenuBar1.add(jMenuAdministraciones);

        jMenuConsultas.setText("Consultas");

        jAlumnos.setText("Alumnos");
        jAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jAlumnos);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jSalir);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioDeAlumnoActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioALumno alum= new FormularioALumno();
        alum.setVisible(true);
        jEscritorio.add(alum);
        jEscritorio.moveToFront(alum);
    }//GEN-LAST:event_jFormularioDeAlumnoActionPerformed

    private void jManejoDeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoDeInscripcionesActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        formularioInscripcion ins= new formularioInscripcion();
        ins.setVisible(true);
        jEscritorio.add(ins);
        jEscritorio.moveToFront(ins);
    }//GEN-LAST:event_jManejoDeInscripcionesActionPerformed

    private void jAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
       consulta alumno= new consulta();
        alumno.setVisible(true);
        jEscritorio.add(alumno);
        jEscritorio.moveToFront(alumno);
    }//GEN-LAST:event_jAlumnosActionPerformed

    private void jFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioDeMateriaActionPerformed
       jEscritorio.removeAll();
        jEscritorio.repaint();
        formularioMateria mat= new formularioMateria();
        mat.setVisible(true);
        jEscritorio.add(mat);
        jEscritorio.moveToFront(mat);
    }//GEN-LAST:event_jFormularioDeMateriaActionPerformed

    private void jManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManipulacionDeNotasActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        cargaNotas nota= new cargaNotas();
        nota.setVisible(true);
        jEscritorio.add(nota);
        jEscritorio.moveToFront(nota);
    }//GEN-LAST:event_jManipulacionDeNotasActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(WIDTH); 
    }//GEN-LAST:event_jSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAlumnos;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jFormularioDeAlumno;
    private javax.swing.JMenuItem jFormularioDeMateria;
    private javax.swing.JMenuItem jManejoDeInscripciones;
    private javax.swing.JMenuItem jManipulacionDeNotas;
    private javax.swing.JMenu jMenuAdministraciones;
    private javax.swing.JMenu jMenuAlumnos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jSalir;
    // End of variables declaration//GEN-END:variables
}
