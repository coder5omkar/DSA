class Solution {
    public int maxProduct(int n) {

        int tmp=n;
        int k = 0;
        while(tmp>0){
            int dig = n%10 ;
            k++;
            tmp = tmp/10;

        }

        int ans = 1;

        Integer ar[] = new Integer[k];

        int i= 0;
        while( n > 0 ){
            int dig = n%10 ;
            ar[i] = dig;
            i++;
            n= n/10;
        }

        Arrays.sort(ar, Collections.reverseOrder());

        return ar[0] * ar[1];
        
    }
}