public class Bubble extends SortingTypes {

    public Bubble(int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        int intermediate;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    intermediate = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = intermediate;
                }
            }
        }
    }
}
