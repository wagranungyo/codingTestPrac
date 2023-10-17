package Solution;

public class solution2_1 {
    public boolean solution(String s) {
        boolean answer = true;

        int count = 0;

        if(")".equals(String.valueOf(s.charAt(0)))) return false;

        for(int i=0; i<s.length(); i++){
            if("(".equals(String.valueOf(s.charAt(i)))){
                count += 1;
            }
            else {
                count -= 1;
            }
        }

        if(count==0){
            return answer;
        }else{
            return false;
        }
    }
}
