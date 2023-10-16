import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;
import Interfaces.Telefone;

public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}
