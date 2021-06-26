package Commands;
import Elements.Person;

import java.util.TreeSet;

/**
 * Класс команды которая выводит все элементы коллекции
 */
public class CommandShow extends Command {
    /**
     * Метод который выводит все элементы коллекции
     *
     * @param collection - коллекция
     */
    public static void action(TreeSet<Person> collection){
        Person[] arr;
        arr = collection.toArray(new Person[0]);
        for (int i =0; i < collection.size(); i++){
            if (i == 0) {
                show(arr[i]);
            } else if (i == collection.size()-1) {
                show(arr[i]);
            } else show(arr[i]);
        }
    }
    private static void show(Person person){
        System.out.println("id: "+ person.getId());
        System.out.println("Name: "+ person.getName());
        System.out.println("Coordinates: "+ person.getCoordinates().getX());
        System.out.println("Coordinates: "+ person.getCoordinates().getY());
        System.out.println("Country: "+ person.getCountry());
        System.out.println("CreationDate: "+ person.getCreationDate());
        System.out.println("EyeColor: "+ person.getEyeColor().toString());
        System.out.println("HairColor: "+ person.getHairColor().toString());
        System.out.println("Height: "+ person.getHeight());
        System.out.println("\tLocation X: "+ person.getLocation().getXloc());
        System.out.println("\tLocation Y: "+ person.getLocation().getYloc());
        System.out.println("\tLocation Z: "+ person.getLocation().getZloc());
        System.out.println(person.getLocation());

    }
}
