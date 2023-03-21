package tv;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public class Television {

        private boolean enReparacion;

        public Television() {
            enReparacion = false;
        }

        public void mandarAReparar() {
            if (enReparacion) {
                System.out.println("La televisión ya está en reparación.");
            } else {
                enReparacion = true;
                System.out.println("La televisión ha sido enviada a reparación.");
            }
        }

        public void indicarRecogida() {
            if (enReparacion) {
                enReparacion = false;
                System.out.println("La televisión ha sido reparada y puede ser recogida.");
            } else {
                System.out.println("No se puede indicar la recogida si la televisión no está en reparación.");
            }
        }

    }
}





