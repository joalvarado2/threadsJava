package sincronizacionHilos;

/**
 * @author joalvarado
 */

public class Consume extends Thread {

    public void variableConsumir(boolean bandera) {
        System.out.println(bandera);
    }

    @Override
    public void run() {

    }
}
