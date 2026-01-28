import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[20];
        String[] descripciones = new String[20];
        int[] cantidades = new int[20];

        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- INVENTARIO DE LABORATORIO ---");
            System.out.println("1. Ingresar equipo");
            System.out.println("2. Consultar equipos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                if (contador < nombres.length) {
                    System.out.print("Nombre del equipo: ");
                    nombres[contador] = sc.nextLine();

                    System.out.print("Descripción del equipo: ");
                    descripciones[contador] = sc.nextLine();

                    System.out.print("Cantidad disponible: ");
                    cantidades[contador] = sc.nextInt();
                    sc.nextLine();

                    contador++;
                    System.out.println("Equipo agregado al inventario.");
                } else {
                    System.out.println("El inventario está lleno.");
                }

            } else if (opcion == 2) {

                System.out.println("\n--- EQUIPOS REGISTRADOS ---");

                if (contador == 0) {
                    System.out.println("No hay equipos registrados.");
                } else {
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Equipo " + (i + 1));
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("Descripción: " + descripciones[i]);
                        System.out.println("Cantidad: " + cantidades[i]);
                        System.out.println();
                    }
                }

            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
