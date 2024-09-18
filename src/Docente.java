import java.util.ArrayList;

/**
 *
 */
public abstract class Docente {
    public double salarioTotal;
    protected String nombreDoc;
    protected String facultadDoc;
    protected String cadiDoc;

    public Docente(String nombreDoc, String facultadDoc, String cadiDoc) {
        this.salarioTotal = 0;
        this.nombreDoc = nombreDoc;
        this.facultadDoc = facultadDoc;
        this.cadiDoc = cadiDoc;
    }

    public abstract void calcular_salario();

    public void establecerNombreDoc(String nombre) {
        this.nombreDoc = nombre;
    }

    public void establecerFacultadDoc(String facultad) {
        this.facultadDoc = facultad;
    }

    public void establecerCadiDoc(String cadi) {
        this.cadiDoc = cadi;
    }

    public String obtenerNombreDoc() {
        return this.nombreDoc;
    }

    public String obtenerFacultadDoc() {
        return this.facultadDoc;
    }

    public String obtenerCadiDoc() {
        return this.cadiDoc;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombreDoc + "\nFacultad: " + facultadDoc + "\nCADI: " + cadiDoc;
    }
}

