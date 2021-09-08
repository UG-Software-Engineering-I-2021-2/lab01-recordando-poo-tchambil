package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import static cs.ing.software.lab1.EjemploVehiculo.fuelConsumoVehiculo;
import static cs.ing.software.lab1.EjemploVehiculo.tanqueCapacidad;

public class EjemploVehiculoTest {
   @Test()
    public void test01() {

        Automovil toyota = new Automovil(10,fuelConsumoVehiculo,tanqueCapacidad);
        Assert.assertEquals("Vehiculo necesita reabastecimiento de combustible", toyota.Drive(12));
    }
    @Test
    public void test02(){
        Automovil toyota = new Automovil(10,fuelConsumoVehiculo,tanqueCapacidad);
        Assert.assertEquals("Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible", toyota.Drive(4));
    }
}
