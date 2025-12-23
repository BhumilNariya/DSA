public class Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        // int temp=arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //         arr[i-1]=arr[i];

        // }
        // arr[arr.length-1]=temp;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        int n=arr.length;
        int d=3;
        int[] temp=new int[d];
        for (int i = 0; i <d; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }
        for (int i =n-d ; i < arr.length; i++) {
            arr[i]=temp[i-(n-d)];
        }
    }
}
