public abstract class Empleado {
    private String nombre;
    private int pagoPorHoras;

    public Empleado(String nombre, int pagoPorHoras) {
        this.nombre = nombre;
        this.pagoPorHoras = pagoPorHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPagoPorHoras() {
        return pagoPorHoras;
    }

    public void setPagoPorHoras(int pagoPorHoras) {
        this.pagoPorHoras = pagoPorHoras;
    }

    abstract int calcularSalario();
}
