package com.example.simple_app;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest   {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    
    public AppTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new org.junit.TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        Assert.true( new App().APP_NAME.equals(new App().getAppName()) );
    }
}
