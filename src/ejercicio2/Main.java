package ejercicio2;

public class Main {
    public static void main(String[] args) {
        GestorDocumentos gestor = new GestorDocumentos();

        gestor.exportar(new DocumentoPDF("Informe anual"));

        gestor.exportar(new DocumentoWord("Carta de presentación"));
        gestor.exportar(new DocumentoExcel("Presupuesto 2026"));
    }
}