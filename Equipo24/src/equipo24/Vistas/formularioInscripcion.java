package equipo24.vistas;

import equipo24.Entidades.*;
import equipo24.AccesoADatos.*;
import javax.swing.table.DefaultTableModel;

public class formularioInscripcion extends javax.swing.JInternalFrame {

//  Creo los atributos que luego utlizare en los metodos.   
    private InscripcionData insData = new InscripcionData();
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();
    private Inscripcion inscripcion = new Inscripcion();
    private Materia materia = new Materia();
    private Alumno alumno = new Alumno();
    
//        Seteo por default el modelo de la tabla.
//        Edito el metodo isCellEditable y creo una condicion para que solo la columna numero 100 sea editable
//        (Al no existir una columna con ese numero, entra en el else y la tabla no se podra editar)
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 100) {
                return true;
            } else {
                return false;
            }
        }
    };

// Agrego los metodos cabecera() y cargarAlumnos() al constructor para que se carguen ni bien se ejecuta la clase.    
    public formularioInscripcion() {
        initComponents();
//        Carga las columnas de la tabla.
        cabecera();
//        Carga el JComboBox con los alumnos.
        cargarAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();
        jRadioInscriptas = new javax.swing.JRadioButton();
        jRadioNoInscriptas = new javax.swing.JRadioButton();
        jAnular = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jInscribir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione Alumno:");

        jLabel3.setText("Listado de Materias");

        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        buttonGroup.add(jRadioInscriptas);
        jRadioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInscriptasActionPerformed(evt);
            }
        });

        buttonGroup.add(jRadioNoInscriptas);
        jRadioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNoInscriptasActionPerformed(evt);
            }
        });

        jAnular.setText("Anular Inscripcion");
        jAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnularActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jInscribir.setText("Inscribir");
        jInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInscribirActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Materias Inscriptas");

        jLabel5.setText("Materias no Inscriptas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jRadioInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioNoInscriptas)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jInscribir)
                        .addGap(51, 51, 51)
                        .addComponent(jAnular)
                        .addGap(55, 55, 55)
                        .addComponent(jSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioNoInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAnular)
                            .addComponent(jSalir)
                            .addComponent(jInscribir)))
                    .addComponent(jRadioInscriptas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInscriptasActionPerformed
//       El if va a comprobar si en el JComboBox hay un alumno seleccionado:
//       Si hay un alumno seleccionado entonces el valor es distinto a null  y da true y llama al metodo materiasInscriptas.
//       Si no hay alumno seleccionado entonces el valor es null y da como false y no realiza nada.   
//       Esto lo hago para que no habilite los botones Inscribir / anular antes de tener el alumno seleccionado y la tabla cargada.
        if (jCombo.getSelectedItem() != null) {
            materiasInscriptas();
        }    
    }//GEN-LAST:event_jRadioInscriptasActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
//        Con esa instrucción cierras la ventana actual y liberas los recursos que esa ventana haya estado ocupando.
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jRadioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNoInscriptasActionPerformed
//       El if va a comprobar si en el JComboBox hay un alumno seleccionado:
//       Si hay un alumno seleccionado entonces el valor es distinto a null  y da true y llama al metodo materiasInscriptas.
//       Si no hay alumno seleccionado entonces el valor es null y da como false y no realiza nada.   
//       Esto lo hago para que no habilite los botones Inscribir / anular antes de tener el alumno seleccionado y la tabla cargada.
        if (jCombo.getSelectedItem() != null) {
            materiasNoInscriptas();
        }
    }//GEN-LAST:event_jRadioNoInscriptasActionPerformed

    private void jAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnularActionPerformed
//      Obtengo el alumno seleccionado en el jCumboBox y lo guardo en el atributo alumno para luego obtener el idAlumno de ahi.
        alumno = (Alumno) jCombo.getSelectedItem();
