package cliente;

import singleton.Singleton;

public class UsaSingleton extends Thread{

    @Override
    public void run(){
        Singleton s = Singleton.getInstance();
        System.out.println(s);

    }

    public static void main(String[] args) throws Exception {
        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();

        t1.start();
        t2.start();
    }
}