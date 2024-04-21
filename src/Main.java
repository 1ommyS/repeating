import alcoholStore.AlcholStore;
import alcoholStore.AlcoholStoreTupoy;
import alcoholStore.AlcoholStoreUmniy;

import java.util.Arrays;

public class Main {
    // адрес в памяти сячбж
    static void function1(int a) {
        a = 20;
        System.out.println("в функции: " + a);
    }

    static void function2(int[] a) {
        a[0] = 20;
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        /*int a = 5; // адрес в памяти: 32131312312
        function1(a);
        System.out.println("в main " + a); // 5 ? 20 ?



        int[] b = {15, 23, 4};
        function2(b);
        System.out.println(Arrays.toString(b)); // 20, 23, 4
*/

        /*AlcoholStoreTupoy store = new AlcoholStoreTupoy(5, "Красное&Белое");
        store.addItem("Водка", 300);
        store.addItem("Пиво", 50);
        store.addItem("Вино", 500);
        store.addItem("Коньяк", 400);
        store.addItem("Виски", 800);
        store.addItem("Ликер", 1200);
        System.out.println();

        store.printAll();
        System.out.println();

        store.buyItem("Вино");

        store.printAll();

        store.addItem("вермут", 400);
        System.out.println();
        store.printAll();
*/
       /* AlcholStore store = new AlcoholStoreTupoy(5);

        store.addItem("Водка", 300);
        store.addItem("Пиво", 50);
        store.addItem("Вино", 500);
        store.addItem("Коньяк", 400);
        store.addItem("Виски", -800);

        try {
            store.addItem("Ликер", 1200);
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }


        System.out.println();

        store.printAll();
        System.out.println();

        store.buyItem("Вино");

        store.printAll();

        store.addItem("вермут", 400);
        System.out.println();
        store.printAll();
*/

        /*
        int -> Integer
        double -> Double
        char -> Character
        byte -> Byte
        bool -> Boolean
        float -> Float
         */

        ArrayListCustom<Integer> array = new ArrayListCustom<>(5);

        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(array);
        array.add(6);
        System.out.println(array);

        ArrayListCustom<String> array2 = new ArrayListCustom<>(5);
        array2.add("a");
        array2.add("b");
        array2.add("c");
        array2.add("d");
        array2.add("e");
        System.out.println(array2);
        array2.add("f");
        System.out.println(array2);

        /*
        1) условия
        2) циклы
        3) массивы
        4) функции
        5) классы
         */
    }
}