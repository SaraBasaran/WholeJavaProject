package Practise02;

public class SAmpleQuestConvertingNameToAsterics {

    public static void main(String[] args) {
        /*
        [01:36, 25.06.2022] +1 (437) 993-3371: Scanner input = new Scanner (System.in) ;
System.out.println("Enter your Name,
Surname and Credit card number"):
String str = input.nextLine();
String name = str.split ( regex: " ") [0];
String surname = str.split( regex:
') [1];
String cardnum = str.split ( regex:
") [2];
String hiddenname =name.replaceALL( regex: "[a-z]", replacement: "*") ;
String hiddensrnme = surname.replaceAll( regex:
"[a-z]",
replacement: "*");
String hiddennum=
for (int i =0; i‹cardnum. Length();i++) {
if (i < cardnum. length()
- 4) f
hiddennum = hiddennum
+
"*";
felse {
hiddennum = hiddennum + cardnum.charAt(i);
}
7
System.out.println(hiddenname
SCh
+hiddensrnme +
"+ hiddennum):
[01:36, 25.06.2022] +90 507 729 41 11: public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name, Surname and Credit card number");
        String str = input.nextLine();
        String name = str.split(" ")[0];
        String surname = str.split(" ")[1];
        String cardnum = str.split(" ")[2];
        String hiddenname =name.replaceAll("[a-z]","*");
        String hiddensrnme = surname.replaceAll("[a-z]", "*");

        String hiddennum = "";


        for(int i =0; i<cardnum.length();i++) {
            if (i < cardnum.length() - 4) {
                hiddennum = hiddennum + "*";
            }else {
                hiddennum = hiddennum + cardnum.charAt(i);
            }
        }
        System.out.println(hiddenname + " " +hiddensrnme + " "+ hiddennum );
         */

        /*
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name, Surname and Credit card number");
        String str = input.nextLine();
        String name = str.split(" ")[0];
        String surname = str.split(" ")[1];
        String cardnum = str.split(" ")[2];
        String hiddenname =name.replaceAll("[a-z]","*");
        String hiddensrnme = surname.replaceAll("[a-z]", "*");

        String hiddennum = "";


        for(int i =0; i<cardnum.length();i++) {
            if (i < cardnum.length() - 4) {
                hiddennum = hiddennum + "*";
            }else {
                hiddennum = hiddennum + cardnum.charAt(i);
            }
        }
        System.out.println(hiddenname + " " +hiddensrnme + " "+ hiddennum );
         */
    }
}

