package com.kea.Test;

public class MyExceptionTest {

    public static void fejlRutine() throws MyException{
        System.out.println("I fejlRutine - kaster fejl!");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Kalder fejlRutine()");
            fejlRutine();
        }
        catch (MyException e){
            //System.out.println(e);
            //System.out.println(e.getMessage());
            e.printStackTrace(); //mere interessant, hvis der er kald inden i hinanden
        }
        finally{
            System.out.println("Nu skal der laves øvelser!");
        }

    }
}
