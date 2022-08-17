package day20StringBuffer;

public class StudentRunner {

    public static void main(String[] args) {

//        Student std1= new Student(); //default constructor
//        System.out.println(std1.getAge());  //we are accessing to age from here but normally app.s do not print any value
//                                            //app. gets the value from other class and add to here.
//        int newAge= std1.getAge()+5;
//
        Student std1= new Student();//Tom Hanks
        System.out.println(std1.getName().charAt(0));//T


        std1.setAge(24);
        std1.setSuccessful(false);
        System.out.println(std1);

        std1.setAge(22);
        std1.setSuccessful(false);
        System.out.println(std1);



    }


}
