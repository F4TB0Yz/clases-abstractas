import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Docente> docentes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean usuario_bucle = true;

        do {

            usuario_bucle = seleccionarTipoDocente();

        } while (usuario_bucle);

    }

    public static boolean seleccionarTipoDocente() {
        System.out.println("Seleccione el tipo de docente:");
        System.out.println("1. DocenteHC");
        System.out.println("2. DocenteTCO");
        System.out.println("3. Salir");

        int tipoDocente = scanner.nextInt();

        switch (tipoDocente) {
            case 1:
                String[] datos_docente = obtenerDatosDocentes();
                String nombre = datos_docente[0];
                String facultad = datos_docente[1];
                String cadi = datos_docente[2];

                // Ingresar datos específicos para DocenteHC
                System.out.print("Horas Trabajadas: ");
                int horasTrab = scanner.nextInt();
                System.out.print("Valor por Hora: ");
                double valorHora = scanner.nextDouble();

                DocenteHC docenteHC = new DocenteHC(nombre, facultad, cadi, horasTrab, valorHora);
                docentes.add(docenteHC);
                docenteHC.calcular_salario();
                System.out.println(docenteHC);
                scanner.nextLine();
                return true;
            case 2:
                String[] datos_docente = obtenerDatosDocentes();
                String nombre = datos_docente[0];
                String facultad = datos_docente[1];
                String cadi = datos_docente[2];

                // Ingresar datos específicos para DocenteTCO
                System.out.print("Cantidad de Trabajos de Grado: ");
                int canTrabGrado = scanner.nextInt();
                System.out.print("Valor por Hora de Asesoría: ");
                double valorHoraAsesor = scanner.nextDouble();
                System.out.print("Sueldo Básico: ");
                double sueldoBasico = scanner.nextDouble();

                DocenteTCO docenteTCO = new DocenteTCO(nombre, facultad, cadi, canTrabGrado, valorHoraAsesor, sueldoBasico);
                docentes.add(docenteTCO);
                docenteTCO.calcular_salario();
                System.out.println(docenteTCO);
                scanner.nextLine();
                return true;
            case 3:
                System.out.println("Total de los salarios: " + obtenerTotalSalarios(docentes));
                return false;
            default:
                System.out.println("Opción no válida.");
                return true;
        }

    }

    public static String[] obtenerDatosDocentes() {
        System.out.println();
        System.out.println("Ingrese los datos para el Docente:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Facultad: ");
        String facultad = scanner.nextLine();
        System.out.print("CADI: ");
        String cadi = scanner.nextLine();
        System.out.println();

        return new String[] {nombre, facultad, cadi};
    }

    public static double obtenerTotalSalarios(ArrayList<Docente> docentes) {
        double total = 0;
        for (Docente docente : docentes) {
            total += docente.salarioTotal;
        }

        return total;
    }
}