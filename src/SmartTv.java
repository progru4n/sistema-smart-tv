public class SmartTv {
    boolean ligada = false;

    int canal = 1;

    int volume = 25;

    public void aumentarVolume() {

        volume++;
    }

    public void diminuirVolume() {

        volume--;
    }

    public void aumentarCanal() {

        canal++;

        System.out.println("Canal Atual: " + canal);
    }

    public void diminuirCanal() {

        canal--;
        
        System.out.println("Canal Atual: " + canal);
    }

    public void mudarCanal(int value) {

        int canal = value;

        System.out.println("O canal atual é: " + canal);

    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
