package neo.src.test;

import neo.src.java.MainClass;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class MainClassTest {

    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber(){

        int a = Main.getLocalNumber();
        Assert.assertTrue("Expected number: 14, but found: " + a,a == 14);
    }

    @Test
    public void testGetClassNumber(){

        int b = Main.getClassNumber();
        Assert.assertTrue("The number " + b + " is less than 45",b > 45);
    }

    @Test
    public void testGetClassString() {
        String s = Main.getClassString();
        Assert.assertTrue("This string does not contain substrings: hello or Hello", s.contains("hello") || s.contains("Hello"));
    }
}
