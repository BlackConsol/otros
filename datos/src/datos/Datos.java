/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author herrn
 */
public class Datos {



        public static String nombre = "sin nombre";
        public static String documento = "sin documento";
        public static String curso = "sin curso";






        public static void willkomme(){
            System.out.println("bienvenido usuario actualmente tienes estos datos " + "\n"  + "============================================" +  "\n porfavor actualiza los datos solicitados \n"  + "============================================");
            System.out.println("\n");
            System.out.println(nombre);
            System.out.println(documento);
            System.out.println(curso);
            System.out.println("\n");
            System.out.println("============================================");
            System.out.println("\n");

        }




        public static void pnombre(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre " );

            nombre = sc.nextLine();



        }


        public static void pdocumento(){
            Scanner dc = new Scanner(System.in);
            System.out.println("Ingrese su documento porfavor");
            documento = dc.nextLine();




        }

        public static void pcurso(){
            Scanner c = new Scanner(System.in);
            System.out.println("Ingrese su curso porfavor");
            curso = c.nextLine();


        }


        public static void willkommen(){
            System.out.println("bienvenido al programa nuevamente " + nombre );

        }

        public static void willkommeAcc(){
            System.out.println("====================");
            willkommen();
            System.out.println("Datos actualizados");

            System.out.println("====================");
            System.out.println(nombre);
            System.out.println(documento);
            System.out.println(curso);
        }


    public static void main(String[] args) {

        Scanner general = new Scanner(System.in);

        willkomme();
        pnombre();
        pdocumento();
        pcurso();
        willkommeAcc();

        general.close();
    }
    
}
