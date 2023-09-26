package equipo24.AccesoADatos;

import equipo24.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoData {

    private Connection con = null;

    // Constructor que establece la conexión a la base de datos al crear una instancia de la clase
    public AlumnoData() {

        con = Conexion.getConexion();
    }

    //metodos
    public void guardarAlumno(Alumno alumno) {
        
        // Se define la consulta SQL
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try {
            // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            //asigna el valor del nombre de alumno, obtenido a través del método getNombre() del objeto materia, al primer parámetro de la consulta SQL.
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            
            // El método executeUpdate() se utiliza para ejecutar consultas que modifican los datos en la base de datos.
            ps.executeUpdate();
            
            // Se cierra el objeto PreparedStatement "ps" para liberar recursos
            ps.close();

            JOptionPane.showMessageDialog(null, " Alumno guardado ");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno" + ex.getMessage());

        }
    }

    public Alumno buscarAlumno(int id) {

        // Esta variable se utilizará para almacenar el alumno encontrado en la base de datos.
        Alumno alumno = null;
        
        // Se define la consulta SQL
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro   
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                
                // Se cierra el objeto PreparedStatement "ps" para liberar recursos
                ps.close();
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }

        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        
        // Esta variable se utilizará para almacenar el alumno encontrado en la base de datos.
        Alumno alumno = null;
        
        // Se define la consulta SQL
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;

        try {

            // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            
            // Se cierra el objeto PreparedStatement "ps" para liberar recursos
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + ex.getMessage());

        }
        
        // Devuelve la lista de alumno
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        
        // Se crea una lista vacía que contendrá las materias
        List<Alumno> alumnos = new ArrayList<>();

        try {
            
            // Se define la consulta SQL
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            
            // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);

            }
            
            // Se cierra el objeto PreparedStatement "ps" para liberar recursos
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " error al acceder a la tabla Alumno" + ex.getMessage());

        }
        
        // Se devuelve la lista "alumno" que contiene todas los alumnos recuperados
        return alumnos;
    }

    public void modificarAlumno(Alumno alumno) {
        
        // Se define la consulta SQL
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
        
        // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            
            // El método executeUpdate() se utiliza para ejecutar consultas que modifican los datos en la base de datos.
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, " Modificado exitosamente ");

            } else {

                System.out.println(" la cague ");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla alumno ");
        }

    }

    public void eliminarAlumno(int dni) {

        try {
            
            // Se define la consulta SQL
            String sql = "UPDATE alumno SET estado = 0 WHERE dni = ? ";
            
            // PreparedStatement es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            
            // El método executeUpdate() se utiliza para ejecutar consultas que modifican los datos en la base de datos.
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, " Se elimino el alumno ");
            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla alumno");
        }
    }
}
