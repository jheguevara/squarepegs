package com.mcnz;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.awt.*;
import com.mcnz.*;

/**
 * Unit test for simple App.
 */
public class AppTest   {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        Assert.assertTrue( new com.mcnz.App().APP_NAME.equals(new com.mcnz.App().getAppName()) );
    }
}
