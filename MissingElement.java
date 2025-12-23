public class MissingElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int sum=0;
        int original=0;
        for (int i = 0; i <arr.length; i++) {
            original +=arr[i];
            int n=arr[i];
            sum=(n*(n+1))/2;

        }

        int xor1=0,xor2=0;
        int n=arr.length-1;
        for (int index = 0; index < n; index++) {
            xor2=xor2 ^arr[index];
            xor1=xor1 ^(index+1);

        }
        xor1=xor1^arr.length;
        
        System.out.println("Missing with Xor is: " +(xor1^xor2));
        
      
        System.out.println(sum);
        System.out.println(original);
        System.out.println("Missing Element is:"+(sum-original));
        
    }
}
