
import org.testng.annotations.*; // using TestNG annotations

public class PrimerTest {
    @Test
    public void testCase1() {
        System.out.println("Este es el test case 1");
    }
    @Test
    public void testCase2() {
        System.out.println("Este es el test case 2");
    }
    @BeforeSuite
    public void beforeMethod() {
        System.out.println("Esto se ejecuta antes de los test");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("Esto se ejecuta luego de los test");
    }
}
