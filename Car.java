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
public class Car extends Vehicle{
    
    // member data
    private boolean _ezpass;
    
    // Constructor
    public Car(String make, String model, boolean ezpass) {
        super(make, model);
        _ezpass = ezpass;
    }
    
    // accessors
    public String getMake(){
        return _make;
    }
    
    public String getModel(){
        return _model;
    }
    
    public boolean getEZPASS(){
        return _ezpass;
    }
    // mutators
    public boolean updateEZPASS(boolean ezpass){
        _ezpass = ezpass;
        return _ezpass;
    }
    
    @Override
    public String toString(){
        return "Car" + "\n" + "Make: " + _make + "\n" + "Model: " + _model + "\n" + "EZPASS: " + _ezpass;
    }
}
