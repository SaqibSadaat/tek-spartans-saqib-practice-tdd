package playground;

//The order of the Annotation is not required, if you put BeforeMethod or AfterMethod on the top, it doesn't matter. (See the notes)
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
    @BeforeMethod
    public void runBeforeTest(){
        System.out.println("This is before Each Test");

    }
    @AfterMethod
    public void runAfterEachTestMethod(){
        System.out.println("This is running after Each Test");
    }
    @Test
    public void myFirstTestMethod() {
        System.out.println("Hello World");

    }
    @Test
    public void mySecondTestMethod() {
        System.out.println("This is My second tests");
    }

}