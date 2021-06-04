package com.company;

public class SelectionSort {
    public static void main (String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        sort(intArray);
    }
    public static void sort(int[] arr){
        System.out.println("Starting Selection Sort");

        for(int i=arr.length-1;i>0;i--){
            int largest= arr[0];
            int index=0;
            for ( int j=1; j<=i;j++){
                if(arr[j]>largest){
                    largest=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=largest;
            arr[index]=temp;

        }
        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z]);
        }


    }
}
