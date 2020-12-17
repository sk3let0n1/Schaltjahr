package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Bitte Jahr eingeben: ");
	int eingabe = input.nextInt();
	if(eingabe % 4 == 0 && (eingabe % 100 != 0 || eingabe % 400 == 0)) {
		System.out.print(eingabe + " ist ein Schaltjahr!");
	} else {
		System.out.print(eingabe + " ist kein Schaltjahr!");
	}
    }
}
