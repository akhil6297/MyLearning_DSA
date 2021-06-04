package com.company;

public class InsertionSort {
    public static void main (String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        sort(intArray);
    }
    public static void sort(int[] arr){
        System.out.println("Starting Insertion Sorting !!");
        for ( int i=1; i<arr.length;i++){
            int newElement = arr[i];
            int j;
            for ( j=i; j>0 && newElement<arr[j-1];j--){
                arr[j]=arr[j-1];
            }
            arr[j]=newElement;
        }



        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z]);
        }
    }
}
