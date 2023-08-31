package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        int[]num = {5,2,1,3,4};
        for(int i=0;i< num.length;i++){
            for (int j=0; j< num.length-i-1;j++){
                if (num[j]>num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }

            }
        }
        SortedArray(num);
    }

    private static void SortedArray(int[] num) {
        for(int i=0;i< num.length;i++){
            System.out.println(num[i]);
        }
    }
}