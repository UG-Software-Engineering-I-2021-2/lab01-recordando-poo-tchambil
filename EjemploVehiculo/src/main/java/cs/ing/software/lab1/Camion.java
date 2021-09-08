package cs.ing.software.lab1;

public class Camion extends Vehiculo {
    Camion(double _fuelcantidad, double _fuelconsumo, double _tanqcapacidad) {
        super(_fuelcantidad, _fuelconsumo, _tanqcapacidad);
    }
    String Refuel(double _liters){
        double freeSpace = this.tanqCapacidad - this.fuelCantidad;
        if (_liters > freeSpace)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.fuelCantidad += (_liters * 0.95);
            return "La cantidad de combustible del camion es: "+fuelCantidad;
        }
    }
    @Override
    String Drive(double _km) {
        double fuelRequiere = _km*this.fuelConsumo;
        if(fuelCantidad-fuelRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.fuelCantidad -=fuelRequiere;
            return ("Camion viajó " +(_km)+" km y aún tiene " +String.format("%.2f",fuelCantidad,2)+ " de combustible");
        }
    }
}
