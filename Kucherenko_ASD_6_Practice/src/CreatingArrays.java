import java.util.ArrayList;

public class CreatingArrays {
    private static ArrayList<int[]> arrayList = new ArrayList<>();
    private static int[] arrayLength = {1024, 2048, 4096, 8192, 16384, 32768};

    public void createRandomArrays() {
        for (int j : arrayLength) arrayList.add(GenerateAnArray.generateNewRandomArray(j));
    }

    public void createSortedArrays() {
        arrayList.clear();
        for (int j : arrayLength) arrayList.add(GenerateAnArray.generateSortedArray(j));
    }

    public void createReverseSortedArray() {
        arrayList.clear();
        for (int j : arrayLength) arrayList.add(GenerateAnArray.generateReverseSortedArray(j));
    }

    public void createArraysWithSameElement() {
        arrayList.clear();
        for (int j : arrayLength) arrayList.add(GenerateAnArray.generateNewArrayWithSameElement(j));
    }
}
