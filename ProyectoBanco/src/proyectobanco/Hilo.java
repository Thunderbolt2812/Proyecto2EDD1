/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;


/**
 *
 * @author Usuario
 */
public class Hilo {
    
    private boolean avanzar;
    private boolean vive;
    private Cajero c1;
    private Pila pila;
    private Cola cola;
    private Persona p;

    public Hilo() {
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        
        while (vive) {
            if (avanzar) {
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }

    }
}
