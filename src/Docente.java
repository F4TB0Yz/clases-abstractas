/**
 *
 */
public abstract sealed class Docente permits DocenteHC, DocenteTCO {
    protected String nombreDoc;
    protected String facultadDoc;
    protected String cadiDoc;

    public abstract void calcular_salario();

    public Docente(String nombreDoc, String facultadDoc, String cadiDoc) {
        this.nombreDoc = nombreDoc;
        this.facultadDoc = facultadDoc;
        this.cadiDoc = cadiDoc;
    }


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
}


