package com.example.demo8;

public class Bai1 {
    public int tongHam(int[] arr){
        if(arr == null){
            throw new IllegalArgumentException("Ko duoc de trong");
        }
        int sum = 0;
        for(int i : arr) {
            if (i>=1&&i<=1000){
                sum+=i;
            }else{
            throw new IllegalArgumentException("Ko duoc vuot nngoai vung hop le");
        }
        }
        return sum;
    }
}
