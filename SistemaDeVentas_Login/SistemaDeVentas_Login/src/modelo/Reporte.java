
package modelo;

import java.util.Scanner;

public class Reporte {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(10); 
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Pedido de una mesa");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Número de mesa: ");
                    int numeroMesa = scanner.nextInt();
                    Mesa mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        System.out.print("Nombre del producto: ");
                        String producto = scanner.next();
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();
                        System.out.print("Precio unitario: ");
                        double precio = scanner.nextDouble();
                        Pedido pedido = new Pedido(producto, cantidad, precio);
                        mesa.agregarPedido(pedido);
                    } else {
                        System.out.println("Mesa no encontrada.");
                    }
                    break;

                case 2:
                    System.out.print("Número de mesa: ");
                    numeroMesa = scanner.nextInt();
                    mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        mesa.mostrarPedidos();
                    } else {
                        System.out.println("Mesa no encontrada.");
                    }
                    break;

                case 3:
                    restaurante.mostrarEstadoMesas();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}


