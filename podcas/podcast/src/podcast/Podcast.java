/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package podcast;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Podcast {

    public static String titulo = "sin titulo";
    public static String autor = "sin autor";
    public static String texto = "sin texto";
    public static String usuario = "user";
    public static int cantidad = 2;
    private static boolean programaActivo = true;

    public static void bienvenida() {
        System.out.println("Bienvenido al programa basico de podcast");
    }

    public static void menu(Scanner opcion) {
        int op;
        
        System.out.println("----------------");
        System.out.println("menu del podcast");
        System.out.println("----------------");

        System.out.println("opciones disponibles");
        System.out.println("Ver podcast creado/default");
        System.out.println("Crear podcast");
        System.out.println("Visualizar podcast de Nestor"); 
        System.out.println("Salir del programa");

        System.out.println("===========================================");
        System.out.println("selecciona lo que mas se ajuste a su perfil");
        System.out.println("1. para ver posdcast creado/default");
        System.out.println("2. para crear podcast");  
        System.out.println("3. para ver podcast de nestor");       
        System.out.println("4. para salir");        
        System.out.println("===========================================");
        
        op = opcion.nextInt();
        opcion.nextLine(); // Consumir el salto de línea

        if (op == 1) {
            ver(opcion, titulo, texto, autor, usuario);
        } else if (op == 2) {  
            crear(opcion, usuario);
        } else if (op == 3) {
            System.out.println("Transladando hacia el podcast de Nestor");
        } else if (op == 4) {
            programaActivo = false;
            System.out.println("Saliendo del programa...");
        }
    }

    public static void cancel() {
        System.out.println("Cancelando, volviendo al menu");
        bienvenida();
    }

    public static void crear(Scanner dev, String usuario) {
        int yep;
        String nUser = null;

        System.out.println("========================================================================");
        System.out.println("bienvenido " + usuario + ", has seleccionado para crear tu podcast");
        System.out.println("> tu nombre de usuario es: " + usuario);
        System.out.println("========================================================================");

        System.out.println("deseas cambiar tu usuario por defecto?");
        System.out.println("1. Cambiar nombre");
        System.out.println("2. continuar sin nombre");
        yep = dev.nextInt();
        dev.nextLine(); // Consumir el salto de línea

        if (yep == 1) {
            System.out.println("cual es tu nuevo usuario que deseas tener");
            nUser = dev.nextLine();
            Podcast.usuario = nUser;

            System.out.println("\n");
            System.out.println("====================================================");
            System.out.println("tu nuevo usuario ha sido establecido > " + Podcast.usuario);
            System.out.println("====================================================");
        } else if (yep == 2) {
            System.out.println("------------------------------------------");
            System.out.println("continuaras con el usuario normal: " + usuario);
            System.out.println("------------------------------------------");
        }

        empezar(dev, titulo, texto, autor, Podcast.usuario);
    }

    public static void empezar(Scanner registro, String titulo, String texto, String autor, String usuario) {
        int espera;
        String texto_n = texto;

        System.out.println("-------------------------------------------------------");
        System.out.println("bienvenido " + usuario + " a la seccion de crear podcast");
        System.out.println("porfavor sigue escribe lo solicitado");
        System.out.println("-------------------------------------------------------");
        System.out.println("Deseas establecer el numero de parrafos");
        System.out.println("1. Si");
        System.out.println("2. No");
        espera = registro.nextInt();
        registro.nextLine(); // Consumir el salto de línea

        if (espera == 1) {
            parrafos(registro, espera);
        } else if (espera == 2) {
            System.out.println("tu limite es de escritura son de: " + cantidad + " parrafos.");
            System.out.println("porfavor escribe lo que te interesa");
            
            StringBuilder textoCompleto = new StringBuilder();
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Párrafo " + (i + 1) + ":");
                textoCompleto.append(registro.nextLine()).append("\n");
            }
            Podcast.texto = textoCompleto.toString();
        }
        seguir(registro, titulo, Podcast.texto, autor, usuario);
    }

    public static void parrafos(Scanner wait, int cantidad) {
        int leer;

        System.out.println("cuantos parrafos quieres");
        leer = wait.nextInt();
        wait.nextLine();

        Podcast.cantidad = leer;

        StringBuilder textoCompleto = new StringBuilder();
        for (int i = 0; i < leer; i++) {
            System.out.println("Párrafo " + (i + 1) + ":");
            textoCompleto.append(wait.nextLine()).append("\n");
        }
        Podcast.texto = textoCompleto.toString();

        seguir(wait, titulo, Podcast.texto, autor, usuario);
    }

    public static void seguir(Scanner emp, String titulo, String texto, String autor, String usuario) {
        int t;
        String n_title = titulo;

        System.out.println("-------------------------------------------------------");
        System.out.println(usuario + " ahora vamos con el titulo");
        System.out.println("porfavor sigue escribe lo solicitado");
        System.out.println("-------------------------------------------------------");
        System.out.println("deseas actualizar el titulo del podcast de tu creacion: " + usuario);
        System.out.println("1. Si, deseo modificarlo");
        System.out.println("2. No, deseo dejarlo normal");

        t = emp.nextInt();
        emp.nextLine();

        if (t == 1) {
            System.out.println("El titulo actual del podscast es " + titulo);
            System.out.println("ahora inserta el nuevo titulo de tu podcast: ");
            n_title = emp.nextLine();
            Podcast.titulo = n_title;
            author(emp, autor);
        } else if (t == 2) {
            System.out.println("continuar con el mismo titulo: " + titulo);
            author(emp, autor);
        }
    }

    public static void author(Scanner authore, String autor) {
        String n_autor = autor;
        int ja;

        System.out.println("deseas cambiar el autor de tu podcast, puedes ser tu mismo!");
        System.out.println("1. Si " + " 2. No");
        ja = authore.nextInt();
        authore.nextLine();

        if (ja == 1) {
            System.out.println("Escribe el autor de tu podcast, puedes ser tu mismo!");
            n_autor = authore.nextLine();
            Podcast.autor = n_autor;
            menu(authore);
        } else if (ja == 2) {
            System.out.println("El autor del podcast es: " + autor);
            menu(authore);
        }
    }

    public static void ver(Scanner confirmation, String titulo, String texto, String autor, String usuario) {
        int confirmar;

        System.out.println("=========================================================");
        System.out.println("Hola bienvenido " + usuario + " aca podras ver tus podcast");
        System.out.println("deseas visualizar tus podcast");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("=========================================================");

        confirmar = confirmation.nextInt();
        confirmation.nextLine();

        if (confirmar == 1) {
            System.out.println("==== INFORMACIÓN DEL PODCAST ====");
            System.out.println("Título: " + Podcast.titulo);
            System.out.println("Párrafos: " + Podcast.texto);
            System.out.println("Autor: " + Podcast.autor);
            System.out.println("=================================");

            System.out.println("deseas volver al menu principal");
            System.out.println("0 para volver");
            confirmar = confirmation.nextInt();
            confirmation.nextLine();
            if (confirmar == 0) {
                System.out.println();
                menu(confirmation);
            }
        } else if (confirmar == 2) {
            System.out.println("saliendo de la visualizacion del podcast");
            menu(confirmation);
        }
    }

    public static void preguntar(Scanner preg) {
        int esperar;

        System.out.println("--------------------------");
        System.out.println("(?) " + " Deseas ver el menu");
        System.out.println("--------------------------");

        System.out.println("(+)" + "1. para entrar al menu");
        System.out.println("(+)" + "2. volver al inicio");
        System.out.println("(+)" + "3. salir");
        
        esperar = preg.nextInt();
        preg.nextLine();

        if (esperar == 1) {
            System.out.println("()=> " + " entrando al menu...");
            menu(preg);
        } else if (esperar == 2) {
            System.out.println("Cancelando accion, volviendo al inicio");
            bienvenida();
            preguntar(preg);
        } else if (esperar == 3) {
            System.out.println("(+) " + "has salido del programa exitosamente");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bienvenida();
        preguntar(sc);
        sc.close();
    }
}
