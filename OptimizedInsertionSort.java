import java.util.Arrays;

public class OptimizedInsertionSort {

    static Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
    static int outerIndex;
    static int temp;

    // Method to shift elements and return the correct insertion position for temp
    public static int shift(int startIndex) {
        temp = array[startIndex];
        int i = startIndex;

        // Shift elements to the right until the correct position for temp is found
        for (; i > 0 && array[i - 1] > temp; i--) {  // checking wich one is the big one(value)
            array[i] = array[i - 1]; // starting index.
            System.out.println("i=" + startIndex + "; j=" + (startIndex - i + 1) + ": " + Arrays.deepToString(array));
			// me series eke shift eka 08.
        }
        return i; // Return the correct insertion position
    }

    // Insert temp at the correct position after shifting
    public static void insert(int endIndex) {
        int position = shift(endIndex); // 0 position ekata ara tempory paththakin thibba eka ethenta daanna oni.
        array[position] = temp; // Place temp at the correct position
        System.out.println("After i=" + endIndex + ": " + Arrays.deepToString(array));
    }

    // Optimized Insertion Sort method
    public static void insertionSort() { // patan ganne 1 index indala, a kiyanne 21... Habai yanne index number 1 kiyala...
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex); 
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Array: " + Arrays.deepToString(array));
        insertionSort();
        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}

// outer index eka patanganne 21 = 1... 
// first eke sorted eka already sorted nam anthima wenakan ran wenawa
// meke length eka 05 i.
// we need a tempory , ahema karanne shift karanna yana value eka thiyanna tanak oni.