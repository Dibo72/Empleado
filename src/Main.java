import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new EmpleadoFijo("Jose", 23);
        empleados[1] = new EmpleadoPorHoras("Antonio", 30, 20);
        empleados[2] = new EmpleadoFijo("Pepe", 48);
        empleados[3] = new EmpleadoFijo("Anselmo", 70);
        empleados[4] = new EmpleadoPorHoras("Susana", 50, 80);

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario() + "$");
        }
    }
}