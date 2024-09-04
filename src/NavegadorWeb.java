public class NavegadorWeb implements IPhone{
    @Override
    public void ligar(String numero) {
        System.out.println("Navegador não liga");
    }

    @Override
    public void pausar() {
        System.out.println("Navegador não pausa música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Navegador não seleciona música");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
