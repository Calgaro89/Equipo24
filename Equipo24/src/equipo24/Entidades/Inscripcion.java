/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo24.Entidades;

/**
 *
 * @author calga
 */
public class Inscripcion {
    private int idInscripto;
    private int nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
    }

    public Inscripcion(int nota, Alumno idAlumno, Materia idMateria) {
        this.nota = nota;
        this.alumno = idAlumno;
        this.materia = idMateria;
    }

    public Inscripcion(int idInscripto, int nota, Alumno idAlumno, Materia idMateria) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.alumno = idAlumno;
        this.materia = idMateria;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", idAlumno=" + alumno + ", idMateria=" + materia + '}';
    }
}
