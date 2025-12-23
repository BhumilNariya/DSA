import java.util.HashMap;

public class Haspmap {
        public int[] twosum(int[] nums,int target){
            HashMap<Integer,Integer> map=new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
                int j=target-nums[i];
                map.put(nums[i], i);
                if(map.containsKey(j)){
                    return new int[]{map.get(j),i};

                }


          }
          return new int[]{-1,-1};

        }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        
    }
}