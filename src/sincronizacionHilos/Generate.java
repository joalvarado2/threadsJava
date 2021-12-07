package sincronizacionHilos;
/**
 * @author joalvarado
 */
public class Generate extends Thread {

    @Override
    public void run() {
        boolean vacio = true;
        Consume consume = new Consume(); //se instancia la clase consumir
        System.out.println(vacio);

        int i = 0;

        while (i <= 5) {
            if (i == 5) {
                vacio = false;
                consume.variableConsumir(vacio);//la variable cambia a false y es tomada por el hilo consumidor
            }
            try {
                Generate.sleep(1000); //en 10 segundos el hilo consumidor tomara la variable como false
            } catch (InterruptedException error) {
                System.out.println("Error en Generar clase " + error);
            }
            i++;
        }
    }
}