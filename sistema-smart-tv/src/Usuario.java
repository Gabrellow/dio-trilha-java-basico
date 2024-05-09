public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume para : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume para: " + smartTv.volume);

        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
