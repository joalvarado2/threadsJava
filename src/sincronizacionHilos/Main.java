package sincronizacionHilos;

/**
 * @author joalvarado
 */

public class Main {

    public static void main(String[] args) {
        Clean clean = new Clean();
        clean.start();

        Generate generate = new Generate();
        generate.start();

        Consume consume = new Consume();
        consume.start();

    }
}
