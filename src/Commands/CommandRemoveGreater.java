package Commands;

import Elements.Person;

import java.util.TreeSet;

/**
 * Класс команды который удаляет из коллекции все элементы, большие, чем заданный
 */
public class CommandRemoveGreater extends Command{
    /**
     * Метод который удаляет из коллекции все элементы, большие, чем заданный
     *
     * @param command - команда которую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, TreeSet<Person> collection){
        String[] field;
        Object[] arr;
        String element;
        boolean work;
        work = false;
        int index;
        field = command.split(" ");
        if (field.length == 1){
            System.out.println("\nЭлемент отсутствует\n");
        } else if (field.length >= 2){
            element = field[1];
            if (field.length > 2){
                for (index = 2; index<field.length; index++) {
                    element = element + " " + field[index];
                }
            }
            arr = collection.toArray();
            for (index = 0; index<collection.size(); index++) {
                //System.out.println(arr[index].hashCode());
                if (element.hashCode() < arr[index].hashCode()) {
                    collection.remove(arr[index]);
                    work = true;
                }
            }
            if (!work) {
                System.out.println("\nЭлементов меньше указанного не существует\n");
                //System.out.println(element.hashCode());
            } else System.out.println("\nНаибольшие элементы удалены\n");

        } else System.out.println("\nНеверный формат ввода данных\n");
    }
}
