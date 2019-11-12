package com.belajar;

import java.lang.*;
import java.util.Scanner;
// original by Syamsu ganteng
public class Tabel {
    private static final int MASK= 100000;
    private static double a, b,N;
    private static double h;
    private static double [] x =  new double[MASK];
    private static double [] y =  new double[MASK];


    public static void main(String[] args) {
        int jawab ;
        Scanner userInput = new Scanner(System.in);
        do {//nsyamsu23
            input();
            tabel();
            System.out.println(" nilai H = "+H());
            akar();
            System.out.print("Di ulang lagi (1/0) ?");
            jawab = userInput.nextInt();

        }while (jawab== 1);
    }

    public static void input(){
        Scanner userInput = new Scanner(System.in);
        System.out.print(" Masukan nilai bawah [a]= ");
        a = userInput.nextDouble();
        System.out.print(" Masukan Nilai atas [b]= ");
        b = userInput.nextDouble();
        System.out.print(" Masukan Nilai interasi [N]=");
        N = userInput.nextDouble();
    }
    public static double H(){

        return (b-a)/N;
    }
    public static double f(double x){
        return Math.exp(-x)-x;
    }
    public static void tabel() {
        System.out.printf("NO\tx\texp(e^x)\tf(x)\terror\n");
        for (int i = 0; i <=N; i++) {
            x[i] = (a+i)*H();
            y[i] = f(x[i]);
            System.out.printf("%d\t%.3f\t%f\t%f\t%f\n",i,x[i],Math.exp(-x[i]), y[i],Math.abs(y[i]));
        }
        System.out.println("\n");
    }
    public static void akar(){
        int i;

        for( i=0;i < N; i++){
            if(y[i]*y[i+1]<0){
                System.out.printf("Akar diantara %f dan %f\n", y[i], y[i+1]);
                break;
            }
        }
        if(Math.abs(y[i])< Math.abs(y[i+1])){
            System.out.printf("Akar yang lebih dekat = %f\n", x[i]);
            System.out.printf("Error = %f\n", Math.abs(y[i]));
        } else {
            System.out.printf("Akar yang lebih dekat = %f\n", x[i+1]);
            System.out.printf("Error = %f\n", Math.abs(y[i+1]));
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }









}
