package ejercicio3;

public class Main {
    public static void main(String[] args) {
        ServicioMensajeria servicio = new ServicioMensajeria();

        servicio.enviarMensaje(new MensajeroEmail(), "ana@correo.com", "Hola, Ana");
    }
}