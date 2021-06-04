package com.company;

public class Factorial {
    public static void main (String[] args){
        rec_factorial(3);
    }
    public static int itr_factorial(int n){
        if(n==0){
            return 1;
        }
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        //System.out.println(f);
        return f;
    }
    public static int rec_factorial(int n){
        if(n==0){
            return 1;
        }
        //System.out.println(n*rec_factorial(n-1));
        return n*rec_factorial(n-1);

    }
}
