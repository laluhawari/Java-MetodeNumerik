package com.belajar;

import java.lang.*;
import java.util.Scanner;

public class MetodeBiseksi{
    private static double a, b,N,xr;
    private static double e;
    private static int kondisi = 1,iterasi = 0;
    public static void main(String[] args) {
        input();
        biseksi();
    }

    public static void input(){
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Metode Biseksi");
        System.out.print(" Masukan nilai bawah [a]= ");
        a = userInput.nextDouble();
        System.out.print(" Masukan Nilai atas [b]= ");
        b = userInput.nextDouble();
        System.out.print(" Masukan Nilai Toleransi Eror (e) =");
        e = userInput.nextDouble();
    }
    public static double f(double x){
        return Math.exp(-x)-x;
    }
    public static void biseksi(){

        System.out.print("+-------------------------------------------------------------------------------------------------------+");
        System.out.printf("\n|\tN\t|\t\ta\t\t|\t\tb\t\t|\t\txr\t\t|\t\tf(xr)\t|\t\tf(a)\t|\t\tf(b)\t|\t\terror\t|\n");
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        if (f(a)*f(b)<0){ //nsyamsu23
            while (kondisi == 1){
                xr=(a+b)/2;
                System.out.printf("|\t%d\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\n", iterasi, a, b, xr, f(xr), f(a), f(b),Math.abs(f(xr)));
                iterasi += 1;
                if(Math.abs(f(xr))<e)
                    break;
                else if(f(a)*f(xr)<0){
                    b=xr;
                }else{
                    a=xr;
                }

            }
        }else{
            System.out.println("Tidak ada akar");
        }
        System.out.println("+-------------------------------------------------------------------------------------------------------+");

        System.out.printf("\n\nNilai xr [Akar]\t= %f\n", xr);
        System.out.printf("f(xr) [Error]\t= %f\n", f(xr));
        System.out.println("\n");

    }
}