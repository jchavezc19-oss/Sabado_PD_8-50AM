/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupato;

public abstract class Pato {
    protected Volable volable;
    protected Cuaqueable cuaqueable;

    public void setVolable(Volable v) { this.volable = v; }
    public void setCuaqueable(Cuaqueable c) { this.cuaqueable = c; }
    
    public abstract void mostrar();

    public void realizarVuelo() { volable.volar(); }
    public void realizarCuaqueo() { cuaqueable.cuaquear(); }
    public void nadar() { System.out.println("TODOS LOS PATOS NADAN"); }
}