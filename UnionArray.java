import java.util.*;

class Solution {

    public int[] unionArray(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;
        ArrayList<Integer> unionArr = new ArrayList<>();

        // Traverse both arrays
        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        // Remaining elements of array b
        while (j < n2) {
            if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        // Remaining elements of array a
        while (i < n1) {
            if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        // Convert ArrayList to int[]
        int[] result = new int[unionArr.size()];
        for (int k = 0; k < unionArr.size(); k++) {
            result[k] = unionArr.get(k);
        }

        return result;
    }

    // Main method to test the program
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        int[] result = obj.unionArray(nums1, nums2);

        System.out.print("Union Array: ");
       for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);
       }
    }
}
