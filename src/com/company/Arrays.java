package com.company;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int[] myArray1 = new int[3];
        myArray1[0]= 1;
        myArray1[1]= 2;
        myArray1[2]= 3;

        double[] myArray3 = new double[3];
        for (int i =0; i<myArray3.length; i++){
            myArray3[i]=i*10;
        }
        System.out.println(java.util.Arrays.toString(myArray3));
        }
}
