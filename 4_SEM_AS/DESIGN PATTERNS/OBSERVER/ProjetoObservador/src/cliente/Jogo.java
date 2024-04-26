package cliente;
import padrao.*;
public class Jogo {
    public static void main(String[] args) {
        Assunto naveJogador = new NaveJogador("n1");
        Observador naveInimiga1 = new NaveInimiga("Inimiga1", naveJogador);
        
        naveJogador.setAcao(Acao.RECUAR);
        naveJogador.setAcao(Acao.VIRAR_DIREITA);
        
        Observador naveInimiga2 = new NaveInimiga("Inimiga2", naveJogador);
        naveJogador.setAcao(Acao.VIRAR_ESQUERTA);
        

    }
}
