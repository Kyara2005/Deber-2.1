import java.util.Scanner;
public class PruebaJugadores {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¡¡Información general del jugador!!");
        System.out.println("Jugadores en lista: ");

        //Datos quemados
        jugadores jg1 = new jugadores("Leon","Delantero",23,9);
        //Jugador 2
        System.out.print("Escriba el nombre del jugador nuevo: ");
        String nombre2 = sc.nextLine();
        System.out.print("Posicion: ");
        String posicion2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();
        System.out.print("Numero de camiseta: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        jugadores jg2 = new jugadores(nombre2,posicion2,edad2,n2);
        //jugador 3
        System.out.println("Tercer jugador");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Edad: ");
        int edad3 = sc.nextInt();
        jugadores jg3 = new jugadores(nombre3, "Portero", edad3, 1);

        //Llamar al metodo
        System.out.println("\n----- Lista de jugadores ----\n");
        jg1.agregar();
        System.out.println();

        jg2.agregar();
        System.out.println(); //Salto de linea

        jg3.agregar();
    }
}



