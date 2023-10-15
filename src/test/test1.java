package test;

import Solution.solution1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test1 {

    @Test
    public void solution1(){
        solution1 s = new solution1();
        assertEquals(true, s.solution(10)); // true
    }

    @Test
    public void solution2(){
        solution1 s = new solution1();
        assertEquals(false, s.solution(11)); // false
    }

    @Test
    public void solution3(){
        solution1 s = new solution1();
        assertEquals(true, s.solution(12)); // true
    }
    @Test
    public void solution4(){
        solution1 s = new solution1();
        assertEquals(false, s.solution(13)); // false
    }

}
