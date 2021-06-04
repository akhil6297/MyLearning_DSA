package com.company;

public class QuickSort {
    public static void main (String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        sort(intArray,0,intArray.length);
        for (int z = 0; z < intArray.length; z++) {
            System.out.println(intArray[z]);
        }
    }
    public static void sort(int[] arr, int start, int end){
        if (end - start < 2) {
            return;
        }
        int pivot_index=pivot_placing(arr,start,end);
        sort(arr,start,pivot_index);
        sort(arr,pivot_index+1,end);


    }
    public static int pivot_placing(int[] arr, int start, int end){
        int pivot=arr[start];
        int i =start;
        int j=end;
        while(i<j){
            while(i<j&& arr[--j]>=pivot);
            if(i<j){
                arr[i]=arr[j];
            }
            while(i<j&& arr[++i]<=pivot);
            if(i<j){
                arr[j]=arr[i];
            }
        }
        arr[j]=pivot;
        return j;
    }

}
