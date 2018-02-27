import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 15, 7, 11, 8, 1, 9, 23, 17};
        int[] arr1 = {1186, 203, 1986, 687, 1720, 1545, 516, 778, 1872, 1053, 398, 1823, 1602, 1257, 1460, 1716, 100, 563, 1287, 109, 747, 996, 238, 1152, 1740, 909, 370, 425, 1938, 564, 1232, 1141, 1544, 1812, 258, 117, 246, 656, 1922, 862, 1703, 1832, 175, 1332, 1445, 975, 626, 553, 1688, 46};

        insertion(arr);
        System.out.println(Arrays.toString(arr));
        insertionDesc(arr);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void insertion(int[] array) {
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

    public static void insertionDesc(int[] array) {
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

    public static void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }


    public static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[q + 1 + j];
        }
        L[n1] = 2147483647;
        R[n2] = 2147483647;
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i = i + 1;
            } else {
                array[k] = R[j];
                j = j + 1;
            }
        }

    }
}
