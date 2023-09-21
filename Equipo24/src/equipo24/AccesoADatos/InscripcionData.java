
package equipo24.AccesoADatos;

import equipo24.Entidades.Alumno;
import equipo24.Entidades.Inscripcion;
import equipo24.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection con =null;
    private MateriaData matData;
    private AlumnoData aluData;
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    public void guardarInscripcion(Inscripcion inscripcion){
        String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";
        try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion agregada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Inscripcion");
        }
  }
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            Alumno alumno;
            Materia materia;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                alumno=new Alumno();
                materia = new Materia();
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);
                materia.setIdMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar inscripciones");
        }
        return inscripciones;
    }
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            Alumno alumno;
            Materia materia;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                alumno = new Alumno();
                materia = new Materia();
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);
                materia.setIdMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar inscripciones por alumno.");
        }
        return inscripciones;
     }
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
    try {
    String sql = "SELECT inscripcion.idMateria,nombre,año FROM inscripcion,materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, id);
          ResultSet rs = ps.executeQuery();
          Materia materia;
        while (rs.next()) {
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
           materia.setNombre(rs.getNString("nombre"));
           materia.setAniomateria(rs.getInt("año"));
           materias.add(materia);
          }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener inscripciones");
        }
    return materias;
    }
    public List<Materia> obtenerMateriasNoCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
    try {
    String sql = "SELECT * FROM materia WHERE estado = 1 "
            + "AND idMateria not in (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, id);
          ResultSet rs = ps.executeQuery();
          Materia materia;
        while (rs.next()) {
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
           materia.setNombre(rs.getNString("nombre"));
           materia.setAniomateria(rs.getInt("año"));
           materias.add(materia);
          }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener la inscripcion del alumno");
        }
    return materias;
    }
    public void borrarinscripcionAlumnoMateria(int idAlumno,int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Inscripcion eliminada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de eliminar la inscripcion");
        }
}
    public void actualizarNota(int idAlumno,int idMateria,int nota){
    String sql = "UPDATE inscripcion SET nota= ? WHERE idAlumno= ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
           ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota");
        }
    }
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    String sql = "SELECT alumno.idAlumno, dni,nombre,apellido,fechaNacimiento,estado "
            + "FROM inscripcion ,alumno WHERE inscripcion.idAlumno = alumno.idAlumno AND idMateria= ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return alumnos;
   }
}
