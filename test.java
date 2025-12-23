import java.util.*;
class test{
    public int[] unionArr(int[] a, int [] b){
        int n1=a.length;
        int n2=b.length;

        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(arr.size()==0 || arr.get(arr.size()-1) !=a[i]){
                        arr.add(a[i]);
                }Ha
                i++;
            }
            else{
                 if(arr.size()==0 || arr.get(arr.size()-1) !=b[j]){
                        arr.add(b[j]);
                }
                j++;

            }
        }
        while(i<n1){
             if(arr.size()==0 || arr.get(arr.size()-1) !=a[i]){
                        arr.add(a[i]);

                }
                i++;
        }
        while(j<n2){
            if(arr.size()==0 || arr.get(arr.size()-1) !=b[j]){
                        arr.add(b[j]);
                }
                j++;
        }

        int[] change=new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            change[k]=arr.get(k);
        }
    return change;
    }
    public static void main(String[] args) {
        test obj =new test();
        
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        int[] result=obj.unionArr(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}