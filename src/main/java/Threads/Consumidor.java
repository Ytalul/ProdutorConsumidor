package Threads;

import Principal.Buffer;

public class Consumidor extends Thread{
    public Buffer buffer;
    public Consumidor(Buffer b){
        this.buffer = b;

    }

    public void run(){
        while (true) {
            try {
                Thread.sleep(500);
                buffer.RemoverNum();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
