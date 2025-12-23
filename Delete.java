class Delete{
        public static  boolean isbol(int x){
            if(x<0){
                return false;
            }
            int org=x;
            int rev=0;
            while(x>0){
                int digit=x%10;
                rev=rev*10+digit;
                x=x/10;

            }
            return org==rev;
        }

        public static void main(String[] args) {
             int x=121;

             boolean res=isbol(x);
             System.out.println(res);
        }
}