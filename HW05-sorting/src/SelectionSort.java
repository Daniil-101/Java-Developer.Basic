public class SelectionSort extends SortingTypes {

    public SelectionSort(int[] array) {
        this.array = array;
    }


    @Override
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            int indexMinElement = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    indexMinElement = j;
                    min = array[j];
                }
            }
            array[indexMinElement] = array[i];
            array[i] = min;
        }
    }
}
