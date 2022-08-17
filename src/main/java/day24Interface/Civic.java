package day24Interface;

   /*
   To make interfaces parent of a concrete class use "implements" keyword instead of "extends".
   Interfaces are not classes they have diff. structures.
   What are the caharacteristics of an interfaces?
   can be put variables==>"public", "static" and "final" is a must
   can be put methods ==> public only accepted ==>Interfaces will be used for entire project.
    */
public class Civic implements HondaAC, HondaEngine, HondaSecurity{
       @Override
       public void cool() {


       }

       @Override
       public void run() { //we don't know which interface's run() it is but subclass can use any of the same given methods.
           System.out.println("Pilot runs well");
       }


   }
