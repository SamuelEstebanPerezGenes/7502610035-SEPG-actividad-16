package ejercicio1;

public class DescuentoFijo extends Descuento {
    private double valor;

    public DescuentoFijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicar(double precio) {
        return Math.max(0, precio - valor); // el precio nunca queda negativo
    }
}