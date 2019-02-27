package com.sn.test;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/8.
 */
public class ThreadAlternately {

    private static class Counter {
        public int value = 1;
        public boolean odd = true;
    }

    private static Counter counter = new Counter();


    private static class PrintOdd implements Runnable {
        @Override
        public void run() {
            while (counter.value <= 100) {
                synchronized (counter) {
                    if (counter.odd) {
                        System.out.println(counter.value);
                        counter.value++;
                        counter.odd = !counter.odd;
                        counter.notify();
                    } else {
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }


            }
        }
    }


    private static class PrintEven implements Runnable{
        @Override
        public void run() {
            while (counter.value<=100){

                synchronized (counter){

                    if(counter.odd){
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {

                        }
                    }else {
                        System.out.println(counter.value);
                        counter.value++;
                        counter.odd=!counter.odd;
                        counter.notify();

                    }

                }


            }
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintOdd()).start();
        new Thread(new PrintEven()).start();
    }

}
