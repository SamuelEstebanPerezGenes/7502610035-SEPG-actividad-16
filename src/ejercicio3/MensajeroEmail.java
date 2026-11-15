package ejercicio3;

public class MensajeroEmail extends Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}