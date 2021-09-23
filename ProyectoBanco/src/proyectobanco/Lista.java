/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Lista {
    protected ArrayList<String>LP=new ArrayList(); 
    protected ArrayList<Persona>LC=new ArrayList(); 
    public abstract void Imprimir();
    public abstract void Pone(Persona p);
    public abstract void Quita();
    public abstract void Mete(String t);
    public abstract void Saca();
    
}
