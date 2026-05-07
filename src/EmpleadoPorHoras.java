public class EmpleadoPorHoras extends Empleado {
    private int horas;

    public EmpleadoPorHoras(String nombre, int pagoPorHoras, int horas) {
        super(nombre, pagoPorHoras);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    int calcularSalario() {
        return getPagoPorHoras() * horas;
    }
}
