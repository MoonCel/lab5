package Commands;

import Elements.Person;

import java.time.LocalDateTime;
import java.util.TreeSet;

/**
 * Класс команды которая выводит всю информацию о коллекции
 */
public class CommandInfo extends Command{
    /**
     * Метод который выводит всю информацию о коллекции
     *
     * @param collection - коллекция
     * @param time - время создания коллекции
     */
    public static void action(TreeSet<Person> collection, LocalDateTime time){
        System.out.println("\nТип коллекции: java.util.LinkedHashSet");
        System.out.println("Дата создания: " + time);
        System.out.println("Структура элемента: {id, name, coordinates.x, coordinates.y, creationDate, " +
                "numberOfParticipants, albumsCount, establishmentDate, genre, frontMan.name, frontMan.weight, " +
                "frontMan.eyeColor, frontMan.hairColor, frontMan.nationality}");
        System.out.println("Колличество элементов: " + collection.size() + "\n");
    }
}