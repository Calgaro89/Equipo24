package equipo24.AccesoADatos;

import equipo24.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

// Constructor que establece la conexión a la base de datos al crear una instancia de la clase
    public MateriaData() {

        con = Conexion.getConexion();

    }
// Método para guardar una materia en la base de datos

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        /*
  Esta línea crea un objeto PreparedStatement llamado ps utilizando una conexión
a la base de datos (con) y una consulta SQL preparada (sql). Un PreparedStatement
es una forma de ejecutar consultas SQL en Java que pueden contener parámetro
         */
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            /*
La primera línea establece el primer parámetro de la consulta SQL preparada (?)
con el valor de materia.getNombre(). En otras palabras, asigna el valor del 
nombre de la materia,obtenido a través del método getNombre() del objeto materia,
al primer parámetro de la consulta SQL.
             */
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAniomateria());
            ps.setBoolean(3, materia.isEstado());
            /*  esta línea ejecuta la consulta SQL preparada. 
es una consulta de inserción en la que se están insertando datos (el nombre, el año 
y el estado de una materia) en la base de datos. El método executeUpdate() se
utiliza para ejecutar consultas que modifican los datos en la base de datos, 
como inserciones, actualizaciones o eliminaciones.
             */
            ps.executeUpdate();
        } catch (SQLException e) {
// Captura y muestra cualquier excepción SQL que ocurra
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + e.getMessage());
        }
    }
// Método para buscar una materia por su ID en la base de datos

    public Materia buscarMateria(int id) {
        /*
Se declara una variable materia de tipo Materia e inicialmente se establece en null.
Esta variable se utilizará para almacenar la materia encontrada en la base de datos.
         */

        Materia materia = null;
        /*
Se define una cadena sql que contiene una consulta SQL. La consulta selecciona 
todos los campos de la tabla "materia" donde el ID de la materia coincida con el
valor del parámetro id (representado por ?, que será reemplazado más adelante)
         */
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
// Se inicia un bloque try-catch para manejar posibles excepciones SQL
        try {
// Se crea un objeto PreparedStatement utilizando la conexión `con` y la consulta `sql`
            PreparedStatement ps = con.prepareStatement(sql);
// Se establece el valor del parámetro en la consulta SQL con el valor de `id`
            ps.setInt(1, id);
// Se ejecuta la consulta SQL y se obtiene un conjunto de resultados ResultSet
            ResultSet rs = ps.executeQuery();
// Si hay al menos un resultado en el conjunto de resultados
            if (rs.next()) {
                /* Si se encuentra una materia con el ID proporcionado, se crea un objeto Materia 
y se llena con los datos de la base de datos
                 */
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAniomateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
// Devuelve la lista de materias
        return materia;
    }

// Método para modificar una materia en la base de datos
    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?,año=?,estado=? WHERE idMateria = ?";
// Se declara un objeto PreparedStatement en null
        PreparedStatement ps = null;

        try {
// Se crea un PreparedStatement a partir de la consulta SQL
            ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre()); // Se establece el nombre de la materia
            ps.setInt(2, materia.getAniomateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
// Se ejecuta la consulta SQL de actualización y obtiene el número de filas afectadas
            int exito = ps.executeUpdate();
// Si la consulta se ejecuta exitosamente (una fila modificada), muestra un mensaje de éxito
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente.");

            }
// Captura y muestra un mensaje de error en caso de excepción SQL
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }

    }

    /* Método para eliminar una materia en la base de datos. en realidad no lo elimina 
    solo cambia su estado a 0
     */
    public void eliminarMateria(int id) {

        try {
// Se define la consulta SQL para cambiar el estado de la materia a 0
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
// Se crea un objeto PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);
// Se establece el valor del parámetro en la consulta SQL con el valor de `id`
            ps.setInt(1, id);
// Se ejecuta la consulta SQL de actualización y obtiene el número de filas afectadas
            int fila = ps.executeUpdate();

            if (fila == 1) {
// Si se actualiza una fila, se muestra un mensaje indicando que se eliminó la materia
                JOptionPane.showMessageDialog(null, " Se elimino la materia.");

            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");

        }
    }

    /*
Método Este código en Java se encarga de recuperar una lista de todas las materias
almacenadas en la base de datos y devolverlas como una lista de objetos Materia.
     */
    public List<Materia> listarMaterias() {
        // Se crea una lista vacía que contendrá las materias
        List<Materia> materia = new ArrayList<>();

        try {
// Se define la consulta SQL para seleccionar todas las materias de la base de datos
            String sql = "SELECT * FROM materia";
// Se crea un objeto PreparedStatement a partir de la consulta SQL
            PreparedStatement ps = con.prepareStatement(sql);
// Se ejecuta la consulta SQL y obtiene un conjunto de resultados ResultSet
            ResultSet rs = ps.executeQuery();
// Se inicia un bucle "while" para recorrer los registros en el ResultSet
            while (rs.next()) {

// Por cada registro de materia en la base de datos, se crea un objeto Materia y se agrega a la lista            
                Materia mat = new Materia();

                mat.setIdMateria(rs.getInt("idMateria"));

                mat.setNombre(rs.getString("nombre"));

                mat.setAniomateria(rs.getInt("año"));

                mat.setEstado(rs.getBoolean("estado"));
// Se agrega el objeto "mat" a la lista "materia"
                materia.add(mat);

            }
// Se cierra el objeto PreparedStatement "ps" para liberar recursos
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());

        }
// Se devuelve la lista "materia" que contiene todas las materias recuperadas
        return materia;

    }

}
