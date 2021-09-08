package cs.ing.software.lab1;
public class Vehiculo {
    double fuelCantidad;
    double fuelConsumo;
    double tanqCapacidad;
    Vehiculo(double _fuelcantidad, double _fuelconsumo, double _tanqcapacidad){
        this.fuelCantidad = _fuelcantidad;
        this.fuelConsumo = _fuelconsumo;
        this.tanqCapacidad = _tanqcapacidad;
    }
    String  Refuel(double _liters){
        return "";
    }
    String Drive(double _km){
         double fuelRequiere = _km*this.fuelConsumo;
         if(fuelCantidad-fuelRequiere<0){
             return ("Vehiculo necesita reabastecimiento de combustible");
         }
         else{
             this.fuelCantidad -=fuelRequiere;
             return ("Vehiculo viajó " +(_km)+" km y aún tiene " +String.format("%.2f",fuelCantidad,2)+ " de combustible");
         }
     }
}
