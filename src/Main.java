import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        String[] verdict = new String[]{"Executed", " can not be ", "pardoned"};
    }

    public static void task2() {
        Integer[] ints = {1, 2, 3};
        Double[] doubles = {1.57, 7.654, 9.986};
        String[] verdict = {"Executed", " can not be ", "pardoned"};

        PrintA(ints);
        PrintA(doubles);
        PrintA(verdict);
    }

    private static <T> void PrintA(T[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
    }

    public static void task3() {
        Integer[] ints = {1, 2, 3};
        Double[] doubles = {1.57, 7.654, 9.986};
        String[] verdict = {"Executed", " can not be ", "pardoned"};

        PrintARev(ints);
        PrintARev(doubles);
        PrintARev(verdict);
    }

    private static <T> void PrintARev(T[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[0]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
    }

    public static void task4() {
        int[] ints = {1, 2, 3};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i]++;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
