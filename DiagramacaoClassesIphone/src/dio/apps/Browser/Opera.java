package dio.apps.Browser;

public class Opera extends Browser{
    @Override
    public void exibirPagina() {
        System.out.println("Opera: Exibir Página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Opera: Adicionar Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Opera: Adicionar Nova Aba");
    }
}
