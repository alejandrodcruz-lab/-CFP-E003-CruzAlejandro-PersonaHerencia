/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandropersonaherencia;

import java.util.ArrayList;

/**
 *
 * @author EntornoVM
 */
class Alumno extends Persona {

    public Alumno() {
        super();
        this.notas = new ArrayList<Float>();
        this.p = 0;

    }

    ;
    
    public Alumno(String n, String a, long d, int p) {
        super(n, a, d);
        this.notas = new ArrayList<Float>();
        this.p = p;
    }

    ;
    
    public void setPadron(int p) {
        this.p = p;
    }

    public void setNotas(float not) {
        this.notas.add(not);
    }

    public int getPadron() {
        return p;
    }

    public float getPromedio() {
        float promedio;
        float suma = 0;

        for (int i = 0; i < notas.size(); i++) {
            suma = suma + notas.get(i);
        }

        promedio = (suma / notas.size());

        return promedio;
    }

    @Override
    public void mostrar() {
        System.out.println("Datos: " + getNombre() + " " + getApellido() + " " + getDni() + " " + getPadron() + " " + getPromedio());
    }

    private ArrayList<Float> notas;
    private int p;

}
