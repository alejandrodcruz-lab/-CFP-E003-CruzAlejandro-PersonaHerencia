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
class Docente extends Persona {

    public Docente() {
        super();
    }

    public Docente(String n, String a, long d, int l, short ant) {

        super(n, a, d);
        this.l = l;
        this.ant = ant;
    }

    public void setLegajo(int l) {
        this.l = l;
    }

    public void setAntiguedad(short ant) {
        this.ant = ant;
    }
    
    public int getPadron() {
        return 0;
    }
    
    public int getLegajo() {
        return l;
    }

    public short getAntiguedad() {
        return ant;
    }

    @Override
    public void mostrar() {
        System.out.println("Datos: " + getNombre() + " " + getApellido() + " " + getDni() + " " + getPadron() + " " + getLegajo() + " " + getAntiguedad());
    }
    private int l;
    private short ant;
}
