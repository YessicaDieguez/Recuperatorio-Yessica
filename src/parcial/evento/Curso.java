
package parcial.evento;


public class Curso {
    protected String nombre;
    protected  String profesor;

    public Curso() {
    }

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
    
}
