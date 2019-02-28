package com.kea.Test;

public class Exercise2 {
    private int x = 101;

    private void fun(int x) {
        x++;
        gun();
    }

    private void gun() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise2 e1 = new Exercise2();
        int x = 200;
        e1.fun(x);
    }
}
