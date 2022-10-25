package com.lesson.sen;
// Changes
public class Main2 {
    public static void main(String[] args) {
        byte b;
        int u = 150;
        b = (byte) u; //down casting mec tipic qcum enq poqr tipi mej
        float u8 = 55.8f;
        u = (int)u8; // hanum rada anum . ic heto inch ka;
        System.out.println(u);

        int io = 68; //change
        int i = 5;



        int sum = i++ + ++i +  i++ + i++ + --i + i--;
        //        5       7    7     8       8    8
        // i = 7
       // sum = 43

        System.out.println("the sum is = "+sum+", i is = "+i);

    }
}
