package Sorting;

import java.util.Scanner;

public class selection_Sorting {
    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }
    static void select_Sorting(int a[]){

        int n=a.length;
        for (int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[small])
                    small=j;
                    int temp=a[small];
                    a[small]=a[i];
                    a[i]=temp;



        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selection_Sorting s=new selection_Sorting();
        s.select_Sorting(a);
        s.print(a);

    }
}
