package equipo24.Entidades;

/**
 *
 * @author calga
 */
public class Materia {
    
        private int idMateria;
        
        private String nombre;
        
        private int aniomateria;
        
        private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int aniomateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.estado = estado;
    }

    public Materia(String nombre, int aniomateria, boolean estado) {
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniomateria() {
        return aniomateria;
    }

    public void setAniomateria(int aniomateria) {
        this.aniomateria = aniomateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idMateria=" + idMateria + ", nombre=" + nombre + ", aniomateria=" + aniomateria + ", estado=" + estado + '}';
    }
       
    
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
