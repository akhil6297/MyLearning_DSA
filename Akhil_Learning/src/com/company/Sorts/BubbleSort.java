package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        // write your code here

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    }
    public static void sort ( int[] intArray){
        System.out.println("Starting Bubble Sort");
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
        public static void swap ( int[] ar, int i, int j){
            if (ar[i] == ar[i + 1]) {
                return;
            }
            int temp = ar[i + 1];
            ar[i + 1] = ar[i];
            ar[i] = temp;
        }
    }

