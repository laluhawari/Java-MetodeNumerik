package com.belajar;

import java.util.Scanner;

public class MetodeNewtonRaphson {
    private static final int MASK= 100;
    private static float  x0,e;
    private static double [] x =  new double[MASK];
    private static int i=0;

    public static void main(String[] args) {
    input();
    metNewtonRapshon();
    }
    public static void input(){
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Metode Metode Newton Raphson");
        System.out.print(" Masukan pendekatan awal[x0]= ");
        x0 = userInput.nextFloat();
        System.out.print(" Masukan Nilai Toleransi Eror (e) =");
        e = userInput.nextFloat();
    }
    private static double f(double x){
        return Math.exp(-x)-x;
    }
    private static double turunanf(double x){//nsyamsu23
        return -Math.exp(-x)-1;
    }

    public  static void metNewtonRapshon(){
        i=0;
        x[0]=x0;
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("|\ti\t|\tx\t\t\t|\tf(x)\t\t|\tf'(x)\t\t|\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("|\t%d\t|\t%f\t|\t%f\t|\t%f\t|\n", i+1, x[0],f(x[0]),turunanf(x[0]));
        while(Math.abs(f(x[i]))>=e)
        {
            i++;
            x[i]=x[i-1]-f(x[i-1])/turunanf(x[i-1]);
            System.out.printf("|\t%d\t|\t%f\t|\t%f\t|\t%f\t|\n", i+1, x[i],f(x[i]),turunanf(x[i]));

        }
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("\n\nAkar terletak di x = %f\n", x[i]);
    }
}
