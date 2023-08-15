package dio.apps.ReprodutorMusical;

public class Vlc extends ReprodutorMusica{
    @Override
    public void tocar() {
        System.out.println("Tocar Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Música");
    }
}
