import java.util.Scanner;
public final class DocenteHC extends Docente {
    private int horasTrab;
    private double valorHora;
    private double sueldoMesHoras;

    public DocenteHC(String nombreDoc, String facultadDoc, String cadiDoc, int horasTrab, double valorHora) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }

    public void establecerHorasTrab(int horas) {
        this.horasTrab = horas;
    }

    public void establecerValorHora(double valor) {
        this.valorHora = valor;
    }

    public void calcularSueldoMesHoras() {
        this.sueldoMesHoras = this.horasTrab * this.valorHora;
    }

    public double obtenerSueldoMesHoras() {
        return this.sueldoMesHoras;
    }

    @Override
    public void calcular_salario() {
        calcularSueldoMesHoras();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Trabajadas: " + horasTrab);
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("Sueldo Mensual por Horas: " + obtenerSueldoMesHoras());
    }
}
