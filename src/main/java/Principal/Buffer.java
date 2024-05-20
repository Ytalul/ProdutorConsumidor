package Principal;

import java.util.ArrayList;
import java.util.Random;

public class Buffer {
    public ArrayList<Integer> listaInteiros = new ArrayList<Integer>();

    public void AdicionarNum() throws InterruptedException {
        synchronized(listaInteiros) {
            if (listaInteiros.size() < 10) {
                Random numero = new Random();
                int num = numero.nextInt();
                listaInteiros.add(num);
                System.out.println(num);
            } else {
                System.out.println("Memoria cheia");
                listaInteiros.notify();

            }
        }
    }

    public void RemoverNum() throws InterruptedException {
        synchronized(listaInteiros) {
            if (listaInteiros.size() != 0) {
                listaInteiros.remove(0);
                listaInteiros.notify();

            } else {
                System.out.println("Memoria vazia");
                listaInteiros.wait();

            }
        }
    }
}
