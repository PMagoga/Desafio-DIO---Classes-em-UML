// Classe Main para testes

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Minha Musica Favorita");
        reprodutor.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorWeb navegador = new NavegadorWeb();
        navegador.exibirPagina("https://www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}