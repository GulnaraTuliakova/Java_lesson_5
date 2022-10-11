import java.util.HashMap;


public class lesson_5 {
 
    public static void main(String[] args) {

//1  Объявить и инициализировать словарь hashMap<String, String>
//2  Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
        
        HashMap <String,String> hashMap = new HashMap<>();
        hashMap.put("Война и мир", "Лев Толстой");
        hashMap.put("Последний из могикан", "Фенимор Купер");
        hashMap.put("Гарри Поттер", "Джоан Роулинг");
        hashMap.put("Незнайка на Луне", "Николай Носов");
        hashMap.put("Мертвые души", "Николай Гоголь");
        hashMap.put("Вий", "Николай Гоголь");
        hashMap.put("1984", "Джорж Оруэл");
        hashMap.put("Гамлет", "Вильям Шекспир");
        hashMap.put("Приключения Тома Сойера", "Марк Твен");
        hashMap.put("Илиада", "Гомер");

//3  Пройти по словарю и добавить к значениям символ "!"  
        System.out.println();
        System.out.println("Пройти по словарю и добавить к значениям символ '!' ");
        System.out.println();
        hashMap.forEach((k,n)-> System.out.println(k +  " - " + n + "!"));
        System.out.println();

//4  Добавить нового автора и название книги если соответствующего ключа не было.
        System.out.println(" Добавить нового автора и название книги если соответствующего ключа не было.");
        System.out.println();
        hashMap.putIfAbsent("Одиссея", "Гомер");
        hashMap.forEach((k,n)-> System.out.println(k +  " - " + n ));
        System.out.println();

//5  Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу
//  значения первое слово.

        System.out.println("Вырезать из соответствующего ключу значения первое слово.");
        System.out.println();

        if (hashMap.containsKey("Приключения Тома Сойера")) 
        hashMap.replace("Приключения Тома Сойера", "Твен");
            
   
        hashMap.forEach((k,n)-> System.out.println(k +  " - " + n ));
        System.out.println();
     

//6  *Пройти по словарю другим, не таким как в пункте 3, методом и 
// вывести пары ключ значение в консоль.
        System.out.println("*Пройти по словарю и добавить к значениям символ '!' Другим способом ");
        System.out.println();

        Object[] keys = hashMap.keySet().toArray();
        for (int i = 0; i < keys.length; i++)
        {
        String tmp = hashMap.get (keys [i]);
        System.out.println(keys[i] + " : " + tmp + '!' );
        }
        System.out.println();

//7  ** Пройти по словарю другим, не таким как в пункте 3 и 6, методом.
//  Добавить к значениям строку "(просмотрен)" и вывести в консоль.
        System.out.println(" ** Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к значениям строку (просмотрен) и вывести в консоль.");
        System.out.println();
        Object[] wasLooked = hashMap.keySet().toArray();
        for (int i = 0; i < wasLooked.length; i++)
        {
        String tmp = hashMap.get (wasLooked [i]);
        tmp = tmp.concat("!");

        System.out.println(wasLooked[i] + " : " + tmp + " " + "(просмотрен)");
        }

}
}