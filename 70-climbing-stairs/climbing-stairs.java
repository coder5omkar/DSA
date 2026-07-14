class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int prevStep2 = 1;
        int prevStep1 = 2;

        for(int i =3 ; i<=n ; i++){
            int currStep = prevStep1 + prevStep2;
            prevStep2 = prevStep1;
            prevStep1 = currStep;
        }
        return prevStep1;
    }
}