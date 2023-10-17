package test;

import Solution.solution2_2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test2_2 {

    @Test
    public void solution1(){
        solution2_2 s = new solution2_2();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        assertEquals("leo", s.solution(participant, completion)); // false
    }

    @Test
    public void solution2(){
        solution2_2 s = new solution2_2();

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        assertEquals("vinko", s.solution(participant, completion)); // false
    }

    @Test
    public void solution3(){
        solution2_2 s = new solution2_2();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        assertEquals("mislav", s.solution(participant, completion)); // false
    }
}