//      el codigo "modelo.getValueAt(N° de fila , N° de columna)" devuelve un objeto con el valor ubicado en la fila y columna que le especifiquemos
//      en este caso solo queremos saber el valor de la primera columna que es el idMateria y usamos:
//      jTabla.getSelectedRow() para indicar el numero de fila que es y 0 porque es la columna primera donde estan los ID
//      String.valueOf convierte ese Objeto obtenido y lo transforma en un String que luego parseamos para obtener el entero del IdMateria.
        String dato = String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0));
        int matID = Integer.parseInt(dato);
        insData.borrarinscripcionAlumnoMateria(alumno.getIdAlumno(), matID);

//      Una vez borrada la inscripcion, llamo al metodo materiasInscriptas para que vacie la tabla y la recargue actualizada.
        materiasInscriptas();
    }//GEN-LAST:event_jAnularActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        LimpiarTabla();
        if (jRadioInscriptas.isSelected()) {
            materiasInscriptas();
        } else {
            materiasNoInscriptas();
        }
    }//GEN-LAST:event_jComboActionPerformed

    private void jInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscribirActionPerformed
//      Obtengo el alumno seleccionado en el jCumboBox y lo guardo en el atributo alumno para luego obtener el idAlumno de ahi.
        alumno = (Alumno) jCombo.getSelectedItem();
//      el codigo "modelo.getValueAt(N° de fila , N° de columna)" devuelve un objeto con el valor ubicado en la fila y columna que le especifiquemos
//      en este caso solo queremos saber el valor de la primera columna que es el idMateria y usamos:
//      jTabla.getSelectedRow() para indicar el numero de fila que es y 0 porque es la columna primera donde estan los ID
//      String.valueOf convierte ese Objeto obtenido y lo transforma en un String que luego parseamos para obtener el entero del IdMateria.        
        String dato = String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0));
        int matID = Integer.parseInt(dato);
        materia.setIdMateria(matID);
        inscripcion.setMateria(materia);
        inscripcion.setAlumno(alumno);
        inscripcion.setNota(0);
        insData.guardarInscripcion(inscripcion);
        
//      Una agregada la inscripcion, llamo al metodo materiasNoInscriptas para que vacie la tabla y la recargue actualizada.
        materiasNoInscriptas();
    }//GEN-LAST:event_jInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jAnular;
    private javax.swing.JComboBox<Alumno> jCombo;
    private javax.swing.JButton jInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioInscriptas;
    private javax.swing.JRadioButton jRadioNoInscriptas;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
public void cabecera() {
//     Agrega 3 columnas a la tabla con sus respectivos nombres.
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTabla.setModel(modelo);
    }

    public void LimpiarTabla() {
//     A la tabla ya creada, le volvemos a setear el modelo por defecto que le pusimos y en el for hacemos que elimine todas las filas para vaciarla.   
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int filas = jTabla.getRowCount();
        for (int a = 0; filas > a; a++) {
//            remueve la fila con indice 0 hasta que no queden mas filas.
            modelo.removeRow(0);
        }
    }

    public void cargarAlumnos() {
//      Carga todos los alumnos obtenidos del metodo listarAlumnos() y los agregar al jComboBox.  
        for (Alumno alumno : aluData.listarAlumnos()) {
            jCombo.addItem(alumno);
        }
//      Seteamos que el jCumboBox tenga seleccionado el indice -1 (que es vacio para no tener errores de que ya tenga un elemento selecionado)  
        jCombo.setSelectedIndex(-1);
//      Seteamos que los botones Inscribir y Anular por defecto aparezcan inhabilitados  .
        jInscribir.setEnabled(false);
        jAnular.setEnabled(false);
    }

    private void materiasNoInscriptas() {
        LimpiarTabla();
        if (jRadioNoInscriptas.isSelected()) {
            jInscribir.setEnabled(true);
            jAnular.setEnabled(false);
            alumno = (Alumno) jCombo.getSelectedItem();
            for (Materia materia : insData.obtenerMateriasNoCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombre(),
                    materia.getAniomateria()
                });
            }
        }
    }

    private void materiasInscriptas() {
        LimpiarTabla();
        if (jRadioInscriptas.isSelected()) {
            jInscribir.setEnabled(false);
            jAnular.setEnabled(true);
            alumno = (Alumno) jCombo.getSelectedItem();
            for (Materia materia : insData.obtenerMateriasCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombre(),
                    materia.getAniomateria()
                });
            }
        }
    }
}
