import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SumaTest {
    Suma suma;

    @BeforeSuite
    public void setUp() {
        suma = new Suma();
        System.out.println("Instanciar clase suma");
    }

    @Test(testName = "suma de valores positivos", priority = 0)
    public void sumarPositivos() {
        //Assert.fail();
        Assert.assertEquals(suma.sumar("5","10"),15);
    }

    @Test(testName = "suma de un valor negativo", priority = 0)
    public void sumarNegativos() {
        Assert.assertEquals(suma.sumar("-5","10"),5);
    }

    @Test
    public void sumarNulos() {
        try{
            suma.sumar("","10");
            Assert.fail("El método no devolvió una excepción");
        }
        catch(Exception e){

        }
    }

    @Test
    public void sumarLetras() {
        try{
            suma.sumar("as","sd");
            Assert.fail("El método no devolvió una excepción");
        }
        catch(Exception e){

        }
    }

    @Test
    public void sumarFlotantes() {
        try{
            suma.sumar("1.2","3.2");
            Assert.fail("El método no devolvió una excepción");
        }
        catch(Exception e){

        }
    }


}
