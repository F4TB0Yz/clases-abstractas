public class Main {
    public static void main(String[] args) {
        DocenteHC dhc = new DocenteHC("Julian", "Ingenieria", "Programacion", 8, 2000, 40000);
        DocenteTCO doc_tco = new DocenteTCO("Felipe", "SISTEMAS", "Programacion", 5, 7000, 1000000);

        System.out.println(dhc.obtenerSueldoMesHoras());


    }
}