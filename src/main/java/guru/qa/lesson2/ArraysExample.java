package guru.qa.lesson2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.*;

public class ArraysExample {


        String[] stringArray = {"foo", "bar", "baz"};
        //переменная относящаяся ко всему классу - поля класса

        public static void main(String[] args) {

            String[] stringArray2 = {"quux", "bat"};
            //переменная объявленная внутри метода - переменная

            int[] intArray = new int[] {1, 2, 3, 4, 5};

            for (int i = 4; i >= 0; i--) {
                System.out.println(intArray[i]);
            }
            for (int element: intArray) {
                System.out.println(element);
            }
            System.out.println(Arrays.toString(intArray));
            //метод Arrays.toString выводит элементы массива в формате: [1, 2, 3, 4, 5]
            //Arrays.sort() выполняет сортировку массива
            //Arrays.copyOf() передает оригинальный массив (из которого надо скопировать значения)
            // и длину нового массива, в который мы копируем данные: int[] intArrayCopy = Arrays.copyOf(intArray, 4)
            //или Arrays.copyOfRange(intArray, 2,4);
            //Arrays.equals(array1, array2) сравнение содеримого массивов

            ElementsCollection selenideElements = Selenide.$$("");

            List<String> stringList = new ArrayList<>();
            stringList.add("foo");
            stringList.remove(0);
            stringList.remove("foo");

            List<Integer> intList = new ArrayList<>();
            intList.add(0);
            intList.add(1);
            intList.add(2);

            intList.remove(2);
            //{scope}

            Iterator<Integer> iterator = intList.iterator();
            while (iterator.hasNext()) {
                Integer integer = iterator.next();
                iterator.remove();
            }
            Set<String> stringSet = new HashSet<>();
            //содержит только уникальные объекты
            //неупорядоченное хранение данных
            Set<String> inkedStringSet = new LinkedHashSet<>();
            //данные сохраняются в первоначальном порядке
            Set<String> treeStringSet = new TreeSet<>();
            //хранение в сортированном виде

            Map<Integer, String> aMap = new HashMap<>();
            aMap.put(1, "foo");
            aMap.put(2, "bar");

        }
}
