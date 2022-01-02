package Sorting;

import java.util.Scanner;

public class insertion_Sorting {
    static void print(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }

    }
    static void insert(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
           int temp=a[i];
           int j=i-1;
           while(j>=0&&temp<=a[j]){
               a[j+1]=a[j];
               j=j-1;
           }
           a[j+1]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();

        }
        insertion_Sorting i=new insertion_Sorting();
        i.insert(a);
        i.print(a);

    }
}
