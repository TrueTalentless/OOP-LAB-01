/**
 * @author Лебедев Игнат 3312
 * @version 1.0
 */
public class lab01 {
    /**
     * @param args аргументов нет
     */
    public static void main(String[] args) {

        // Создаём целочисленный массив
        int[] a = {8, 71, 30, -2, -112, 0, 9, 49};

        // Создаём вспомогательную переменную для сортировки
        int t;

        // Выводим все элементы исходного массива
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Сортируем массив
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                // Переставляем элементы при необходимости
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        // Выводим все элементы отсортированного массива
        for (int i : a) {
            System.out.printf("%d ", i);
        }
    }
}
