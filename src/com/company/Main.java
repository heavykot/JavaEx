package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }
        catch (Exception e)
            {
                System.out.println(e.toString());
            }
        }
}
