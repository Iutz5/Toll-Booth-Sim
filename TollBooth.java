/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TollBooth;
import Vehicle.*;

/**
 *
 * @author ianut
 */
public class TollBooth {
    
    // member data
    private final String _boothName;
    private double _fee;
    private int _mVehicleCounter;
    private int _carCounter;
    private int _truckCounter;
    
    // Constructor
    public TollBooth(String boothName){
        _boothName = boothName;
    }
    
    public void calculateToll(Car c){
        _carCounter++;
        double fee = 5;
        if(c.getEZPASS() == true){
            fee = 4.5;
        }
        _fee = _fee + fee;
        System.out.println("Car arrival - Toll Due: $" + fee);
    }
    
    public void calculateToll(Truck t){
        _truckCounter++;
        double fee = 5*t.getAxels();
        fee = fee + 10*(t.getWeight()/1000.0);
        _fee = _fee + fee;
        System.out.println("Truck arrival - Axels: " + t.getAxels() + " Weight: " + t.getWeight() + " Toll Due: $" + fee);
    }
    
    public void calculateToll(MunicipalVehicle v){
        _mVehicleCounter++;
        System.out.println("Municiapl Vehicle Arrival - Toll Due: $0");
    }
    
    public void displayData(){
        System.out.println("Totals since last collection: $" + _fee + " Cars: " + _carCounter + " Trucks: " + _truckCounter + " Municipal Vehicles :" + _mVehicleCounter);
    }
    
    public void collect(){
        System.out.println("***Collecting Receipts***" + "\n" + "Totals since the last collection - Receipts: $" + _fee + " Cars: " + _carCounter + " Trucks : " + _truckCounter + " Municipal Vehicles : " + _mVehicleCounter);
        _carCounter = 0;
        _truckCounter = 0;
        _mVehicleCounter = 0;
        _fee = 0;
    }
}
