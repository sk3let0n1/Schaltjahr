package com.company;

import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);										//scanner implementation

	System.out.print("Bitte Jahr eingeben: ");									//first output
	int eingabe = input.nextInt();												//scanner

	if(eingabe % 4 == 0 && (eingabe % 100 != 0 || eingabe % 400 == 0)) {		//needs and, or
		System.out.print(eingabe + " ist ein Schaltjahr!");						//output if true

	} else {
		System.out.print(eingabe + " ist kein Schaltjahr!");					//output if false
	}
    }
}
