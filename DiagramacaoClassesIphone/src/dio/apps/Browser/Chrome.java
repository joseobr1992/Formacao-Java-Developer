package dio.apps.Browser;

public class Chrome extends Browser{
    @Override
    public void exibirPagina() {
        System.out.println("Chrome: Exibir Pagina");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Chrome: Adicionar Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Chrome: Adicionar Nova Aba");
    }
}
