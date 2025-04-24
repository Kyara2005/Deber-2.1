public class jugadores{
    String nombre;
    String posicion;
    int edad;
    int n;
//Constructor
public jugadores(String nombre, String posicion, int edad, int n){
    this.nombre= nombre;
    this.posicion = posicion;
    this.edad= edad;
    this.n= n;
}
public void agregar(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Posicion: "+posicion);
    System.out.println("Edad: "+edad);
    System.out.println("Numero: "+n);
    }
}



