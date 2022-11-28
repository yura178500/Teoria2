import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        //Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.
        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "Hello");
        keyValue.put(2, "World");
        keyValue.put(3, "Have a nice day");
        System.out.println(keyValue.size());
        System.out.println("Цикл вайт");
        Iterator iter = keyValue.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry qurentMe = (Map.Entry) iter.next();
            System.out.println("Ключ это" + qurentMe.getKey() + "Значение это" + qurentMe.getValue());
        }
        System.out.println("Цикл Фор ");
        for (Map.Entry qurentMe2 : keyValue.entrySet()) {
            System.out.println("Ключ это" + qurentMe2.getKey() + "Значение это" + qurentMe2.getValue());
        }
//Размер переменной keyValue можно получить с помощью метода size() После этого мы использовали цикл while для
        //     обхода keyValue , которая содержит по одной паре ключ-значение для каждого элимента.
        //Ключ и значение могут быть получены с помощю методоов getKey() и getValue()
        // Анологично и цикл for. на элиментах qurentMe2 в HashMap

    }
}
