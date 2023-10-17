package test;

import Solution.solution2_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test2_1 {

    @Test
    public void solution(){
        solution2_1 s = new solution2_1();
        assertEquals(true, s.solution("()()")); // true

    }

    @Test
    public void solution2(){
        solution2_1 s = new solution2_1();
        assertEquals(true, s.solution("(())()")); // true
    }

    @Test
    public void solution3(){
        solution2_1 s = new solution2_1();
        assertEquals(false, s.solution(")()(")); // false
    }

    @Test
    public void solution4(){
        solution2_1 s = new solution2_1();
        assertEquals(false, s.solution("(()(")); // false
    }

    @Test
    public void solution5(){
        solution2_1 s = new solution2_1();
        assertEquals(false, s.solution("())")); // false
    }

    @Test
    public void solution6(){
        solution2_1 s = new solution2_1();
        assertEquals(false, s.solution("((())")); // false
    }

}
