import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

public class Average {

    public int average(int k, int[] list){
    
    int average = 0;
    int n = Math.min(k, list.length);
        if( n > 0) {
            for(int i = 0 ; i < n; i++){
                average += list[i];
            }
        average = average/n;
        }
        return average;
    }}

class TestAvg {
    private Average avg = new Average();
    private int[] l1 = {2,4,6,8,10};
    private int[] l2 = {0};
    private int x1 = 2;
    private int x2 = 0;
    private int x3 = l1.length + 2;

    @Test
    void testingAvg() {
        res1 = avg.average(x1, l1);
        assertEquals(3,res1);
        
        res2 = avg.average(x2, l1);
        assertEquals(0,res2);

        res3 = avg.average(x3, l1);
        assertEquals(6,res3);

        res4 = avg.average(x1, l2);
        assertEquals(0,res4);
    }

    public static void main(String[] args) {
        TestAvg tAvg = new TestAvg();
        tAvg.testingAvg();
    }
        
}