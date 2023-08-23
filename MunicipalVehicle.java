/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

import java.util.Objects;

/**
 *
 * @author ianut
 */
public class MunicipalVehicle {
    // member data
    private final String _id = "AA";
    private static int _number = 1000;
    
    // Constructor
    public MunicipalVehicle(){
        _number++;
    }

    @Override
    public String toString(){
        return "Municipal Vehicle: " + _id + _number;
    }
    
    @Override
    public boolean equals(Object a){ // Overriding boolean to check deep equality between different accounts
        // self check
        if (this == a){
            return true;
        }
        // null check
        if (a == null){
            return false;
        }
        // type check and cast
        if (getClass() != a.getClass()){
            return false;
        }
        MunicipalVehicle m1 = (MunicipalVehicle) a;
        // field comparison
        boolean toReturn = true;
        if (Objects.equals(_id, m1._id) && Objects.equals(_number, m1._number)){
            toReturn = false;
            System.out.println("Error: Municipal Vehicles cannot have the same ID Code");
        }
        return toReturn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this._id);
        hash = 67 * hash + this._number;
        return hash;
    }
}
