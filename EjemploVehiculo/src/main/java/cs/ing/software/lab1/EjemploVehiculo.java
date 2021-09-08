package cs.ing.software.lab1;
import java.util.logging.Logger;

public class EjemploVehiculo {
    static final Logger logger = Logger.getLogger(EjemploVehiculo.class.getName());
    static double fuelConsumoVehiculo = 0.9;
    static double fuelConsumoCamion = 1.6;
    static double tanqueCapacidad = 100;
    public static void main(String[] args){
       // logger.info("CS-UTEC Software Engineering");
        double fuelCantidad =10;
        Automovil toyota = new Automovil(fuelCantidad,fuelConsumoVehiculo,tanqueCapacidad);
       logger.info(toyota.Drive(12));
        Camion volvo = new Camion(fuelCantidad,fuelConsumoCamion,tanqueCapacidad);
        logger.info(volvo.Drive(4));
    }
}
