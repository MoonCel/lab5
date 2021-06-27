package Commands;
import Manager.Manager;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Класс команды которая добавляет новый элемент в коллекцию
 */
public class CommandAdd extends Command {

    /**
     * Метод который добавляет новый элемент в коллекцию
     *
     * @param command    - строка котрую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, TreeSet collection) {
        Manager manager = new Manager();
        Scanner in = new Scanner(System.in);
        String element = "";
        String field[] = new String[]{ //TODO remove rebuilding strings
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
        for (int i = 0; i<10; i++){ //TODO remove constant
            System.out.print(field[i]);
            element = element + "," + in.nextLine();
        }
        element = element.substring(1);
        //System.out.println(element);

        //element = element + " " + field[index];

        manager.add(element, collection, false, 0);


    }
}
