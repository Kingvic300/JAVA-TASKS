public class Reverse {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
      
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("The original array is: ");
        for (int count = 0; count < array.length; count++) {
            System.out.println(array[count] + " ");
        }


        System.out.println("The reversed array is: ");
        for (int count = array.length - 1; count >= 0; count--) {
            System.out.println(array[count] + " "); 
        }

    }
}
