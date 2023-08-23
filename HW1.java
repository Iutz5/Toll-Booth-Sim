/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import TollBooth.*;
import Vehicle.*;

/**
 *
 * @author ianut
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TollBooth booth = new TollBooth("King of Prussia");
        Truck ford = new Truck("Ford","F-150",5, 12000); // 5 axles and 12000 kilograms
        System.out.println(ford);
        Truck nissan = new Truck("Chevy","Malibu", 2, 5000); // 2 axles and 5000kg
        System.out.println(nissan);
        Car honda = new Car("Honda", "Civic", false);  //a civic without an ezpass
        System.out.println(honda);
        Car dodge = new Car("Dodge", "Dart", true);
        System.out.println(dodge);
        MunicipalVehicle m1 = new MunicipalVehicle();
        System.out.println(m1);
        MunicipalVehicle m2 = new MunicipalVehicle();
        System.out.println(m2);
       
        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.displayData();
        booth.calculateToll(nissan);
        booth.calculateToll(honda);
        booth.calculateToll(m1);
        booth.collect(); //close out this booth. Prints its collection info and resets to zero
        booth.displayData(); // everything should be at zeroes
        honda.updateEZPASS(true); // update the honda to having an EZPASS
        ford.updateWeight(4000);  //update the trucks cargo weight             
        booth.calculateToll(ford); //send the ford through the booth again
        booth.calculateToll(dodge);
        booth.calculateToll(honda);
        booth.displayData();  //make sure it reset after the collect above
        booth.collect();
        booth.displayData(); // everything should be at zeroes
        
        
    }
    
}
