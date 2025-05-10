

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv =  new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);


    }
}
