package parcial.evento;

import org.w3c.dom.Notation;

public class Inscripcion {

    private Curso cursos;
    private Estudiantes estudiante;
    protected int Nota;
    protected int ID;
    protected boolean Situacion;

    public Inscripcion() {
    }

    public Inscripcion(Curso cursos, Estudiantes estudiante, int Nota, int ID, boolean Situacion) {
        this.cursos = cursos;
        this.estudiante = estudiante;
        this.Nota = Nota;
        this.ID = ID;
        this.Situacion = Situacion;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isSituacion() {
        return Situacion;
    }

    public void setSituacion(boolean Situacion) {
        this.Situacion = Situacion;
    }

    public void Situacion(){
    if ( Nota

    
        >=6){
            setSituacion(true);
    }
    }
    
        
    

}
