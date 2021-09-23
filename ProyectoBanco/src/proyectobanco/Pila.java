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
public class Pila extends Lista {
     public ArrayList<String> getLista() {
        return LP;
    }

    public void setLista(ArrayList<String> lista) {
        this.LP = lista;
    }
     @Override
    public void Mete(String t){
        this.LP.add(t);
    }
     @Override
    public void Saca(){
        int pos=LP.size();
        this.LP.remove(pos);
    }
     @Override
    public void Imprimir(){
        for (int i = 0; i < LP.size(); i++) {
            System.out.println(LP.get(i)+" , ");
        }
    }
     @Override
    public void Pone(Persona p){}
     @Override
    public void Quita(){}
}
