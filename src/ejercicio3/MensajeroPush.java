package ejercicio3;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
    }
}