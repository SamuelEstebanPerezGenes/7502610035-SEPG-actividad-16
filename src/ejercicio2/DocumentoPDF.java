package ejercicio2;

public class DocumentoPDF extends Documento {

    public DocumentoPDF(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando '" + titulo + "' a PDF.");
    }
}