package Commands;

import Elements.Person;

import java.util.TreeSet;

/**
 * Класс команды которая группирует элементы по их location
 */
public class CommandGroupCountingByLocation extends Command{
    /**
     * Команда которая группирует элементы по их location
     *
     * @param collection - коллекция
     */
    public static void action(TreeSet<Person> collection){
        String[] fields;
        Object[] arr;
        int index;
        if (collection.size() >= 1) {
            String[] id = new String[collection.size()];
            int[] idCount = new int[collection.size()];
            arr = collection.toArray();
            int i;
            for (index = 0; index < collection.size(); index++) {
                boolean work;
                work = false;
                fields = (arr[index].toString()).split(",");
                for (i = 0; i < id.length; i++) {
                    if (id[i] != null) if (id[i].equals(fields[0])) work = true;
                }
                if (!work) id[index] = fields[0];
            }

            for (index = 0; index < collection.size(); index++) {
                fields = (arr[index].toString()).split(",");
                for (i = 0; i < id.length; i++) {
                    if (id[i] != null) if (id[i].equals(fields[0])) idCount[i]++;
                }
            }

            index = 0;
            System.out.println("\n");
            while (id[index] != null) {
                System.out.println("Количество элементов с location " + id[index] + ": " + idCount[index]);
                index++;
                if (index == collection.size()) break;
            }
            System.out.println("\n");
        } else System.out.println("Коллекция пустая");
    }
}
