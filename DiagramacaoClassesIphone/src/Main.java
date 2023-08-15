import dio.AparelhoTelefonico.iPhone2007;
import dio.apps.ReprodutorMusical.Vlc;
import dio.apps.Browser.*;


public class Main {
    public static void main(String[] args) {
        iPhone2007 iphone = new iPhone2007();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        System.out.println(" ");

        Vlc vlc = new Vlc();
        vlc.selecionarMusica();
        vlc.tocar();
        vlc.pausar();

        System.out.println(" ");

        Browser navegador = null;
        String navegadorEscolhido = "opera";

        if (navegadorEscolhido.equals("safari")) {
            navegador = new Safari();
        } else if (navegadorEscolhido.equals("opera")) {
            navegador = new Opera();
        } else if (navegadorEscolhido.equals("chrome")) {
            navegador = new Chrome();
        }

        navegador.adicionarNovaAba();
        navegador.adicionarPagina();
        navegador.exibirPagina();




    }
}