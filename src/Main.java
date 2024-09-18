import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para DocenteTCO
        System.out.println("Ingrese los datos para el Docente:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Facultad: ");
        String facultad = scanner.nextLine();
        System.out.print("CADI: ");
        String cadi = scanner.nextLine();

        // Seleccionar tipo de docente
        System.out.println("Seleccione el tipo de docente:");
        System.out.println("1. DocenteHC");
        System.out.println("2. DocenteTCO");
        int tipoDocente = scanner.nextInt();

        switch (tipoDocente) {
            case 1:
                // Ingresar datos específicos para DocenteHC
                System.out.print("Horas Trabajadas: ");
                int horasTrab = scanner.nextInt();
                System.out.print("Valor por Hora: ");
                double valorHora = scanner.nextDouble();

                DocenteHC docenteHC = new DocenteHC(nombre, facultad, cadi, horasTrab, valorHora);
                docenteHC.calcular_salario();
                docenteHC.mostrarInformacion();
                break;

            case 2:
                // Ingresar datos específicos para DocenteTCO
                System.out.print("Cantidad de Trabajos de Grado: ");
                int canTrabGrado = scanner.nextInt();
                System.out.print("Valor por Hora de Asesoría: ");
                double valorHoraAsesor = scanner.nextDouble();
                System.out.print("Sueldo Básico: ");
                double sueldoBasico = scanner.nextDouble();

                DocenteTCO docenteTCO = new DocenteTCO(nombre, facultad, cadi, canTrabGrado, valorHoraAsesor, sueldoBasico);
                docenteTCO.calcular_salario();
                docenteTCO.mostrarInformacion();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}