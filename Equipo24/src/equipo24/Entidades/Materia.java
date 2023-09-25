package equipo24.Entidades;

public class Materia {

    /*
    Se definen los atributos (variables miembro) de la clase Materia.
    La clase tiene cuatro atributos privados: idMateria (un entero), 
    nombre (una cadena de texto), aniomateria (un entero) y estado (un valor booleano).
    */
    
    private int idMateria;
    private String nombre;
    private int aniomateria;
    private boolean estado;

    // constructor predeterminado de la clase Materia. Vacio. No toma argumentos.
    
    public Materia() {
    }

    /*
    un constructor de la clase Materia que toma tres argumentos: nombre,
    aniomateria y estado. Estos argumentos se utilizan para inicializar 
    los atributos de la clase.
    */
    
    public Materia(String nombre, int aniomateria, boolean estado) {
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.estado = estado;
    }

    /*
    otro constructor de la clase Materia que toma cuatro argumentos: idmateria, 
    nombre, aniomateria y estado. Estos argumentos se utilizan para inicializar 
    los atributos de la clase.    
    */
    
    public Materia(int idMateria, String nombre, int aniomateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.estado = estado;
    }

    /*
    Estos son métodos getter (getIdMateria) y setter (setIdMateria)
    para el atributo idMateria. Los métodos getter se utilizan para obtener 
    el valor del atributo, y los setter se utilizan para establecer el valor del atributo
    */
    
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

    /*
    El método toString esta sobrescrito. Devuelve una representación de cadena
    de la materia en forma de "nombre aniomateria". Este método se utiliza para 
    convertir una instancia de la clase Materia
    */
    
    @Override
    public String toString() {
        return nombre + " " + aniomateria + "°";
    }

}
