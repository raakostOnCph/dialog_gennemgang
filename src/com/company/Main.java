package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Idalog dalog = new English();

        Scanner scanner = new Scanner(System.in);

        String svar="";

        while (true) {


            System.out.println(dalog.switchLanguage());

            svar = scanner.nextLine();

            if(svar.equalsIgnoreCase("j") || svar.equalsIgnoreCase("y")) {

                dalog = skiftSprog(dalog);
            }

            System.out.println(dalog.AskUserForName());
            svar = scanner.nextLine();

            System.out.println(dalog.quit());
            svar = scanner.nextLine();

            if(svar.equalsIgnoreCase("j") || svar.equalsIgnoreCase("y")) {

                break;
            }





            






        }

        System.out.println(dalog.byebye());


    }

    private static Idalog skiftSprog(Idalog dalog) {
        if(dalog instanceof Dansk) {

            dalog = new English();
        }
        else {

            dalog = new Dansk();

        }
        return dalog;
    }
}
