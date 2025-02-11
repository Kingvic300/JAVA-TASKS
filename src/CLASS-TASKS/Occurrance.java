public class Occurrance {
    public static void main(String[] args) {
        int[] array = {2,3,4,4,2,1,2,3};
        int j = 0;
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            t = array[i];
            if(array[i] == t){
                j++;
            }
            System.out.println(array[i]+"occurs"+j + " ");
        }
    }
}
