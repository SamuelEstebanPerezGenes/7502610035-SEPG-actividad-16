package ejercicio3;

public class ServicioMensajeria {
    public void enviarMensaje(Mensajero mensajero, String destinatario, String mensaje) {
        mensajero.enviar(destinatario, mensaje);
    }
}