package com.sanvalero;

import com.sanvalero.domain.Pan;
import com.sanvalero.domain.Pasteles;
import com.sanvalero.domain.Tartas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menuprincipal {

    Scanner sc = new Scanner(System.in);

    private boolean salirMenu = false;

    ArrayList<Pasteles> listadoPasteles = new ArrayList<>();
    ArrayList<Tartas> listadoTartas = new ArrayList<>();
    ArrayList<Pan> listadoPan = new ArrayList<>();

    public void menuInicio() {
        do {
            System.out.println("Elige un parametro:\n..........................");
            System.out.println("1) Registra sus articulos");
            System.out.println("2) Listar sus productos");
            System.out.println("3) Salir del menú\n............................");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    registrarProductos();
                    break;
                case 2:
                    listarArticulos();
                    break;
                case 3:
                    salirMenu = true;
                    System.out.println("............................\nSaliendo de programa");
            }
        } while (!salirMenu);
    }

    private void registrarProductos() {
        boolean volver = false;
        do {
            System.out.println("Elige un artículo:\n..........................");
            System.out.println("1) Pasteles");
            System.out.println("2) Tartas");
            System.out.println("3) Pan");
            System.out.println("4) Volver al menú anterior\n............................");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    ingresarPasteles();
                    break;
                case 2:
                    ingresarTartas();
                    break;
                case 3:
                    ingresarPan();
                    break;
                case 4:
                    volver = true;
                    System.out.println("............................\nVolviendo al menú");
            }
        } while (!volver);
    }

    private void ingresarPan() {
        System.out.println("Ponga el nombre:");
        String nombre = sc.nextLine();

        System.out.println("De que tamaño (Pequeño, Mediano, Grande):");
        String tamanio = sc.nextLine();

        System.out.println("Cual es su precio:");
        float precio = sc.nextFloat();

        System.out.println("Que cantidad quieres:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingredientes (sin gluten, integral, sin trazas, sin sal)");
        String descripcion = sc.nextLine();

        Pan pan = new Pan(nombre, tamanio, precio, cantidad, descripcion);
        listadoPan.add(pan);

        System.out.println("............................\nPan ingresado con éxito\n............................");
    }

    private void ingresarTartas() {
        System.out.println("Ponga el nombre:");
        String nombre = sc.nextLine();

        System.out.println("De que sabor (Selva, Reina, Tres chocolates...):");
        String sabor = sc.nextLine();

        System.out.println("Que cantidad quieres (raciones):");
        int cantidad = sc.nextInt();

        System.out.println("Cual es su precio:");
        float precio = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingredientes");
        String descripcion = sc.nextLine();

        Tartas tartas = new Tartas(nombre, sabor, cantidad, precio, descripcion);
        listadoTartas.add(tartas);

        System.out.println("............................\nTartas ingresado con éxito\n............................");
    }

    private void ingresarPasteles() {
        System.out.println("Ponga el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Cuanto peso quiere (100, 300, 500):");
        int peso = sc.nextInt();

        System.out.println("Cual es su precio:");
        float precio = sc.nextFloat();

        System.out.println("Que cantidad quieres:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Sabores...");
        String descripcion = sc.nextLine();

        Pasteles pasteles = new Pasteles(nombre, peso, descripcion, precio, cantidad);
        listadoPasteles.add(pasteles);

        System.out.println("............................\nPasteles ingresados con éxito\n............................");
    }

    private void listarArticulos() {
        boolean volver = false;
        do {
            System.out.println("Elige una lista:\n..........................");
            System.out.println("1) Lista Pasteles");
            System.out.println("2) Lista Tartas");
            System.out.println("3) Lista Pan");
            System.out.println("4) Volver al menu anterior\n............................");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    listadoPasteles();
                    break;
                case 2:
                    listadoTartas();
                    break;
                case 3:
                    listadoPan();
                    break;
                case 4:
                    volver = true;
                    System.out.println("............................\nVolviendo al menú");
            }
        } while (!volver);
    }

    private void listadoPasteles() {
        System.out.println("Pasteles ingresadas\n............................");

        for (Pasteles pasteles : listadoPasteles) {
            System.out.println("Nombre: " + pasteles.getNombre());
            System.out.println("Peso(gramos): " + pasteles.getPeso());
            System.out.println("Precio(euros): " + pasteles.getPrecio());
            System.out.println("Cantidad: " + pasteles.getCantidad());
            System.out.println("Descripción(sabores, especificaciones...): " + pasteles.getDescripcion());
            System.out.println("............................");
        }
    }

    private void listadoTartas() {
        System.out.println("Tartas ingresadas\n............................");

        for (Tartas tartas : listadoTartas) {
            System.out.println("Nombre: " + tartas.getNombre());
            System.out.println("Sabor(selva, reina...):" + tartas.getSabor());
            System.out.println("Cantidad: " + tartas.getCantidad());
            System.out.println("Precio(euros): " + tartas.getPrecio());
            System.out.println("Ingredientes_extra: " + tartas.getDescripcion());
            System.out.println("............................");
        }
    }

    private void listadoPan() {
        System.out.println("Pan ingresado\n............................");

        for (Pan pan : listadoPan) {
            System.out.println("Nombre: " + pan.getNombre());
            System.out.println("Tamaño (Pequeño, Mediano, Grande): " + pan.getTamanio());
            System.out.println("Precio(euros): " + pan.getPrecio());
            System.out.println("Cantidad: " + pan.getCantidad());
            System.out.println("Ingredientes (sin gluten, integral, sin trazas, sin sal): " + pan.getDescripcion());
            System.out.println("............................");
        }
    }
}
