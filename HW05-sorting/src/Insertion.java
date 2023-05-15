public class Insertion extends SortingTypes {

    public Insertion(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) { //начинается не с 0-го элемента а с 1-го, потому что элемент
                                                // до 1-го элемента будет нашей отсортированной последовательностью
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) { // пока j>0 и элемент j-1 > j, array-массив int
                int intermediate = array[j - 1]; // меняем местами элементы j и j-1
                array[j - 1] = array[j];
                array[j] = intermediate;
            }
        }
    }
}
