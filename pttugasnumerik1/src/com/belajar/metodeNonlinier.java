package com.belajar;

import java.util.Scanner;

public class metodeNonlinier {
    private static final int MASK = 100;
    private static double e,y;
    private static int iterasi =1;
    private static double [] x =  new double[MASK];
    public static void main(String[] args) {
        input();
        nonlinier();
    }
    public static void input(){
        Scanner userInput = new Scanner(System.in);
        System.out.print(" Masukan  pendekatan awal [x0]= ");
        x[0]= userInput.nextDouble();
        System.out.print(" Masukan Nilai Toleransi Eror (e) =");
        e = userInput.nextDouble();
    }
    public static double f(double x){
//nsyamsu23
        return Math.exp(-x)-x;
    }
    public  static double g(double x){

        return Math.exp(-x);
    }
    public static void nonlinier(){
        int i= 1;
        System.out.print("+-----------------------------------------------------------------------+");
        System.out.printf("\n|\ti\t|\tx[i]\t\t|\tg(x[i-1]\t|\tx[i]\t\t|\tf(x[i])\t\t|\n");
        System.out.println("+-----------------------------------------------------------------------+");
        while(Math.abs(f(x[i]))>=e){
            i++;
            if(f(x[i])>MASK) {
                break;
            }
            else {
                x[i]=g(x[i-1]);
                y=f(x[i]);
            }
            System.out.printf("|\t%d\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\n", iterasi, x[i], g(x[i-1]), x[i], y);
            iterasi++;
        }

        System.out.println("+-----------------------------------------------------------------------+");



    }

}
