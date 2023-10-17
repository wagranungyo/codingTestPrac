package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution2_2 {
    public String solution(String[] participant, String[] completion) {

        List<String> result = new ArrayList<>(Arrays.asList(participant));

        for(String completions : completion){
            if(Arrays.asList(participant).contains(completions)){
                result.remove(completions);
            }
        }

        return result.get(0);
    }
}
