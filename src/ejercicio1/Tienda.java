package ejercicio1;

public class Tienda {
    public double calcularPrecioFinal(double precio, Descuento descuento) {
        return descuento.aplicar(precio);
    }
}