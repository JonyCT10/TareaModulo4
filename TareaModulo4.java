/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    
    
    public Empleado(String nombre, int edad, double salario) {
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
    }
    
    
    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
    
    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese salario: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(nombre, edad, salario);
                    break;
                case 2:
                    gestor.mostrarempleados();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}

class GestorEmpleados{
    ArrayList<Empleado> listaempleados=new ArrayList<>();
    
    public void agregarEmpleado(String nombre, int edad, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
        listaempleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente.");
    }
    
    public void mostrarempleados() {
        if (listaempleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : listaempleados) {
                emp.mostrar_info();
            }
        }
    }
}