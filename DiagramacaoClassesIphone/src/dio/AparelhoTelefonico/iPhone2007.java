package dio.AparelhoTelefonico;

public class iPhone2007 extends AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Correio de voz...");
    }
}
