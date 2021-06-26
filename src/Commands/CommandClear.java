package Commands;

import Elements.Person;

import java.util.TreeSet;

/**
 * Класс команды которая удаляет все элементы из коллекции
 */
public class CommandClear extends Command{
    /**
     * Метод который удаляет все элементы из коллекции
     *
     * @param collection - коллекция
     */
    public static void action(TreeSet<Person> collection){
        collection.clear();
        System.out.println("\nКоллекция успешно очищена\n");
    }
}
