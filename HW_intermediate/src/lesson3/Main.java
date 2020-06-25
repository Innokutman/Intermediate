package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задания 1 и 2:

        words();
        phones();
    }

    public static void words(){
        String[] array = {"Белый", "Красный", "Жёлтый", "Белый", "Зелёный"};

        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(array));
        System.out.println("Initial list: " + listOfStrings.toString());

        LinkedHashSet<String> distinctValues = new LinkedHashSet<>(listOfStrings); //Уникальные значения
        System.out.println("Distinct list: " + distinctValues);

        Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>(); //Подсчёт отдельных слов
        for(String word: listOfStrings) {
            Integer count = wordCount.get(word);
            wordCount.put(word, (count==null) ? 1 : count+1);
        }
        System.out.println("Количество слов: " + wordCount);
    }
    public static void phones(){
        Phonelist MyPhoneBook = new Phonelist();
        MyPhoneBook.add("Коновалова",new String[]{"1231451","15153","31535"});
        MyPhoneBook.add("Шевцов",new String[]{"45345","4353453","345345"});
        MyPhoneBook.add("Цукерман",new String[]{"934534535","132533","235353"});
        MyPhoneBook.add("Коновалова",new String[]{"54545","15153","85968485"});

        System.out.println(MyPhoneBook.getContacts()); //Вывести весь справочник

        MyPhoneBook.get("Коновалова"); //Вывести отдельные элементы
        MyPhoneBook.get("Шевцов");
    }
}
