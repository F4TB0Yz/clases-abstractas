import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para DocenteTCO
        System.out.println("Ingrese los datos para DocenteTCO:");
        System.out.print("Nombre: ");
        String nombreTCO = scanner.nextLine();
        System.out.print("Facultad: ");
        String facultadTCO = scanner.nextLine();
        System.out.print("CADI: ");
        String cadiTCO = scanner.nextLine();
        System.out.print("Cantidad de Trabajos de Grado: ");
        int canTrabGrado = scanner.nextInt();
        System.out.print("Valor por Hora de Asesoría: ");
        double valorHoraAsesor = scanner.nextDouble();
        System.out.print("Sueldo Básico: ");
        double sueldoBasico = scanner.nextDouble();

        DocenteTCO docenteTCO = new DocenteTCO(nombreTCO, facultadTCO, cadiTCO, canTrabGrado, valorHoraAsesor, sueldoBasico);
        docenteTCO.calcular_salario();
        docenteTCO.mostrarInformacion();

        System.out.println();

        // Ingresar datos para DocenteHC
        System.out.println("Ingrese los datos para DocenteHC:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Nombre: ");
        String nombreHC = scanner.nextLine();
        System.out.print("Facultad: ");
        String facultadHC = scanner.nextLine();
        System.out.print("CADI: ");
        String cadiHC = scanner.nextLine();
        System.out.print("Horas Trabajadas: ");
        int horasTrab = scanner.nextInt();
        System.out.print("Valor por Hora: ");
        double valorHora = scanner.nextDouble();

        DocenteHC docenteHC = new DocenteHC(nombreHC, facultadHC, cadiHC, horasTrab, valorHora);
        docenteHC.calcular_salario();
        docenteHC.mostrarInformacion();

        scanner.close();
    }
}