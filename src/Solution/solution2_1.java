package Solution;

public class solution2_1 {
    public boolean solution(String s) {
        boolean answer = true;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if("(".equals(String.valueOf(s.charAt(i)))){
                count += 1;
            }
            else{
                count -= 1;
            }

            if(count<0){
                break;
            }
        }

        if(count <0) return false;

        if(count == 0) return true;

        return false;
    }
}
