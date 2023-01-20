package concatenar;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"Argentina", "Venezuela", "España"};
        String resultado="";
        for(String pais: paises)resultado += pais+" ";

        System.out.println(resultado);
    }
}