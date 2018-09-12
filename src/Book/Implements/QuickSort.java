package Book.Implements;

import Book.Implements.Book;

public class QuickSort {
    static void qsort(double[] elements) {
        qs(elements, 0, elements.length - 1);
    }

    private static void qs(double[] elements, int left, int right) {
        int i, j;
        double x, y;
        i = left;
        j = right;
        x = elements[(left + right) / 2];

        do {
            while ((elements[i] < x) && (i < right)) i++;
            while ((x < elements[j]) && j > left) j--;

            if (i <= j) {
                y = elements[i];
                elements[i] = elements[j];
                elements[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qs(elements, left, j);
        if (i < right) qs(elements, i, right);
    }
}
