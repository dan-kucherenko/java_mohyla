public class BinaryTreeForArrRealisation<T> {
    private T[] arr = (T[]) new Object[1];

    public BinaryTreeForArrRealisation() {
    }

    public void setRoot(T root) {
        arr[0] = root;
    }


    public void addLeftChild(T elementToAdd, T element) {
        int rootIndex = getIndexOfEl(elementToAdd);
        int leafIndex = (rootIndex * 2) + 1;
        if (rootIndex == -1) {
            System.out.println("Element to add wasn't found");
            return;
        }
        if (arr[rootIndex] == null)
            System.out.println("There is no parent for this child");
        else {
            if (leafIndex >= arr.length) {
                T[] newArr = (T[]) new Object[arr.length + leafIndex];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                arr = newArr;
                arr[leafIndex] = element;
            } else
                arr[leafIndex] = element;
        }
    }

    public void addRightChild(T elementToAdd, T element) {
        int rootIndex = getIndexOfEl(elementToAdd);
        int leafIndex = (rootIndex * 2) + 2;
        if (rootIndex == -1) {
            System.out.println("Element to add wasn't found");
            return;
        }
        if (arr[rootIndex] == null)
            System.out.println("There is no parent for this child");
        else {
            if (leafIndex >= arr.length) {
                T[] newArr = (T[]) new Object[arr.length + leafIndex];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                arr = newArr;
                arr[leafIndex] = element;
            } else
                arr[leafIndex] = element;

        }
    }
    @Override
    public String toString() {
        String res = toString(0);
        return "(" + res + ")";
    }

    private String toString(int rootIndex) {
        String res = "";
        if (arr[rootIndex] == null)
            return res += "*"; // * is used for empty child
        if ((rootIndex * 2 + 1 > arr.length || rootIndex * 2 + 2 > arr.length) ||
                (arr[rootIndex * 2 + 1] == null && arr[rootIndex * 2 + 2] == null))
            return res += arr[rootIndex];
        return arr[rootIndex] + "(" + toString((rootIndex * 2) + 1) + "," +
                toString((rootIndex * 2) + 2) + ")";
    }

    private int getIndexOfEl(T element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return index = i;
        }
        return index;
    }

}
