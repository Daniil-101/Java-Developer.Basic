import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumbers = getRandomArray(10_000, 5_000);
        int[] arrayNumbers2 = arrayNumbers.clone();
        int[] arrayNumbers3 = arrayNumbers.clone();
        int[] arrayNumbers4 = arrayNumbers.clone();
        List list5 = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());

        // Сортировка Выбором
        long startTimeSelection = System.currentTimeMillis();
        SelectionSort selectionSort = new SelectionSort(arrayNumbers);
        selectionSort.sort();
        long endTimeSelection = System.currentTimeMillis();
        System.out.println("SelectionSort: " + (endTimeSelection - startTimeSelection) + "millisecond");

        // Сортировка Пузырьком
        long startTimeBubble = System.currentTimeMillis();
        Bubble bubble = new Bubble(arrayNumbers2);
        bubble.sort();
        long endTimeBubble = System.currentTimeMillis();
        System.out.println("Bubble: " + (endTimeBubble - startTimeBubble) + "millisecond");

        // Сортировка Вставкой
        long startTimeInsertion = System.currentTimeMillis();
        Insertion insertion = new Insertion(arrayNumbers3);
        insertion.sort();
        long endTimeInsertion = System.currentTimeMillis();
        System.out.println("Insertion: " + (endTimeInsertion - startTimeInsertion) + "millisecond");

        // Стандартная сортировка массива
        long startTimeSort = System.currentTimeMillis();
        Arrays.sort(arrayNumbers4);
        long endTimeSort = System.currentTimeMillis();
        System.out.println("Arrays.sort: " + (endTimeSort - startTimeSort) + "millisecond");

        // Стандартная сортировка списка
        long startTimeSort1 = System.currentTimeMillis();
        Collections.sort(list5);
        long endTimeSort1 = System.currentTimeMillis();
        System.out.println("Collections.sort: " + (endTimeSort1 - startTimeSort1) + "millisecond");
    }


    private static void printArray(int[] arrayNumbers) {
        for (int value : arrayNumbers) System.out.print(value + " ");
    }

    private static int[] getRandomArray(int size, int valueRange) {
        int[] arrayNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayNumbers[i] = (int) (Math.random() * ((valueRange * 2) + 1)) - valueRange;
        }
        return arrayNumbers;
    }
}