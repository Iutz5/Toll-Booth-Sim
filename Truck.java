/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author ianut
 */
public class Truck extends Vehicle{
    // member data
    private final int _axles;
    private int _weight;
    
    // Constructor
    public Truck(String make, String model, int axles, int weight){
        super(make, model);
        _axles = axles;
        _weight = weight;   
    }
    
    // accessors
    public String getMake(){
        return _make;
    }
    
    public String getModel(){
        return _model;
    }
    
    public int getAxels(){
        return _axles;
    }
    
    public int getWeight(){
        return _weight;
    }
    
    // mutators
    public int updateWeight(int weight){
        _weight = weight;
        return _weight;
    }
    
    @Override
    public String toString(){
        return "Truck" + "\n" + "Make: " + _make + "\n" + "Model: " + _model + "\n" + "Axles: " + _axles + "\n" + "Weight: " + _weight + "\n";
    }
}
