import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test for triangle:
        Triangle triangle = new Triangle(3.9, 5, 4);
        try {
            System.out.println("Area of the triangle is: " + triangle.cal_area());
        } catch (invalidPorperty e) {
            System.out.println(e.getMessage());
        }
        triangle.set_border(3, 1.1);
        try {
            System.out.println("Area of the triangle is: " + triangle.cal_area());
        } catch (invalidPorperty e) {
            System.out.println(e.getMessage());
        }

        // Test for circle:
        Circle circle = new Circle(9.2);
        try {
            System.out.println("Area of the circle is: " + circle.cal_area());
        } catch (invalidPorperty e) {
            System.out.println(e.getMessage());
        }

        // Test for cone:
        Cone cone = new Cone(9, 4.3);
        System.out.println("Area of the cone is: " + cone.cal_volume());

        // Test for merge sort:
        double[] arr = {1.1, 4, 5.9, -9.99, 100, 23.44, 23.0};
        Merge_Sort sort = new Merge_Sort();
        sort.merge_sort(arr, 0, arr.length - 1);
        System.out.println("The sorted array is: ");
        for (double d : arr) {
            System.out.printf("%.2f ", d);
        }
        System.out.println();

        // Test for binary search:
        Scanner scanner = new Scanner(System.in);
        System.out.println("[SYS] Please input the target to find: ");
        double target = scanner.nextDouble();
        int result = -1;
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = (end + beg) / 2;
            if (arr[mid] < target) {
                beg = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                result = mid;
                break;
            }
        }
        if (result == -1) {
            System.out.println("[SYS] Target not found!");
        } else {
            System.out.println("[SYS] Target found! The index is: " + result);
        }
    }
}

class Merge_Sort {
    /**
     * Use merge sort to sort a double array (to rank from the smallest to the largest) recursively.
     */
    public void merge_sort(double[] arr, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex) return;
        int mid = (firstIndex + lastIndex) / 2;
        merge_sort(arr, firstIndex, mid);
        merge_sort(arr, mid + 1, lastIndex);
        merge(arr, firstIndex, mid, lastIndex);
    }

    private void merge(double[] arr, int sub1First, int sub1Last, int sub2Last) {
        // Add an infinite value to the end of each sub array, so the size is 1 larger.
        int sizeSub1 = sub1Last - sub1First + 2;
        int sizeSub2 = sub2Last - sub1Last + 1;

        double[] sub1 = new double[sizeSub1];
        System.arraycopy(arr, sub1First, sub1, 0, sizeSub1 - 1);
        sub1[sizeSub1 - 1] = Double.POSITIVE_INFINITY;

        double[] sub2 = new double[sizeSub2];
        System.arraycopy(arr, sub1Last + 1, sub2, 0, sizeSub2 - 1);
        sub2[sizeSub2 - 1] = Double.POSITIVE_INFINITY;

        for (int k = sub1First, i = 0, j = 0; k <= sub2Last; ++k) {
            // Check validity. Following line would not be executed under normal circumstance.
            if (i >= sizeSub1 || j >= sizeSub2) break;
            // Merge: @{
            if (sub1[i] < sub2[j]) {
                arr[k] = sub1[i];
                ++i;
            } else {
                arr[k] = sub2[j];
                ++j;
            }
            // @}
        }
    }
}
















