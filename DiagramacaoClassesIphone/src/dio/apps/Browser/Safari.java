package dio.apps.Browser;

public class Safari extends Browser{
    @Override
    public void exibirPagina() {
        System.out.println("Safari: Exibir Pagina");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Safari: Adicionar Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Safari: Adicionar Nova Aba");
    }
}
