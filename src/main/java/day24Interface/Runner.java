package day24Interface;

import static day24Interface.HondaAC.make;

public class Runner {

    public static void main(String[] args) {

        System.out.println(HondaAC.price); //890.00
        System.out.println(HondaEngine.price); //2890.00
        System.out.println(HondaSecurity.price); //90.00

        System.out.println(HondaAC.make); //Samsung
        System.out.println(HondaEngine.isOld);
        System.out.println(HondaSecurity.i);

        //When you create a method with body by using "static" keyword, you can access to it by using just the interface name.
        HondaAC.climateCool();

        //But when you create method with body with "default" keyword, you can by creating obj. from that interface .
        Civic civic =new Civic();
          civic.bacteriaKiller();

    }
}
