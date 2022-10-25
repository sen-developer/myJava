package com.lesson.sen;
// Array
//int a[]=new int[5];
public class MainArray {
    public static void main(String[] args){

//        int arr[] = {7,8,9,100,5,7,8};
//        for(int i: arr){
//            System.out.print(i + " ");
//        }
        String Dasaran[] = {"Aram","Davit","Shushan","Gexam","Davit","Davit"};
//        for(String s:Dasaran ){
//            if(s == "Davit") System.out.print("Ayo");
//        }
        String name = "Davit";
        int i = 0;
        for(String s:Dasaran ){
            if(s == name) i++;
        }
        System.out.print("Dasaranum ka " + i + " " + name);
    }
}
