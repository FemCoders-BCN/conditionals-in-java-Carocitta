import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        Scanner semaforo = new Scanner(System.in);
        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
         System.out.print("Ingrese el color del semáforo (verde, amarillo, rojo): ");
         String color = semaforo.nextLine().trim().toLowerCase();

        //Si es verde imprime en la terminal: Puedes seguir
         if (color.equals("verde")) {
            System.out.println("Puedes seguir");
        //Si es amarillo imprime en la terminal: Ten cuidado
         } else if (color.equals("amarillo")) {
            System.out.println("Ten cuidado");
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        } else if (color.equals("rojo")) {
            System.out.println("¡¡¡Para!!!");
        //Si es otro color imprime en la terminal: El semáforo está dañado
        } else {
            System.out.println("El semáforo está dañado");
        }


        //Cambia el valor de la variable, corre el programa y mira el resultado 
     semaforo.close();
    }
    
}
