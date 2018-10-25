
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Castro
 */
public class Numeroprimo {

    public static void main(String[] args) {

        int posicion = 1;
        int l = 3;
        boolean encontrardivisor = false;

        while (posicion < 10001) {

            encontrardivisor = true;
            for (int i = 2; i < l; i++) {
                if (l % i == 0) {
                    encontrardivisor = false;

                }
            }
            if (encontrardivisor == true) {

                posicion++;

            }
            l++;
        }

        System.out.println("posicion =" + posicion + "\n" + "numero" + (l-1));
    }

}
