
package equipo24.vistas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

public class menuPrincipal extends javax.swing.JFrame {
   private ImageIcon icono = new ImageIcon(getClass().getResource("/equipo24/recursos/fernet.png"));

    public menuPrincipal() {
        initComponents();
        jCheck.setSelected(false);
       setIconImage(new ImageIcon(getClass().getResource("/equipo24/recursos/fernet.png")).getImage());
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jLogoUlp = new javax.swing.JLabel();
        jLogoGob = new javax.swing.JLabel();
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
        jColor = new javax.swing.JMenu();
        jCheck = new javax.swing.JCheckBoxMenuItem();
        jAbout = new javax.swing.JMenu();
        jAcercaDe = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad de La Punta");
        setResizable(false);

        Color fondo = new Color(0,0,100);
        jEscritorio.setBackground(fondo);

        jLogoUlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/logo-ulp.png"))); // NOI18N

        jLogoGob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/logo-gob.png"))); // NOI18N

        jEscritorio.setLayer(jLogoUlp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLogoGob, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogoUlp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jLogoGob, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLogoUlp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLogoGob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Alumnos.png"))); // NOI18N
        jMenuAlumnos.setText("Alumnos");
        jMenuAlumnos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jFormularioDeAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jFormularioDeAlumno.setText("Formulario de Alumno");
        jFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumnos.add(jFormularioDeAlumno);

        jMenuBar1.add(jMenuAlumnos);

        jMenuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Materias.png"))); // NOI18N
        jMenuMateria.setText("Materias");
        jMenuMateria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jFormularioDeMateria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jFormularioDeMateria.setText("Formulario de Materia");
        jFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioDeMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jFormularioDeMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Administracion.png"))); // NOI18N
        jMenuAdministraciones.setText("Administracion");
        jMenuAdministraciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jManejoDeInscripciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jManejoDeInscripciones.setText("Manejo de Inscripciones");
        jManejoDeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoDeInscripcionesActionPerformed(evt);
            }
        });
        jMenuAdministraciones.add(jManejoDeInscripciones);

        jManipulacionDeNotas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jManipulacionDeNotas.setText("Manipulacion de Notas");
        jManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenuAdministraciones.add(jManipulacionDeNotas);

        jMenuBar1.add(jMenuAdministraciones);

        jMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Consultas.png"))); // NOI18N
        jMenuConsultas.setText("Consultas");
        jMenuConsultas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jAlumnos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jAlumnos.setText("Alumnos");
        jAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jAlumnos);

        jMenuBar1.add(jMenuConsultas);

        jColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Colores.png"))); // NOI18N
        jColor.setText("Colores");
        jColor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jCheck.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheck.setSelected(true);
        jCheck.setText("Modo Oscuro");
        jCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckItemStateChanged(evt);
            }
        });
        jColor.add(jCheck);

        jMenuBar1.add(jColor);

        jAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/About.png"))); // NOI18N
        jAbout.setText("About");

        jAcercaDe.setText("Acerca De");
        jAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcercaDeActionPerformed(evt);
            }
        });
        jAbout.add(jAcercaDe);

        jMenuBar1.add(jAbout);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo24/recursos/Salir.png"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        alum.setFrameIcon(icono);
        alum.setVisible(true);
        jEscritorio.add(alum);
        jEscritorio.moveToFront(alum);
    }//GEN-LAST:event_jFormularioDeAlumnoActionPerformed

    private void jManejoDeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoDeInscripcionesActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        formularioInscripcion ins= new formularioInscripcion();
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        ins.setFrameIcon(icono);
        ins.setVisible(true);
        jEscritorio.add(ins);
        jEscritorio.moveToFront(ins);
    }//GEN-LAST:event_jManejoDeInscripcionesActionPerformed

    private void jAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
       consulta alumno= new consulta();
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        alumno.setFrameIcon(icono);
        alumno.setVisible(true);
        jEscritorio.add(alumno);
        jEscritorio.moveToFront(alumno);
    }//GEN-LAST:event_jAlumnosActionPerformed

    private void jFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioDeMateriaActionPerformed
       jEscritorio.removeAll();
        jEscritorio.repaint();
        formularioMateria mat= new formularioMateria();
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        mat.setFrameIcon(icono);
        mat.setVisible(true);
        jEscritorio.add(mat);
        jEscritorio.moveToFront(mat);
    }//GEN-LAST:event_jFormularioDeMateriaActionPerformed

    private void jManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManipulacionDeNotasActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        cargaNotas nota= new cargaNotas();
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        nota.setFrameIcon(icono);
        nota.setVisible(true);
        jEscritorio.add(nota);
        jEscritorio.moveToFront(nota);
    }//GEN-LAST:event_jManipulacionDeNotasActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jSalirActionPerformed

    private void jCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckItemStateChanged
       jCheck.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (jCheck.isSelected()) {
//                 Cambiar al Look and Feel deseado cuando se selecciona
                try {
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                    javax.swing.SwingUtilities.updateComponentTreeUI(menuPrincipal.this);
                    Color color = new Color(52,55,59);
                    jEscritorio.setBackground(color);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                   
                }
            } else {
//                 Cambiar al Look and Feel predeterminado cuando se deselecciona
                try {
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    Color fondo = new Color(0,0,100);
                    jEscritorio.setBackground(fondo);
                    javax.swing.SwingUtilities.updateComponentTreeUI(menuPrincipal.this);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    }//GEN-LAST:event_jCheckItemStateChanged

    private void jAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcercaDeActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        About about = new About();
        jEscritorio.add(jLogoUlp);
        jEscritorio.add(jLogoGob);
        about.setFrameIcon(icono);
        about.setVisible(true);
        jEscritorio.add(about);
        jEscritorio.moveToFront(about);
    }//GEN-LAST:event_jAcercaDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
               javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

           java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new menuPrincipal().setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAbout;
    private javax.swing.JMenuItem jAcercaDe;
    private javax.swing.JMenuItem jAlumnos;
    private javax.swing.JCheckBoxMenuItem jCheck;
    private javax.swing.JMenu jColor;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jFormularioDeAlumno;
    private javax.swing.JMenuItem jFormularioDeMateria;
    private javax.swing.JLabel jLogoGob;
    private javax.swing.JLabel jLogoUlp;
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
