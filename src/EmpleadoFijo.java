public class EmpleadoFijo extends Empleado {
    public EmpleadoFijo(String nombre, int pagoPorHoras) {
        super(nombre, pagoPorHoras);
    }

    @Override
    int calcularSalario() {
        return getPagoPorHoras() * 8 * 30;
    }
}
