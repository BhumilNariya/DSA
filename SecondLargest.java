public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12,34,56,35,78,79};

        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<smallest && arr[i]!=smallest){
                    smallest =arr[i];

            }
        }
        System.out.println(smallest);
        System.out.println(ssmallest);
        
        // int largest=arr[0];
        // int slargest=-1;
        // for (int i = 0; i < arr.length; i++) {
        //         if(arr[i]>largest){
        //                 slargest=largest;
        //                 largest=arr[i];
        //         }
        //         else if(arr[i]<largest && arr[i]>slargest){
        //             slargest=arr[i];
        //         }
        // }
        // System.out.println(largest);
        // System.out.println(slargest);
    }
}
