// Classe que implementa a interface IPhone

public class ReprodutorMusical implements IPhone{

    @Override
    public void ligar(String numero) {
        System.out.println("Reprodutor musical não pode fazer chamadas.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    public void tocar(){
        System.out.println("Música tocando...");
    }
}
