package cs.ing.software.lab1;

public class Automovil extends Vehiculo {

    Automovil(double _fuelcantidad, double _fuelconsumo, double _tanqcapacidad) {
        super(_fuelcantidad, _fuelconsumo, _tanqcapacidad);
    }

  @Override
    String  Refuel(double _liters) {
        double freeSpace = this.tanqCapacidad - this.fuelCantidad;

        if (_liters > freeSpace)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";

        }
        else{
            fuelCantidad += _liters;
           return "La cantidad de combustible del vehiculo es: "+fuelCantidad;
        }
    }
}
