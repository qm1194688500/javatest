public class Test {
    public static void shiftDown(int[] array, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int min = left;
            int right = 2 * index + 2;
            if (right < size) {
                if (array[right] < array[left]) {
                    min = right;
                }
            }
            if (array[index] <= array[min]) {
                break;
            }
            int t = array[index];
            array[index] = array[min];
            array[min] = t;
            index = min;
            left = 2 * index + 1;
        }
    }
}
