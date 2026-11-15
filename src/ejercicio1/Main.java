package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        double precio = 100000;

        System.out.println("Precio original: " + precio);
        System.out.println("Con 20% de descuento: "
                + tienda.calcularPrecioFinal(precio, new DescuentoPorcentaje(20)));

        System.out.println("Con descuento fijo de 15000: "
                + tienda.calcularPrecioFinal(precio, new DescuentoFijo(15000)));
    }
}