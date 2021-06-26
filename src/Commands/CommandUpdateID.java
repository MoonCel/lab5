package Commands;

import Elements.Person;
import Manager.Manager;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Класс команды которая обновляет id элемента
 */
public class CommandUpdateID extends Command{
    /**
     * Метод который обновляет id элемента
     *
     * @param command - команда которую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, TreeSet<Person> collection){
        /*Manager manager = new Manager();
        String element = "";
        String[] field;
        Object[] arr;
        boolean work;
        work = false;
        int index;
        field = command.split(" ");
        arr = collection.toArray();
        if (field.length == 1){
            System.err.println("\nЭлемент отсутствует\n");
        } else  if (field.length >= 2){
            element = field[1];
            if (field.length > 2){
                for (index = 2; index<field.length; index++) {
                    element = element + " " + field[index];
                }
            }
        } else element = field[1];
        for (index = 0; index<collection.size(); index++) {
            if (manager.set(element).toString().equals(arr[index].toString())) {
                collection.remove((arr[index]));
                collection.add(manager.idUpdate(element));
                System.out.println("\nid успешно обновлён\n");
                work = true;
                break;
            }
        }
        if (!work) System.out.println("\nТакого элемента не существует\n");*/

        //-----------------------REMOVING-------------------------//
        String[] fields;
        Object[] arr;
        boolean work;
        work = false;
        int index;
        String id = null;
        fields = command.split(" ");
        if (fields.length == 2){
            arr = collection.toArray();
            for (index = 0; index<collection.size(); index++){
                //id = (arr[index].toString()).split(",");
                id = ((Person) arr[index]).getId().toString();
                if (id.equals(fields[1])){
                    collection.remove((arr[index]));
                    //System.out.println("\nЭлемент успешно удалён\n");
                    work = true;
                }
            }
        } else {
            System.out.println("\nНеверный формат ввода данных\n");
            work = false;
        }
        if (!work) System.out.println("\nНе найдено элемента с таким id\n");

        //------------------------ADDING---------------------------//

        Manager manager = new Manager();
        Scanner in = new Scanner(System.in);
        String element = "";
        String field[] = new String[]{
                //"Id: ",
                "Name: ",
                "X: ",
                "Y: ",
                //"CreationDate: ",
                "Height: ",
                "EyeColor (BLUE, GREEN, RED, ORANGE, BROWN): ",
                "HairColor (BLUE, GREEN, RED, ORANGE, BROWN): ",
                "Country (FRANCE, CHINA, INDIA): ",
                "x: ",
                "y: ",
                "z: "
        } ;
        for (int i = 0; i<10; i++){
            System.out.print(field[i]);
            element = element + "," + in.nextLine();
        }
        element = element.substring(1);
        //System.out.println(element);

        //element = element + " " + field[index];

        manager.add(element, collection, true, Integer.parseInt(id));
        System.out.println("Элемент успешно обновлен");
    }
}
