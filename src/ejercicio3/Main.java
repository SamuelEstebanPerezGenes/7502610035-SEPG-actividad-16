package ejercicio3;

public class Main {
    public static void main(String[] args) {
        ServicioMensajeria servicio = new ServicioMensajeria();

        servicio.enviarMensaje(new MensajeroEmail(), "ana@correo.com", "Hola, Ana");
        servicio.enviarMensaje(new MensajeroSMS(), "3001234567", "Tu código es 4821");
        }
}