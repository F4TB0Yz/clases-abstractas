/**
 *
 */
public final class DocenteTCO extends Docente {
    private double sueldoMensual;
    private int canTrabGrado;
    private double valorHoraAsesor;
    private double sueldoBasico;

    public DocenteTCO(String nombreDoc, String facultadDoc, String cadiDoc, int canTrabGrado, double valorHoraAsesor, double sueldoBasico) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.canTrabGrado = canTrabGrado;
        this.valorHoraAsesor = valorHoraAsesor;
        this.sueldoBasico = sueldoBasico;
    }

    public void establecerSueldoBasico(double sueldo) {
        this.sueldoBasico = sueldo;
    }

    public void establecerCanTrabGrado(int canTrabGrado) {
        this.canTrabGrado = canTrabGrado;
    }

    public void establecerValorHoraAsesor(double valorHora) {
        this.valorHoraAsesor = valorHora;
    }

    public void calcularSueldoMensual() {
        double sueldoExtra = (this.canTrabGrado * this.valorHoraAsesor) * 2;
        this.sueldoMensual = this.sueldoBasico + sueldoExtra;
    }

    public double obtenerSueldoMensual() {
        return this.sueldoMensual;
    }

    @Override
    public void calcular_salario() {
        calcularSueldoMensual();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo Mensual: " + obtenerSueldoMensual() + "\nCantidad de Trabajos de Grado: " + canTrabGrado + "\nValor por Hora de Asesoría: " + valorHoraAsesor + "\nSueldo Básico: " + sueldoBasico;
    }
}

