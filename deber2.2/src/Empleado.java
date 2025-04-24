public class Empleado {
    String nombre;
    String cargo;
    Double salario;
    String fecha;

    // Constructor
    public Empleado(String nombre, String cargo, Double salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
    }

    //metodo
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fecha);
        System.out.println();
    }
}


