
public class MergeSort {

    public static void main(String[] args) {
        int number1[] = {1, 2, 3, 0, 0, 0};
        int number2[] = {2, 5, 6};
        int m = 3;
        int n = 3;

        MergeArray(number1, number2, m, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(number1[i]+ " ");
        }

    }

    public static void MergeArray(int[] number1, int[] number2, int m, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j>= 0) {
            if (i>0&&number1[i] > number2[j]) {
                number1[k] = number1[i];
                k--;
                i--;
            } else {
                number1[k] = number2[j];
                k--;
                j--;
            }
        }
    }

}
