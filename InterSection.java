import java.util.ArrayList;

public class InterSection {
    public static ArrayList<Integer> findIntersection(int a[], int b[]){
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;

        ArrayList arr=new ArrayList<>();

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;

            }
            else{
                arr.add(a[i]);  
            }
            i++;
            j++;
        }
        return arr;
    }
}
