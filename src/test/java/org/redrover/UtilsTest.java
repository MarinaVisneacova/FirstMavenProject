package org.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testSum(){
        Assert.assertEquals(Util.sum(2,4), 6);

    }

    @Test
    public void testAbrr(){
        Assert.assertEquals(Util.abbr("1234567890", 11), "1234567890");

    }

}
