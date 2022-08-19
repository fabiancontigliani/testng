import org.testng.annotations.Test;

public class SegundoTest {

    // Prueba agrupados

    @Test(groups = { "Auto" })
    public void Auto1() {
        System.out.println("Pruebas Auto - Prueba Auto 1");
    }
    @Test (groups = { "Scooter" })
    public void Scooter1() {
        System.out.println("Pruebas Scooter - Prueba scooter 1");
    }
    @Test (groups = { "Scooter" })
    public void Scooter2() {
        System.out.println("Pruebas Scooter - Prueba scooter 2");
    }
    @Test (groups = { "Auto", "Sedan Auto" })
    public void Sedan1() {
        System.out.println("Pruebas Sedan Auto - Prueba sedan 1");
    }


}
