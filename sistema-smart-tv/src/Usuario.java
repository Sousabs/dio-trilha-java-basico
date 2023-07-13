public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal atual: " + SmartTV.canal);

        smartTV.mudarDeCanal(13);

         System.out.println("Canal atual: " + SmartTV.canal);

        System.out.println("Volume atual: " + SmartTV.volume);

        System.out.println("TV ligada ?" + SmartTV.ligada);
        System.out.println("Canal atual: " + SmartTV.canal);
        System.out.println("Volume atual: " + SmartTV.volume);

        smartTV.ligar ();
        System.out.println("Novo Status -> TV ligada ?" + SmartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV desligada ?" + SmartTV.ligada);
    }
}
