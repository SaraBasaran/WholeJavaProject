package day20StringBuffer;

public class VehicleRunnerReivew01 {

    public static void main(String[] args) {


        ConstructorsVehicles01 v1= new ConstructorsVehicles01("Honda", "Civic", 2021, 13000);
        ConstructorsVehicles01 v2= new ConstructorsVehicles01("Audi", "RS", 2022, 50000.0);

        //ConstructorsVehicles01 is a template and you can create many objects from one class. You have 100 usd template you can have many 100 usdS...
        //In java by creating constructors you can have many different obj.s from a class.Otherwise we would create for each obj classes one by one.

        ConstructorsVehicles01 v3= new ConstructorsVehicles01("Mercedes", "C300", 150000.0);//when we make the value double Java selects the exact match for the given value
        ConstructorsVehicles01 v4= new ConstructorsVehicles01("BMW", "M5", 2021);

        ConstructorsVehicles01 v5= new ConstructorsVehicles01(); //that one will have everything "null" bec. it does not have any values...

        System.out.println(v1.model);  //Civic

        //By the help of "Contructors" we can create many objects in one class cons. are like templates and we can use many objects for that templates.
    }




}
