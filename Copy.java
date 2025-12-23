public class Copy {
    
    public static void main(String[] args) {
                int arr[]={1,2,3,4,5,6};
                int i=0;
                int j=arr.length-1;
                int copy[]=new int[arr.length];
                for (int k = 0; k < copy.length; k++) {
                    copy[k]=arr[k];
                    System.out.print("Numberis:"+copy[k]);
                }
                while(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    i++;
                    j--;
                }
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.println(arr[j2]);
                }
    }
}