package nl.acxdev.dev01.b;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        testHello();
        testSecondHello();
        assertTrue( true );
    }
    
    public void testHello()
    {
        assertEquals("Hello world!", App.getHello());
    }
    
    public void testSecondHello()
    {
        assertEquals("Hello world too!", App.getSecondHello());
    }
}
