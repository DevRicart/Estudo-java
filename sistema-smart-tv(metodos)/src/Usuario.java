public class Usuario {
  
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();
    
    System.out.println(" ");
    System.out.println("TV Ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " +smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);
    
    smartTv.ligar();
    smartTv.aumentarVolume();
    smartTv.mudarCanal(406);

    System.out.println(" ");
    System.out.println("TV Ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " +smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);
  }
}
