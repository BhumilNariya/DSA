public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,0,4,0,5,1,0};
        int n=arr.length;
        int[] temp=new int[n];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] !=0){
                temp[i]=arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }
        // int nz=temp.length;
        // for (int i = 0; i < nz; i++) {
        //     arr[i]=temp[i];
        // }
        // for (int i = nz; i < arr.length; i++) {
        //     arr[i]=0;
        // }


        // //Print
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
    }
}
