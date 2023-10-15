package Solution;

public class solution1 {
        public boolean solution(int x) {

            boolean answer = true;

            int sum = 0;
            int number = x;
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }

            if (number % sum == 0){ return answer;}
            else{ return false;}
        }
}
