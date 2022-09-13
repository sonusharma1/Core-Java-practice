/*
Program : Phone charging using : break and continue
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/
public class PhoneCharge {
    
    static void startCharging(int batteryPercentage) {

        while (batteryPercentage < 100) {
            
            batteryPercentage += 15;
            if(batteryPercentage >= 100)
                break;
            
            System.out.println("Charging........"+batteryPercentage+"%");            
        }

        if(batteryPercentage >= 100)
            System.out.println("Phone is charged 100%");
    }

    public static void main(String[] args) {
        startCharging(Integer.parseInt(args[0]));
    }
}
