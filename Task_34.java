import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

// Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.
// Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


public class Task_34 {
    public static ArrayList<Integer> listGenerator(int listLength, int minNumber, int maxNumber) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(minNumber, maxNumber));
        }
        return list;
    }

    public static double unicNum(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        return set.size() * 100 / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = listGenerator(100, 0, 101);
        System.out.println(list);

        System.out.println(unicNum(list) + "%");
    }
    

    
}
