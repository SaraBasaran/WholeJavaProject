package Day18PractiseSessionTernary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

       /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

        */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer");

        List<Integer> list= new ArrayList<>();

        while (true){ //we use while(true) to let the system ask repeteadly...
            System.out.println("\nTo add elements type 'add'\n" +
                    "To update elements type 'set'\n" +
                    "To delete elements type 'remove'\n" +
                    "To quit type 'quit'");
            String option = input.next();
            if (option.equalsIgnoreCase("add")) {
                System.out.println("Enter an integer to add into the list");
                int el = input.nextInt();
                list.add(el);
            } else if (option.equalsIgnoreCase("set")) {
                System.out.println("Enter the element you want to update");
                int updateEl = input.nextInt();
                System.out.println("Enter the new element you want to put");
                int newEl= input.nextInt();
                list.set(list.indexOf(updateEl), newEl);//set is working with index of first el.

            } else if (option.equalsIgnoreCase("remove")) {
                System.out.println("Enter the element you want to remove");

                int removeEl= input.nextInt();
                list.remove((Integer) removeEl);//we should use a non-primitive class bec. list does not remove elements if we do not put the el. itself after
                                                //converting it to wrapper class element( we have to type index in other case)

            }else if(option.equalsIgnoreCase("quit")){
                break;
            }else {
                System.out.println("Enter a valid option");
            }

            System.out.println(list);
        }
        System.out.println("Good Bye!");





















    }
















}
