/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {



    public static int yes;
    public static boolean loop = false;
    public static double suma1;



    public static void bienvenida(){
        System.out.println("Bienvenido al programa de operaciones matematicas");
    }

    public static void cancelar(Scanner cancel){
        main(null);
    }
    

    public static void suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("\n¿Desea realizar otra operación?");
        System.out.println("1. Sí");
        System.out.println("0. No");
        yes = sc.nextInt();
        if (yes == 1) {
            menu(sc, yes);
        } else {
            main(null);
        }
    }




        public static void resta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        System.out.println("\n¿Desea realizar otra operación?");
        System.out.println("1. Sí");
        System.out.println("0. No");
        yes = sc.nextInt();
        if (yes == 1) {
            menu(sc, yes);
        } else {
            main(null);
        }
    }




        public static void multiplicacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("\n¿Desea realizar otra operación?");
        System.out.println("1. Sí");
        System.out.println("0. No");
        yes = sc.nextInt();
        if (yes == 1) {
            menu(sc, yes);
        } else {
            main(null);
        }
    }



        public static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();
        
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
        
        System.out.println("\n¿Desea realizar otra operación?");
        System.out.println("1. Sí");
        System.out.println("0. No");
        yes = sc.nextInt();
        if (yes == 1) {
            menu(sc, yes);
        } else {
            main(null);
        }
    }





    public static void menu(Scanner menu, int yes){
        
        System.out.println("------Bienvenido al menu de operaciones matematicas------");
        System.out.println("(+)" + "A continuacion selecciona la opcion que mas te interese");

        System.out.println("=============================================================");
        System.out.println("(1). " + " Desea sumar");
        System.out.println("(2). " + " Desea restar");
        System.out.println("(3). " + " Desea multiplicar");
        System.out.println("(4). " + " Desea dividir");
        System.out.println("=============================================================");

        System.out.println("Selecciona la opcion necesaria para ti");
        yes = menu.nextInt();
        



        if (yes == 1) {
            System.out.println("deseas entrar a la zona de suma");
            System.out.println("1. para entrar");
            System.out.println("0. para cancelar");
                yes = menu.nextInt();
            if (yes == 1){
                    suma();
                }else if ( yes == 0){
                    menu(menu, yes);
                }
        } else if (yes == 2) {
            System.out.println("deseas entrar a la zona de resta");
            System.out.println("1. para entrar");
            System.out.println("0. para cancelar");
                yes = menu.nextInt();
            if (yes == 1){
                    resta();
                }else if ( yes == 0){
                    menu(menu, yes);
                }
            
        } else if (yes == 3) {
            System.out.println("deseas entrar a la zona de multiplicacion");
            System.out.println("1. para entrar");
            System.out.println("0. para cancelar");
                yes = menu.nextInt();
            if (yes == 1){
                    multiplicacion();
                }else if ( yes == 0){
                    menu(menu, yes);
                }
            
        } else if (yes == 4){
            System.out.println("deseas entrar a la zona de division");
            System.out.println("1. para entrar");
            System.out.println("0. para cancelar");
                yes = menu.nextInt();
            if (yes == 1){
                    division();
                }else if ( yes == 0){
                    menu(menu, yes);
                }

        }


    }


    public static void validacionMenu(Scanner validacion){
        int yes;
        System.out.println("Desea ingresar al menu");
        System.out.println("1 para ingresar");
        System.out.println("0 para cancelar accion");
        yes = validacion.nextInt();

        if (yes == 1) {
            System.out.println("Has continuado al menu");
            menu(validacion, yes);
        } else if(yes == 0) {
            System.out.println("No has entrado al menu");
            main(null);
            loop = true;
        }



    }





    public static void main(String[] args) {
        int yes;
        Scanner sc = new Scanner(System.in);
       
        bienvenida();
        validacionMenu(sc);
        
    }
    
}
