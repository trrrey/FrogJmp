public class Solution {
    public int solution(int X, int Y, int D){
        int solve =  (Y - X) / D;
        if (((Y - X) % D) == 0 ) {
            return solve;
        }
        else {
            return solve + 1;
        }
    }
}
