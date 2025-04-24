import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Sistemas de gestión de empleados");
        //Primer empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        System.out.print("Fecha de ingreso: ");
        String fecha = sc.nextLine();
        Empleado emp = new Empleado(nombre, cargo, salario, fecha);
        //Segundo empleado
        System.out.println("SEGUNDO EMPLEADO");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo2 = sc.nextLine();
        System.out.print("Salario: ");
        double salario2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fecha de ingreso: ");
        String fecha2 = sc.nextLine();
        Empleado emp2= new Empleado(nombre2,cargo2,salario2,fecha2);
        //Tercer empleado
        System.out.println("TERCER EMPLEADO");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo3 = sc.nextLine();
        System.out.print("Salario: ");
        double salario3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fecha de ingreso: ");
        String fecha3 = sc.nextLine();
        Empleado emp3= new Empleado(nombre3,cargo3,salario3,fecha3);

        // Mostrar todos los empleados
        System.out.println("\n--- Lista de Empleados ---");
        emp.mostrar();
        emp2.mostrar();
        emp3.mostrar();

        sc.close();
    }
}
