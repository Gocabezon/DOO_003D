/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenciaviajes;


import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class AgenciaViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Vuelo vuelo= new Vuelo("01", "Santiago", "Osorno", "asientosDisponibles");
        CompanniaAerea companniaAerea = new CompanniaAerea(1, "asda", "a");
        Reserva reserva = new Reserva(vuelo, "02");
        PasajeroFrecuente pasajeroFrecuente= new PasajeroFrecuente("1", 1);
        Cliente cliente = new Cliente("1", "gonzalo", reserva, pasajeroFrecuente);
        
        int opcion=0;
        
        while(true){
            System.out.println("*********Menu********");
            System.out.println("(1) Buscar Vuelo");
            System.out.println("(2) reservar Asientos");
            System.out.println("(3) Acumular Puntos");
            System.out.println("(4) Consultar informacion compannias");
            System.out.println("(5) Salir");
            
            
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:   
                    System.out.println("Ingrese vuelo a buscar (id vuelo minimo 2 digitos)");
                    String idVueloConsulta = entrada.nextLine();
                    while(true){
                        if (idVueloConsulta.length() >1){
                            System.out.println("Id valido, buscando");
                        }else{
                            System.out.println("Ingrese un id de vuelo valido");
                        }
                    }
                case 2:   
                    System.out.println("Ingrese Vuelo a reservar (2 digitos)");
                    String vueloReserva = entrada.nextLine();
                    while(true){
                        if (vueloReserva.length() >1){
                            System.out.println("Entrada valida, buscando");
                            if (vueloReserva == vuelo.getIdVuelo()){
                                System.out.println("vuelo encontrado");
                                System.out.println("Ingrese asiento a reservar (2 digitos)");
                            String asientoReserva = entrada.nextLine();
                            
                            while(true){
                                 if (asientoReserva.length() >1){
                            System.out.println("Entrada valida, reservando");
                               
                            break;
                        }else{
                            System.out.println("Entrada invalida,intente nuevamente");
                            }
                            }
                            }else{
                                System.out.println("vuelo no encontrado");
                            }
                            
                            
                            break;
                        }else{
                            System.out.println("Entrada invalida,intente nuevamente");
                        }}
                    System.out.println("Ingrese asiento a reservar (2 digitos)");
                    String asientoReserva = entrada.nextLine();
                    while(true){
                        if (asientoReserva.length() >1){
                            System.out.println("Entrada valida, reservando");
                            
                            break;
                        }else{
                            System.out.println("Entrada invalida,intente nuevamente");
                            }}
                                
                            
                case 3:   
                    System.out.println("Ingrese puntos a acumular");
                case 4:   
                    System.out.println("Ingrese compannia a consultar");
                case 5:   
                    System.out.println("Saliendo");
                    break;
                    
            }
            
            
        }
    }
    
}
