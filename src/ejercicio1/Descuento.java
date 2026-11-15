package ejercicio1;

// Abstracción: define QUÉ hace un descuento, no cómo
public abstract class Descuento {
    public abstract double aplicar(double precio);
}