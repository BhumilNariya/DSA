public class RotateArray {
    public static void main(String[] args) {
    //     int[] arr={12,34,56,35,78,79};
    //     int n=arr.length;
    //     int d=3;

    //     int[] temp=new int[d];
    //     for (int i = 0; i < d; i++) {
    //         temp[i]=arr[i];
    //     }


    //     for (int i = d; i < arr.length; i++) {
    //         arr[i-d]=arr[i];
    //     }


    //     for (int i = n-d; i < arr.length; i++) {
    //         arr[i]=temp[i-(n-d)];
            
    //     }

    //print Array
    //    for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    //    }

    
        int arr[]={1,4,5,7,9};
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]);
        }

        }
}
