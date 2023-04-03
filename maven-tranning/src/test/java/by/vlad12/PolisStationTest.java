package by.vlad12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolisStationTest {
    @Test
    public void test(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = 0;
        int actual = polisStation.summarizeTwoCrines(0,5);

        assertEquals(expected, actual);
    }
    @Test
    public void test1(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = 0;
        int actual = polisStation.summarizeTwoCrines(0,-1);

        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = 4;
        int actual = polisStation.summarizeTwoCrines(1,8);

        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = -1;
        int actual = polisStation.summarizeTwoCrines(1,-2);

        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = 18;
        int actual = polisStation.summarizeTwoCrines(2,20);

        assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = -1;
        int actual = polisStation.summarizeTwoCrines(2,-7);

        assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = -1;
        int actual = polisStation.summarizeTwoCrines(3,20);

        assertEquals(expected, actual);
    }
    @Test
    public void test7(){
        PolisStation polisStation = new PolisStation();

        //2,2 - входные значения
        //3 - ожидаемый результат
        int expected = -1;
        int actual = polisStation.summarizeTwoCrines(3,-3);

        assertEquals(expected, actual);
    }

}