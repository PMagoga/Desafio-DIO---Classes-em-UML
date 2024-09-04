public class AparelhoTelefonico implements IPhone{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o nº: " + numero);
    }

    @Override
    public void pausar() {
        System.out.println("Aparelho telefônico não pausa músicas");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Aparelho telefônico não seleciona música");
    }

    public void atender(){
        System.out.println("Atendendo a chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
