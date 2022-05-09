import java.util.Random;

public class Sorter {
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length < 2)
            return;
        int midIndex = length / 2; //split array to 2
        int[] leftHalfArray = new int[midIndex];
        int[] rightHalfArray = new int[length - midIndex];
        for (int i = 0; i < midIndex; i++)
            leftHalfArray[i] = arr[i];  //write "left" array
        for (int i = midIndex; i < length; i++)
            rightHalfArray[i - midIndex] = arr[i]; //write "right" array
        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);

        int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalfArray[i] <= rightHalfArray[j]) {
                arr[k] = leftHalfArray[i];
                i++;
            } else {
                arr[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = leftHalfArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightHalfArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSortWithInsertion(int[] arr) {
        int length = arr.length;
        if (length < 2)
            return;
        if (length < 10)
            insertionSort(arr);
        else {
            int midIndex = length / 2;
            int[] leftHalfArray = new int[midIndex];    //split the array to 2
            int[] rightHalfArray = new int[length - midIndex];
            for (int i = 0; i < midIndex; i++)
                leftHalfArray[i] = arr[i];  //write "left" array
            for (int i = midIndex; i < length; i++)
                rightHalfArray[i - midIndex] = arr[i];  //write "right" array
            mergeSortWithInsertion(leftHalfArray);
            mergeSortWithInsertion(rightHalfArray);
            int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
            int i = 0, j = 0, k = 0;
            while (i < leftSize && j < rightSize) {
                if (leftHalfArray[i] <= rightHalfArray[j]) {
                    arr[k] = leftHalfArray[i];
                    i++;
                } else {
                    arr[k] = rightHalfArray[j];
                    j++;
                }
                k++;
            }
            while (i < leftSize) {
                arr[k] = leftHalfArray[i];
                i++;
                k++;
            }
            while (j < rightSize) {
                arr[k] = rightHalfArray[j];
                j++;
                k++;
            }
        }
    }

    public static void mergeSortWithComparing(int[] arr) { //ERROR!!!!!!!!
        int length = arr.length;
        if (length < 2)
            return;
        int midIndex = length / 2;
        int[] leftHalfArray = new int[midIndex];    //split the array to 2
        int[] rightHalfArray = new int[length - midIndex];
        for (int i = 0; i < midIndex; i++)
            leftHalfArray[i] = arr[i];  //write "left" array
        for (int i = midIndex; i < length; i++)
            rightHalfArray[i - midIndex] = arr[i]; //write "right" array
        mergeSortWithComparing(leftHalfArray);
        mergeSortWithComparing(rightHalfArray);
        if (leftHalfArray[leftHalfArray.length - 1] < rightHalfArray[0]) {
            System.arraycopy(leftHalfArray, 0, arr, 0, leftHalfArray.length);
            System.arraycopy(rightHalfArray, 0, arr, leftHalfArray.length, rightHalfArray.length);
        } else {

            int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
            int i = 0, j = 0, k = 0;
            while (i < leftSize && j < rightSize) {
                if (leftHalfArray[i] <= rightHalfArray[j]) {
                    arr[k] = leftHalfArray[i];
                    i++;
                } else {
                    arr[k] = rightHalfArray[j];
                    j++;
                }
                k++;
            }
            while (i < leftSize) {
                arr[k] = leftHalfArray[i];
                i++;
                k++;
            }
            while (j < rightSize) {
                arr[k] = rightHalfArray[j];
                j++;
                k++;
            }
        }
    }

    public static void mergeSortWithTwoModifications(int[] arr) {
        int length = arr.length;
        if (length < 2)
            return;
        if (length < 10)
            insertionSort(arr);
        else {
            int midIndex = length / 2;
            int[] leftHalfArray = new int[midIndex];    //split the array to 2
            int[] rightHalfArray = new int[length - midIndex];
            for (int i = 0; i < midIndex; i++)
                leftHalfArray[i] = arr[i];  //write "left" array
            for (int i = midIndex; i < length; i++)
                rightHalfArray[i - midIndex] = arr[i]; //write "right" array
            if (leftHalfArray[leftHalfArray.length - 1] < rightHalfArray[0]) {
                System.arraycopy(leftHalfArray, 0, arr, 0, leftHalfArray.length);
                System.arraycopy(rightHalfArray, 0, arr, leftHalfArray.length, rightHalfArray.length);
            }
            mergeSortWithTwoModifications(leftHalfArray);
            mergeSortWithTwoModifications(rightHalfArray);

            if (leftHalfArray[leftHalfArray.length - 1] < rightHalfArray[0]) {
                System.arraycopy(leftHalfArray, 0, arr, 0, leftHalfArray.length);
                System.arraycopy(rightHalfArray, 0, arr, leftHalfArray.length, rightHalfArray.length);
            } else {

                int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
                int i = 0, j = 0, k = 0;
                while (i < leftSize && j < rightSize) {
                    if (leftHalfArray[i] <= rightHalfArray[j]) {
                        arr[k] = leftHalfArray[i];
                        i++;
                    } else {
                        arr[k] = rightHalfArray[j];
                        j++;
                    }
                    k++;
                }
                while (i < leftSize) {
                    arr[k] = leftHalfArray[i];
                    i++;
                    k++;
                }
                while (j < rightSize) {
                    arr[k] = rightHalfArray[j];
                    j++;
                    k++;
                }
            }
        }
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swapElements(arr, pivotIndex, highIndex);

        int leftPointer = lowIndex, rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (arr[rightPointer] >= pivot && rightPointer > leftPointer)
                rightPointer--;
            swapElements(arr, leftPointer, rightPointer);
        }
        swapElements(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    public static void quickSortGeneral(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSortWithInsertion(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swapElements(arr, pivotIndex, highIndex);

        int leftPointer = lowIndex, rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            if (leftPointer - rightPointer < 10) {
                insertionSort(arr);
                break;
            } else {
                while (arr[leftPointer] <= pivot && leftPointer < rightPointer)
                    leftPointer++;
                while (arr[rightPointer] >= pivot && rightPointer > leftPointer)
                    rightPointer--;
                swapElements(arr, leftPointer, rightPointer);
            }
            swapElements(arr, leftPointer, highIndex);

            quickSortWithInsertion(arr, lowIndex, leftPointer - 1);
            quickSortWithInsertion(arr, leftPointer + 1, highIndex);
        }
    }

    public static void quickSortGeneralWithInsertion(int[] array) {
        quickSortWithInsertion(array, 0, array.length - 1);
    }

    private static void quickSortWithDijkstra(int[] arr, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex)
            return;
        int partitionElement = arr[lowIndex];
        int i = lowIndex;
        int lesserThan = lowIndex;
        int greaterThan = highIndex;

        while (i <= greaterThan) {
            if (arr.length < 10) {
                insertionSort(arr);
                break;
            } else {
                if (arr[i] < partitionElement)
                    swapElements(arr, lesserThan++, i++);
                else if (arr[i] > partitionElement)
                    swapElements(arr, greaterThan--, i);
                else
                    i++;
            }
        }
        quickSortWithTwoModifications(arr, lowIndex, lesserThan - 1);
        quickSortWithTwoModifications(arr, greaterThan + 1, highIndex);
    }

    public static void quickSortGeneralWithDijkstra(int[] array) {
        quickSortWithDijkstra(array, 0,
                array.length - 1);
    }

    private static void quickSortWithTwoModifications(int[] arr, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex)
            return;
        int partitionElement = arr[lowIndex];
        int i = lowIndex;
        int lesserThan = lowIndex;
        int greaterThan = highIndex;

        while (i <= greaterThan) {
            if (arr[i] < partitionElement)
                swapElements(arr, lesserThan++, i++);
            else if (arr[i] > partitionElement)
                swapElements(arr, greaterThan--, i);
            else
                i++;
        }
        quickSortWithDijkstra(arr, lowIndex, lesserThan - 1);
        quickSortWithDijkstra(arr, greaterThan + 1, highIndex);
    }

    public static void quickSortGeneralWithTwoModifications(int[] array) {
        quickSortWithTwoModifications(array, 0, array.length - 1);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }

    private static void swapElements(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
