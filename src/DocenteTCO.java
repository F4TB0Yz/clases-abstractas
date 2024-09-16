/**
 *
 */
public final class DocenteTCO extends Docente{
    public double sueldoMensual;
    public int canTrabGrado;
    public double valorHoraAsesor;
    public double sueldoBasico;

    public DocenteTCO(String nombreDoc,
                      String facultadDoc,
                      String cadiDoc,
                      int canTrabGrado,
                      double valorHoraAsesor,
                      double sueldoBasico
                      ) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.sueldoMensual = sueldoMensual;
        this.canTrabGrado = canTrabGrado;
        this.valorHoraAsesor = valorHoraAsesor;
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

    public void calcularSueldoMensual(double sueldo) {
        double sueldo_extra = (this.canTrabGrado * this.valorHoraAsesor) * 2;
        this.sueldoMensual = this.sueldoBasico + sueldo_extra;
    }

    public double obtenerSueldoMensual() {
        return this.sueldoMensual;
    }
}

