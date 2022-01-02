package Sorting;

import java.util.Scanner;

public class bubble_Sorting {
    static void print(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    static void bubbleSort(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubble_Sorting b=new bubble_Sorting();
        b.bubbleSort(a);
        b.print(a);

    }


}