/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandropersonaherencia;

/**
 *
 * @author EntornoVM
 */
public class UsoPersonaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*****Persona*******//
        Persona persona1 = new Persona();
        
        persona1.mostrar();
        
        persona1.setNombre("Abby");
        persona1.setApellido("Cruz");
        persona1.setDni(33000000);
        
        persona1.mostrar();
        
        //*****Alumno*******//
        Alumno alumno1 = new Alumno();
        
        alumno1.setNombre("Chimuelo");
        
        alumno1.setNotas(9);
        alumno1.setNotas(7);
        alumno1.setNotas(9);
        
        System.out.println(alumno1.getPromedio());
        
        alumno1.mostrar();
        
        //*****Docente*******//
        
        Docente docente1 =new Docente();
        
        docente1.setNombre("Morena");
        docente1.setLegajo(1);
        docente1.mostrar();
        
       
        
    }
    
}
