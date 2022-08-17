package practise03;

public class Q6 {
    /*  Create a method and
        from a given array find all pairs whose sum is a given number,
        {4,6,5,-10,8,5,20} ===> 10
        4 + 6 = 10
        5 + 5 = 10
       -10 + 20 = 10
        */
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, -10, 9, 5, -2, 17};
        findPairs(arr, 15);
    }

    public static void findPairs(int[] arr, int number) { //if we put String instead of static we can not reach out to that element.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }

















}
