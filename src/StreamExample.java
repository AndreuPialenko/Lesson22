//Лист строк
//Отсортировать
//Избавить от пустых строк и null
//Привести к верхнему регистру
//Сделать User-ов
//Вывести имена

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    private static void doWriteWithoutLambda(){
        List<String> strings = new ArrayList<>();
        strings.add("Ivan");
        strings.add(" ");
        strings.add("null");
        strings.add("stormner");
        strings.add("test");
        strings.add("Stepan");

        //2
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();

            if (name == null || name.isEmpty()){
                iterator.remove();
            }
        }
        //1
        Collections.sort(strings);
        //3
        List <User> users = new  ArrayList<>();
        for (String name:strings){
            User user = new User(name.toUpperCase());
            System.out.println(users.getClass());
            users.add(user);
        }
    }

    private static void doWithLambda(List<String> strings){
        List<User> users = strings.stream()
                .filter(name -> name != null && !name.isEmpty())
                .sorted()
                .map(String::toUpperCase)
                .map(User::new)
                .collect(Collectors.toList());

        users.forEach(System.out::println);
    }



}
