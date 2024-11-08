
package parcial.evento;

import java.util.ArrayList;
import java.util.List;


public class ParcialEvento {

    
    public static void main(String[] args) {
        
                
        List <Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Analisis matematico","Lujan"));
        cursos.add(new Curso("Estadistica","Rosana"));
        cursos.add(new Curso("Algebra","Lujan.V."));
        cursos.add(new Curso("Base de datos", "Cristian"));
        cursos.add(new Curso("Ingles", "Angie"));
        
        
       List<Estudiantes> estudiante = new ArrayList<>();
       estudiante.add(new Estudiantes("Yessica", 001));
       estudiante.add(new Estudiantes("Priscila", 002));
       estudiante.add(new Estudiantes("Nahiara", 003));
       estudiante.add(new Estudiantes("Leilany", 004));
       estudiante.add(new Estudiantes("Ashley", 005));
       
       
       List<Inscripcion> inscripciones = new ArrayList<>();
       inscripciones.add(new Inscripcion(cursos.get(1), estudiante.get(1), 6, 001, true));
       inscripciones.add(new Inscripcion(cursos.get(2), estudiante.get(2), 4, 002, true));
       inscripciones.add(new Inscripcion(cursos.get(1), estudiante.get(3), 2, 003, false));
       inscripciones.add(new Inscripcion(cursos.get(4), estudiante.get(4), 2, 004, false));
       
       
     
       //while ( i=0; i < estudiante.size();i++){
           
          //     System.out.println("El alumno es : " + estudiante.get(1));
               
      // }
      int i =0;
         while(i < estudiante.size()) { 
       Estudiantes primerEstudiantes=estudiante.get(i);
        System.out.println(primerEstudiantes.getNombre() + " " + primerEstudiantes.getMatricula());
        
         i++;
         }
         
          while(i < inscripciones.size()) { 
       Inscripcion primerInscripcion=inscripciones.get(i);
        System.out.println(primerInscripcion.getCursos());
        
         i++;
         
         
          }
    
         
         
    }
    
    }
    
    

