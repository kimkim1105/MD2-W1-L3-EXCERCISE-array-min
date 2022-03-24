package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< arr.length;i++){
            System.out.println("Nhập vào phần tử "+(i+1)+" của mảng");
            arr[i]= scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là:");
        for (int item:
             arr) {
            System.out.print(item+"\t");
        }
  int min = arr[0];
        for (int i=1;i< arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("\n Phần tử nhỏ nhất của mảng là: "+min);
    }
}
