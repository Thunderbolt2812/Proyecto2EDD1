/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int opcion = 0;
        ArrayList<Cajero> cajeros;
        cajeros = new ArrayList();
        while (opcion!=3) {
            System.out.println("1) Opcion 1");
            System.out.println("2) Opcion 2");
            System.out.println("3) Salir Corriendo");
            System.out.println("Ingrese el numero de la opcion que desee: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1: {
                    Cajero ca1 = new Cajero();
                    cajeros.add(ca1);
                    Cajero ca2 = new Cajero();
                    cajeros.add(ca2);
                    Cajero ca3 = new Cajero();
                    cajeros.add(ca3);
                    Cajero ca4 = new Cajero();
                    cajeros.add(ca4);
                    Pila p1 = new Pila();
                    Pila p2 = new Pila();
                    Pila p3 = new Pila();
                    Pila p4 = new Pila();
                    Cola cola = new Cola();
                    for (int i = 1; i <= 10; i++) {
                        String name = "Clientes" + i;
                        Random r = new Random();
                        int t = r.nextInt(3) + 1;
                        String tra = "";
                        if (t == 1) {
                            tra = "Retiro";
                        }
                        if (t == 2) {
                            tra = "Pago";
                        }
                        if (t == 3) {
                            tra = "Transferencia";
                        }
                        Persona p = new Persona();
                        p.setTransaccion(tra);
                        p.setNombre(name);
                        cola.Pone(p);
                    }
                    int cc = 120;
                    int conts = 0;
                    while (!cola.getLista().isEmpty()) {
                        ca1.setP(p1);
                        ca2.setP(p2);
                        ca3.setP(p3);
                        ca4.setP(p4);
                        ca1.setVacio(true);
                        ca2.setVacio(true);
                        ca3.setVacio(true);
                        ca4.setVacio(true);
                        if (ca1.isVacio() == true && ca2.isVacio() == true && ca3.isVacio() == true && ca4.isVacio() == true) {
                            Random r2 = new Random();
                            int tiempo1 = r2.nextInt(3) + 1;
                            if (tiempo1 == 1) {
                                ca1.setVacio(false);
                                if (!cola.getLista().isEmpty()) {
                                    ca1.setPersona(cola.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cc--;
                                    if (!cola.getLista().isEmpty()) {
                                        cola.Quita();
                                    }
                                    String pass = ca1.getPersona().getNombre() + ", Transaccion: " + ca1.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #1";
                                    p1.Mete(pass);
                                    ca1.setVacio(true);
                                    System.out.println(pass);
                                }
                            }
                            if (tiempo1 == 2) {
                                ca2.setVacio(false);
                                if (!cola.getLista().isEmpty()) {
                                    ca2.setPersona(cola.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cc--;
                                    cola.Quita();
                                    String pass = ca2.getPersona().getNombre() + ", Transaccion: " + ca2.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #2";
                                    p2.Mete(pass);
                                    ca2.setVacio(true);
                                    System.out.println(pass);
                                }
                            }
                            if (tiempo1 == 3) {
                                ca3.setVacio(false);
                                if (!cola.getLista().isEmpty()) {
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cc--;

                                    cola.Quita();
                                    String pass = ca3.getPersona().getNombre() + ", Transaccion: " + ca3.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #3";
                                    p3.Mete(pass);
                                    ca3.setVacio(true);
                                    System.out.println(pass);
                                }
                            }
                            if (tiempo1 == 4) {
                                ca4.setVacio(false);
                                if (!cola.getLista().isEmpty()) {
                                    ca4.setPersona(cola.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cc--;
                                    cola.Quita();
                                    String pass = ca4.getPersona().getNombre() + ", Transaccion: " + ca4.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #4";
                                    p4.Mete(pass);
                                    ca4.setVacio(true);
                                    System.out.println(pass);
                                }
                            }

                        }
                        if (ca1.isVacio() == true) {
                            ca1.setVacio(false);
                            if (!cola.getLista().isEmpty()) {
                                ca1.setPersona(cola.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {

                                }
                                cc--;
                                if (!cola.getLista().isEmpty()) {
                                    cola.Quita();
                                }
                                String pass = ca1.getPersona().getNombre() + ", Transaccion: " + ca1.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #1";
                                p1.Mete(pass);
                                ca1.setVacio(true);
                                System.out.println(pass);
                            }

                        }
                        if (ca2.isVacio() == true) {
                            ca2.setVacio(false);
                            if (!cola.getLista().isEmpty()) {
                                ca2.setPersona(cola.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {

                                }
                                cc--;
                                cola.Quita();
                                String pass = ca2.getPersona().getNombre() + ", Transaccion: " + ca2.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #2";
                                p2.Mete(pass);
                                ca2.setVacio(true);
                                System.out.println(pass);
                            }
                        }
                        if (ca3.isVacio() == true) {
                            ca3.setVacio(false);
                            if (!cola.getLista().isEmpty()) {
                                ca3.setPersona(cola.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {
                                }
                                cc--;
                                cola.Quita();
                                String pass = ca3.getPersona().getNombre() + ", Transaccion: " + ca3.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #3";
                                p3.Mete(pass);
                                ca3.setVacio(true);
                                System.out.println(pass);
                            }
                        }
                        if (ca4.isVacio() == true) {
                            ca4.setVacio(false);
                            if (!cola.getLista().isEmpty()) {
                                ca4.setPersona(cola.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {
                                }
                                cc--;
                                cola.Quita();
                                String pass = ca4.getPersona().getNombre() + ", Transaccion: " + ca4.getPersona().getTransaccion() + ", Tiempo: " + tiempo + ", Cajero #4";
                                p4.Mete(pass);
                                ca4.setVacio(true);
                                System.out.println(pass);
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("Pila 1:");
                    p1.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 2:");
                    p2.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 3:");
                    p3.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 4:");
                    p4.Imprimir();
                    System.out.println("");
                    cajeros.removeAll(cajeros);
                    break;
                }
                case 2: {
                    Cajero ca1 = new Cajero();
                    cajeros.add(ca1);
                    Cajero ca2 = new Cajero();
                    cajeros.add(ca2);
                    Cajero ca3 = new Cajero();
                    cajeros.add(ca3);
                    Cajero ca4 = new Cajero();
                    cajeros.add(ca4);
                    Pila p1 = new Pila();
                    Pila p2 = new Pila();
                    Pila p3 = new Pila();
                    Pila p4 = new Pila();
                    Cola colaP = new Cola();
                    Cola cola1 = new Cola();
                    Cola cola2 = new Cola();
                    Cola cola3 = new Cola();
                    Cola cola4 = new Cola();
                    for (int i = 1; i <= 10; i++) {
                        String name = "Cliente" + i + ", Cajero #1";
                        Random r = new Random();
                        int t = r.nextInt(3) + 1;
                        String tra = "";
                        if (t == 1) {
                            tra = "Retiro";
                        }
                        if (t == 2) {
                            tra = "Pago";
                        }
                        if (t == 3) {
                            tra = "Transferencia";
                        }
                        Persona p = new Persona();
                        p.setTransaccion(tra);
                        p.setNombre(name);
                        cola1.Pone(p);
                        colaP.Pone(p);
                    }
                    for (int i = 1; i <= 10; i++) {
                        String name = "Cliente" + i + ", Cajero #2";
                        Random r = new Random();
                        int t = r.nextInt(3) + 1;
                        String tra = "";
                        if (t == 1) {
                            tra = "Retiro";
                        }
                        if (t == 2) {
                            tra = "Pago";
                        }
                        if (t == 3) {
                            tra = "Transferencia";
                        }
                        Persona p = new Persona();
                        p.setTransaccion(tra);
                        p.setNombre(name);
                        cola2.Pone(p);
                        colaP.Pone(p);
                    }
                    for (int i = 1; i <= 10; i++) {
                        String name = "Cliente" + i + ", Cajero #3";
                        Random r = new Random();
                        int t = r.nextInt(3) + 1;
                        String tra = "";
                        if (t == 1) {
                            tra = "Retiro";
                        }
                        if (t == 2) {
                            tra = "Pago";
                        }
                        if (t == 3) {
                            tra = "Transferencia";
                        }
                        Persona p = new Persona();
                        p.setTransaccion(tra);
                        p.setNombre(name);
                        cola3.Pone(p);
                        colaP.Pone(p);
                    }
                    for (int i = 1; i <= 10; i++) {
                        String name = "Cliente" + i + ", Cajero #4";
                        Random r = new Random();
                        int t = r.nextInt(3) + 1;
                        String tra = "";
                        if (t == 1) {
                            tra = "Retiro";
                        }
                        if (t == 2) {
                            tra = "Pago";
                        }
                        if (t == 3) {
                            tra = "Transferencia";
                        }
                        Persona p = new Persona();
                        p.setTransaccion(tra);
                        p.setNombre(name);
                        cola4.Pone(p);
                        colaP.Pone(p);
                    }
                    int conts = 0;
                    int cont = 0;
                    while (cont != 40) {
                        ca1.setP(p1);
                        ca2.setP(p2);
                        ca3.setP(p3);
                        ca4.setP(p4);
                        ca1.setVacio(true);
                        ca2.setVacio(true);
                        ca3.setVacio(true);
                        ca4.setVacio(true);
                        if (ca1.isVacio() == true && ca2.isVacio() == true && ca3.isVacio() == true && ca4.isVacio() == true) {
                            Random r2 = new Random();
                            int tiempo1 = r2.nextInt(3) + 1;
                            if (tiempo1 == 1) {
                                ca1.setVacio(false);
                                if (!cola1.getLista().isEmpty()) {
                                    ca1.setPersona(cola1.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    if (!cola1.getLista().isEmpty()) {
                                        cola1.Quita();
                                    }
                                    String pass = ca1.getPersona().getNombre() + ", Transaccion: " + ca1.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                    p1.Mete(pass);
                                    ca1.setVacio(true);
                                    System.out.println(pass);
                                    cont++;
                                }
                            }
                            if (tiempo1 == 2) {
                                ca2.setVacio(false);
                                if (!cola2.getLista().isEmpty()) {
                                    ca2.setPersona(cola2.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cola2.Quita();
                                    String pass = ca2.getPersona().getNombre() + ", Transaccion: " + ca2.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                    p2.Mete(pass);
                                    ca2.setVacio(true);
                                    System.out.println(pass);
                                    cont++;
                                }
                            }
                            if (tiempo1 == 3) {
                                ca3.setVacio(false);
                                if (!cola3.getLista().isEmpty()) {
                                    ca3.setPersona(cola3.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cola3.Quita();
                                    String pass = ca3.getPersona().getNombre() + ", Transaccion: " + ca3.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                    p3.Mete(pass);
                                    ca3.setVacio(true);
                                    System.out.println(pass);
                                    cont++;
                                }
                            }
                            if (tiempo1 == 4) {
                                ca4.setVacio(false);
                                if (!cola4.getLista().isEmpty()) {
                                    ca4.setPersona(cola4.getLista().get(0));
                                    Random r = new Random();
                                    int tiempo = r.nextInt(3) + 1;
                                    conts += tiempo;
                                    try {
                                        Thread.sleep(tiempo + 1000);
                                    } catch (InterruptedException ex) {
                                    }
                                    cola4.Quita();
                                    String pass = ca4.getPersona().getNombre() + ", Transaccion: " + ca4.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                    p4.Mete(pass);
                                    ca4.setVacio(true);
                                    System.out.println(pass);
                                    cont++;
                                }
                            }

                        }
                        if (ca1.isVacio() == true) {
                            ca1.setVacio(false);
                            if (!cola1.getLista().isEmpty()) {
                                ca1.setPersona(cola1.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {

                                }
                                if (!cola1.getLista().isEmpty()) {
                                    cola1.Quita();
                                }
                                String pass = ca1.getPersona().getNombre() + ", Transaccion: " + ca1.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                p1.Mete(pass);
                                ca1.setVacio(true);
                                System.out.println(pass);
                                cont++;
                            }

                        }
                        if (ca2.isVacio() == true) {
                            ca2.setVacio(false);
                            if (!cola2.getLista().isEmpty()) {
                                ca2.setPersona(cola2.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {

                                }
                                cola2.Quita();
                                String pass = ca2.getPersona().getNombre() + ", Transaccion: " + ca2.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                p2.Mete(pass);
                                ca2.setVacio(true);
                                System.out.println(pass);
                                cont++;
                            }
                        }
                        if (ca3.isVacio() == true) {
                            ca3.setVacio(false);
                            if (!cola3.getLista().isEmpty()) {
                                ca3.setPersona(cola3.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {
                                }
                                cola3.Quita();
                                String pass = ca3.getPersona().getNombre() + ", Transaccion: " + ca3.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                p3.Mete(pass);
                                ca3.setVacio(true);
                                System.out.println(pass);
                                cont++;
                            }
                        }
                        if (ca4.isVacio() == true) {
                            ca4.setVacio(false);
                            if (!cola4.getLista().isEmpty()) {
                                ca4.setPersona(cola4.getLista().get(0));
                                Random r = new Random();
                                int tiempo = r.nextInt(3) + 1;
                                conts += tiempo;
                                try {
                                    Thread.sleep(tiempo + 1000);
                                } catch (InterruptedException ex) {
                                }
                                cola4.Quita();
                                String pass = ca4.getPersona().getNombre() + ", Transaccion: " + ca4.getPersona().getTransaccion() + ", Tiempo: " + tiempo;
                                p4.Mete(pass);
                                ca4.setVacio(true);
                                System.out.println(pass);
                                cont++;
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("Pila 1:");
                    p1.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 2:");
                    p2.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 3:");
                    p3.Imprimir();
                    System.out.println("");
                    System.out.println("Pila 4:");
                    p4.Imprimir();
                    System.out.println("");
                    cajeros.removeAll(cajeros);
                    break;
                }
            }
        }
    }
}
