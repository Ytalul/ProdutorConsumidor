package Threads;

import Principal.Buffer;

import java.util.ArrayList;

public class Produtor extends Thread{
    private Buffer buffer;
    public Produtor(Buffer b){
        this.buffer = b;
    }

    public void run(){
        while(true){
        try {
            Thread.sleep(1000);
            buffer.AdicionarNum();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }
}
