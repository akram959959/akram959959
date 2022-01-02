package Sorting;

import java.util.Scanner;

public class quick_Sort {
    public static void Sort(int[] a,int left,int right){
        int index=partition(a,left,right);
        if(left<index-1)
            Sort(a,left,index-1);
        if(index<right)
            Sort(a,index,right);
    }
    private static int partition(int []a,int left,int right){
        int pivot=a[(left+right)/2];
        while(left<right){
            while(a[left]<pivot) left++;
            while(a[right]>pivot) right--;

            if(left<=right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        return left;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Sort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.println(i+",");

    }
}
