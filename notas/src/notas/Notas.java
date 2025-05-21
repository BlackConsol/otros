/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author herrn
 */
public class Notas {


    public static String gname = "sin nombre";


    public static void pnombre(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        gname = scanner.nextLine();
    }


    public static void wel(){
    
        System.out.println("Bienvenido al programa básico, " + gname + "!");
    }
    
    
    
    
    
    public static double pedir(Scanner scanner, int numero){
        
        System.out.println("nota " + numero + ":");
                String entrada;
            
                entrada = scanner.nextLine();
                    entrada = entrada.replace(",", ".");


            return Double.parseDouble(entrada);
            
        
    
    
    }

    public static double calcular(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    
    
    
    
    
    }

    public static void mostrar(double fina){
        System.out.println("Nota definitiva: %.2f " + fina);
        if (fina >= 3.0) {
            System.out.println("Aprobado!");
            
        } else{
        
                System.out.println("Desaprobado, vuelve a repetir curso");
        
        }
    
    
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        pnombre(scanner);

        wel();

        
        double n1, n2, n3, defi;
        
        n1 = pedir(scanner, 1);
        n2 = pedir(scanner, 2);
        n3 = pedir(scanner, 3);
        
        
        defi = calcular(n1, n2, n3);
        
        mostrar(defi);
        
        
        scanner.close();
        
        
    }
    
}
