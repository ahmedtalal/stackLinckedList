package com.company;

public class Main {

    public static void main(String[] args) {
        Stack s = new Stack() ;
        for (int i = 1 ; i <= 5 ; i++){
            s.push(i);
        }

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(s.pop());
        }
    }
}
