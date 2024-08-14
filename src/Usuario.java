public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume da Tv: (aumentou) " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume da Tv: (diminuiu)" + smartTv.volume);

        smartTv.mudarCanal(6);
        
        smartTv.aumentarCanal();
        
        smartTv.diminuirCanal();

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Desligada? " + smartTv.ligada);

    }
}
