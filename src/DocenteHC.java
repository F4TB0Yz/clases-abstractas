import java.util.Scanner;

public final class DocenteHC extends Docente {

    int horasTrab;
    double valorHora;
    double sueldoMesHoras;

    public DocenteHC(String nombreDoc, String facultadDoc, String cadiDoc, int horasTrab, double valorHora, double sueldoMesHoras)  {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horasTrab  = horasTrab;
    }

    public void establecerHorasTrab(int horas){
        this.horasTrab = horas;
    }

    public void establecerValorHora(double valor){
        this.valorHora = valor;
    }

    @Override
    public void calcular_salario(){

    }

    public void calcularSueldoMesHoras(){
        this.sueldoMesHoras = this.horasTrab * this.valorHora;
    }

    public double obtenerSueldoMesHoras(){
        return this.sueldoMesHoras;
    }
}
