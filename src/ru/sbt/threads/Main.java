package ru.sbt.threads;

/**
 * Created by Vlad on 14.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i);

                }
            }
        });
        thread.start();
    }
}
