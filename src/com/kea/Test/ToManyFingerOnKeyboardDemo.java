package com.kea.Test;

public class ToManyFingerOnKeyboardDemo {
    public static void errFunc() throws ToManyFingerOnKeyboardException {
        System.out.println("errFunc() throws exception!");
        throw new ToManyFingerOnKeyboardException();
    }

    public static void main(String[] args) {
        try{
            errFunc();
        }
        catch(ToManyFingerOnKeyboardException e){
            System.out.println("ToManyFingerOnKeyboardException caught");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
