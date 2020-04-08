package Sample;

import MainTest.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestSample {
    Main main = new Main();
    @Test
    public void sumTest(){
        int actual = main.sum(4,9);
        Assert.assertEquals(13,actual);
    }
}
