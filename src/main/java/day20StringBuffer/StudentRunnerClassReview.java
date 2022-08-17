package day20StringBuffer;

public class StudentRunnerClassReview {


    public static void main(String[] args) {

        EncapsulationStudentReview std1= new EncapsulationStudentReview();

        System.out.println(std1.getAge()+5);  //19 as the stu age is 14 we can add 5 for it.... app gets the value and print the value.

        // int newAge= std1.getAge(); // actually this what java does in the background....

        System.out.println(std1.getName().charAt(0)); //==>gives the initial letter of name

        //setting the name

        std1.setName("Andy Smart"); //we first set the name then print the new calue of the name
        std1.setAge(24);
        std1.setSuccessful(false);

        System.out.println(std1.getName().charAt(0)); //A

        System.out.println(std1);

        std1.setName("Mary Star");
        std1.setAge(22);
        std1.setSuccessful(true);
        System.out.println(std1.getName().charAt(0)); //M
        System.out.println(std1);

        //there are 3 stu.s but there is only one object. We used same single object for three diff. objects.
       //java will use less memory while using encapsulation.The class will not be updated the data inside the class / object will be updated.

        EncapsulationStudentReview std2 = new EncapsulationStudentReview(); //new object doesnot update the class so you will see the same varibles in the object even if you creata a new object..
        System.out.println(std2);//will give tha same data as above ==> EncapsulationStudentReview{name='Sara Basaran', age=14, isSuccessful=true}
                                  //bec. as name variable whatever java has in the system it will match the variables and print it...

        System.out.println(std1.getName());





    }









}
