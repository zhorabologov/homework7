public class Main {
    public static void main(String[] args) {
        //Задание 1

        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

        //Задание 2

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }

        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }

        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        //Задание 3

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }

        // Задание 4

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;

            }
        }
    }
}

