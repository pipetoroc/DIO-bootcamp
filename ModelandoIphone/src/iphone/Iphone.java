package iphone;

import aparelhoTelefone.AparelhoTelefone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para el numero " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo o Iphone");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ninguem atendeou o iphone, encaminhando para o correio de voz");
    }

    // Navegador

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo paginas no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina desde o Iphone");
    }

    // Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando musica desde o Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica desde o Iphone");
    }

    @Override
    public void seleccionarMusica(String musica) {
        System.out.println("A musica seleccionada é " + musica);
    }
}
