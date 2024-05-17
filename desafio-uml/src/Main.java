public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Teste dos métodos do Reprodutor Musical
        iphone.play();
        iphone.pause();
        iphone.selecionarMusica("Minha Música Favorita");

        // Teste dos métodos do Aparelho Telefônico
        iphone.fazerChamada("123456789");
        iphone.encerrarChamada();
        iphone.atenderChamada();
        iphone.acessarContatos();

        // Teste dos métodos do Navegador na Internet
        iphone.abrirPagina("www.exemplo.com");
        iphone.atualizarPagina();
        iphone.favoritarPagina("www.exemplo.com");
        iphone.historicoNavegador();

        // Teste dos métodos ligar e desligar
        iphone.ligar();
        iphone.desligar();
    }
}
