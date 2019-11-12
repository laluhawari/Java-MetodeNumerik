package com.belajar;
import java.lang.Math;
import java.util.Scanner;
/*
Nama : Nur Syamsu Wais Al Qorni
Nim : 18615042
Kelas : TI 3B

 */
public class RegulaFalsi {
    public static Scanner inputUser = new Scanner(System.in);
    private static double a,b,e ,xr;
    private static int inter =0;
    public static void main(String[] args) {
            input();
            regulafalsi();

    }

    public static void input(){
        System.out.print("masukan batas bawah (a): ");
        a = inputUser.nextFloat();
        System.out.print("masukan batas atas (b):");
        b = inputUser.nextFloat();
        System.out.print("masukan error (e):");
        e = inputUser.nextDouble();
    }//nsyamsu23
    public static double f(double x){
        return Math.pow(x,3)-3*Math.pow(x,2)+x-3;
    }
    public static void regulafalsi(){
        System.out.print("+-------------------------------------------------------------------------------------------------------+");
        System.out.printf("\n|\ti\t|\t\ta\t\t|\t\tb\t\t|\t\txr\t\t|\t\tf(xr)\t|\t\tf(a)\t|\t\tf(b)\t|\n");
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        if(f(a)*f(b)>0){
            while (true){
                inter++;
                //xr=f(b)*a-f(a)*b/(f(b)-f(a)); // Formula 1
                xr = b-f(b)*(b-a)/(f(b)-f(a)); // Formula 2/
                    System.out.printf("|\t%d\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\t%f\t|\n", inter, a, b, xr, f(xr), f(a), f(b));
                    if (Math.abs(f(xr)) < e) {
                        break;
                    } else if (f(a) * f(xr) < 0) {
                        b = xr;

                    } else {
                        a = xr;
                    }


            }
            System.out.println("+-------------------------------------------------------------------------------------------------------+");
            System.out.printf("\nNilai xr [Akar]\t= %f\n", xr);
            System.out.printf("f(xr) [Error]\t= %f\n", f(xr));
        }else{
            System.out.println("tidak ada akar");

        }
        System.out.println("\n");
    }
}
