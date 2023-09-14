package equipo24.AccesoADatos;

import equipo24.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author calga
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, año, estado) VALUES ('?','?',?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());

            ps.setInt(2, materia.getAniomateria());

            ps.setBoolean(3, materia.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                materia.setIdMateria(rs.getInt("IdMateria"));

                JOptionPane.showMessageDialog(null, "materia añadida con exito.");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());

        }

    }

    public Materia buscarMateria(int id) {

        Materia materia = null;

        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";

        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));

                materia.setNombre(rs.getString("nombre"));

                materia.setAniomateria(rs.getInt("año"));

                materia.setEstado(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe la materia");

                ps.close();

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());

        }

        return materia;

    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre='?',año='?' WHERE idMateria = ?;";

        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());

            ps.setInt(2, materia.getAniomateria());
            ps.setInt(3, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente.");

            } else {

                JOptionPane.showMessageDialog(null, "La materia no existe");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }

    }

    public void eliminarMateria(int id) {

        try {

            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, " Se elimino la materia.");

            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");

        }
    }

    public List<Materia> listarMaterias() {

        List<Materia> materia = new ArrayList<>();

        try {

            String sql = "SELECT * FROM materia WHERE estado = 1 ";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia mat = new Materia();

                mat.setIdMateria(rs.getInt("idMateria"));

                mat.setNombre(rs.getString("nombre"));

                mat.setAniomateria(rs.getInt("año"));

                mat.setEstado(rs.getBoolean("estado"));

                materia.add(mat);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());

        }

        return materia;

    }

}
