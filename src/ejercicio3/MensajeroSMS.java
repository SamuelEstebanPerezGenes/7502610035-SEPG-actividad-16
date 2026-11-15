package ejercicio3;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}