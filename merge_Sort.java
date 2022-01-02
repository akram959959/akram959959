package Sorting;

import java.util.Scanner;

public class merge_Sort {
    int array[];
    int temparr[];
    int length;


    public void sort(int a[])
    {
        this.array=a;
        this.length=a.length;
        this.temparr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int li,int hi)
    {
        if(li<hi){
            int middle=li+(hi-li)/2;
            divideArray(li,middle);
            divideArray(middle+1,hi);
            mergeArray(li,middle,hi);
        }
    }
    public void mergeArray(int li,int middle,int hi){
        for(int i=li;i<=hi;i++){
            temparr[i]=array[i];
        }
        int i=li;
        int j=middle+1;
        int k=li;


        while(i<=middle&& j<=hi){
            if(temparr[i]<=temparr[j]){array[k]=temparr[i];i++;}
            else{ array[k]=temparr[j];j++;}
            k++;
        }
        while(i<=middle){
            array[k]=temparr[i];
            k++;
            i++;
        }
    }

    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];

        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        merge_Sort ms=new merge_Sort();
        ms.sort(a);
        for(int i:a)
        {
            System.out.print(i+",");
        }
    }
}
