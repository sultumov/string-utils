package com.example.sortsearch;

public class SortSearchUtils {

    public void bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Ничего не делаем, если массив null или содержит 0 или 1 элемент
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int linearSearch(int[] array, int key) {
        if (array == null) {
            return -1; // Или выбросить исключение IllegalArgumentException
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Возвращаем индекс элемента, если он найден
            }
        }
        return -1; // Возвращаем -1, если элемент не найден
    }
}
