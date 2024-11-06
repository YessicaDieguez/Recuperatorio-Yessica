
package parcial.evento;


public class Estudiantes {
    protected String nombre;
    protected int  matricula;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
