package com.traplord;

import java.util.Scanner;

public class E1BinaryToDecimal {
public static void main(String[] args){


        int n ,c=0,s=0;

    Scanner scanner=new Scanner(System.in);

    do{

        System.out.println("Enter a Binary digit (0 or 1 ) : " );

        n=scanner.nextInt();

        if (n!=0 && n!=1){
            continue;}

        s+=Math.pow(2,c)*n;

    c++;} while (c<8);
    System.out.println("This is equivalente to decimal: " + s);



}










}
