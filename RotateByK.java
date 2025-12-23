import java.util.*;
public class RotateByK {
    static void ReverseArray(int arr[],int i,int j){     
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    static void LeftRoatateByK(int arr[],int d){
        int n=arr.length;
         d=d%n;

         ReverseArray(arr,0,d-1);
         ReverseArray(arr,d,n-1);
         ReverseArray(arr,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter Size of Array:");
        int n=sc.nextInt();


        int[] arr=new int[n];
        System.out.print("Enter Element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter Value of d:");
        int  d=sc.nextInt();

        LeftRoatateByK(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
