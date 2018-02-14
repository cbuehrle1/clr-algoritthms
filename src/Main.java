import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 15, 7, 11, 8, 1, 9, 23, 17};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        insertionDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] array){
        for (int j = 0; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionDesc(int[] array){
        for (int j = 1; j < array.length; j++) {
           int key = array[j];
           int i = j - 1;
           while (i >= 0 && array[i] < key) {
               array[i + 1] = array[i];
               i = i - 1;
           }
           array[i + 1] = key;
        }
    }

}
