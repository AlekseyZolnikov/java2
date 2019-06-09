package it.intera.homework5;

import java.util.Arrays;

public class Main{

    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];
    private static float[] arr2 = new float[size];


    public static void main(String[] args) {
        singleThread();
        multiThread();

        System.out.println(Arrays.equals(arr,arr2));
    }

    private static void singleThread() {
        Thread t1 = new Thread(() -> {
            long a = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                arr[i] = 1;
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(System.currentTimeMillis() - a);
        });


        try {
            t1.start();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void multiThread() {
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = 1;
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a1, 0, arr2, 0, h);
        });

        Thread t2 = new Thread(() -> {
            for (int i = h; i < size; i++) {
                a2[i - h] = 1;
                a2[i - h] = (float)(a2[i - h] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a2, 0, arr2, h, h);
        });

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - a);
    }

}
