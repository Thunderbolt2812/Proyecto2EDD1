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
public class Cola extends Lista {
     public ArrayList<Persona> getLista() {
        return LC;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.LC = lista;
    }
     @Override
    public void Imprimir(){
        for (int i = 0; i < LC.size(); i++) {
            System.out.println(LC.get(i).getNombre()+" , "+LC.get(i).getTransaccion()+" ,");
        }
    }   
     @Override
    public void Pone(Persona p){
        LC.add(p);
    }
     @Override
    public void Quita(){
        LC.remove(0);
    }
    public Persona getPersona(int pos){
        return LC.get(pos);
    }
    public boolean colaVacia(){
         return LC.isEmpty() != false;
    }
     @Override
    public void Mete(String t){}
     @Override
    public void Saca(){}
}
