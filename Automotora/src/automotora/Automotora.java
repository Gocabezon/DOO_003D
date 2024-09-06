/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona pVendedor = new Persona();
        Vendedor vendedorUno = new Vendedor();
        Vehiculo auto = new Vehiculo();
        Persona p2 = new Persona("123456789-2", "Juan", "Valdes", 100, LocalDate.ofYearDay(1995, 360), true);
        Scanner entrada = new Scanner(System.in);
        Scanner entradaDos = new Scanner (System.in);
        p1.setNombre("Pedro");
        System.out.println(p2);
        
        
        int opcion = 3;
        
        //do{
          //      System.out.println("do while");
        //}
          //      while (opcion != 3);
                
        while (opcion !=5){
            System.out.println("**********Menu*********");
            System.out.println("[1] - Agregar Vendedor");
            System.out.println("[2] - Agregar Cliente");
            System.out.println("[3] - Agregar Automovil");
            System.out.println("[4] - Agregar Venta");
            System.out.println("[5] - Salir");
            
            
            opcion= entrada.nextInt();
          
            
            switch(opcion){
                case 1:
                    System.out.println("opcion 1");
                    System.out.println("ingrese el run del vendedor");
                    pVendedor.setRun(entradaDos.next());
                    System.out.println("ingrese el nombre del vendedor");
                    pVendedor.setNombre(entradaDos.next());
                    System.out.println("ingrese el apellido del vendedor");
                    pVendedor.setApellido(entradaDos.next());
                    System.out.println("ingrese el telefono del vendedor");
                    pVendedor.setTelefono(entrada.nextInt());
                    System.out.println("ingrese el año de nacimiento del vendedor");
                int anio = entrada.nextInt();
                    System.out.println("ingrese el mes de nacimiento del vendedor (1-12)");
                int mes = entrada.nextInt();
                    System.out.println("ingrese el dia de nacimiento del vendedor (1-31)");
                int dia = entrada.nextInt();
                pVendedor.setFecha_nacimiento(LocalDate.of(anio, mes, dia));
                    System.out.println("ingrese el estado legal del vendedor");
                    pVendedor.setCasado(entrada.nextBoolean());
                    
                    vendedorUno.setId_vendedor(1);
                    vendedorUno.setPersona(pVendedor);
                    break;



                case 2:
                    System.out.println("opcion 2");
                case 3:
                    System.out.println("opcion 3");
                    auto.setPatente("abcd12");
                    auto.setPrecio(5000);
                    auto.mostrarElementos(1, auto);
                    
                    
                case 4:
                    System.out.println("opcion 4");
                case 5:
                    System.out.println("opcion 5");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }}
    }
    
}
