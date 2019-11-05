package com.company;

public class Main {

    public static void main(String[] args) {
	String [] names={ "Asan", "Usen","Ulan"};
        System.out.println(names [2]);
        for (int i = 0; i < 3; i++) {

        switch (i) {
            case 0:
                System.out.println(names[i] +" "+"доброе утро");
                break;
            case 1:
                System.out.println(names[i]+" "+"Добрый день");
                break;
            case 2:
                System.out.println(names[i]+" "+"Добрый вечер");
        }


        }
    }

    }

