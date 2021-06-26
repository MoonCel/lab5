package Commands;

import Elements.Person;

import java.io.BufferedOutputStream;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TreeSet;

/**
 * Класс команды который сохраняет коллекцию
 */
public class CommandSave extends Command{
    /**
     * Метод который сохраняет коллекцию
     *
     * @param file - файл где храниться коллекция
     * @param collection - коллекция
     */
    public static void action(String file, TreeSet<Person> collection){
        /*Object[] text;
        text = collection.toArray();
        int index;
        try(FileOutputStream out = new FileOutputStream(file);
            FileWriter fileWriter = new FileWriter(file))
        {
            for (index = 0; index< text.length; index++){
                byte[] writer = (String.valueOf(text[index]) + "\n").getBytes();
                //fileWriter.write(String.valueOf(writer), 0, writer.length);
                fileWriter.write(String.valueOf(writer), 0, String.valueOf(writer).length());
            }
            System.out.println("\nКоллекция успешно сохранена\n");
        }
        catch(IOException ex){
            System.out.println("Ошибка сохранения");
        }*/
        Object[] text;
        text = collection.toArray();
        int index;
        LocalDateTime today = LocalDateTime.now();
        try(FileOutputStream out=new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            for (index = 0; index< text.length; index++){
                String shit = ((Person) text[index]).getId().toString() + "," +
                        ((Person) text[index]).getName() + "," +
                        ((Person) text[index]).getCoordinates().getX().toString() + "," +
                        ((Person) text[index]).getCoordinates().getY().toString() + "," +
                        today.toString() + "," +
                        String.valueOf(((Person) text[index]).getHeight()) + "," +
                        ((Person) text[index]).getEyeColor().toString() + "," +
                        ((Person) text[index]).getHairColor().toString() + "," +
                        ((Person) text[index]).getCountry().toString() + "," +
                        ((Person) text[index]).getLocation().getXloc() + "," +
                        ((Person) text[index]).getLocation().getYloc() + "," +
                        ((Person) text[index]).getLocation().getZloc();
                byte[] buffer = (shit + "\n").getBytes();
                bos.write(buffer, 0, buffer.length);
            }
            System.out.println("\nКоллекция успешно сохранена\n");
        }
        catch(IOException ex){
            System.out.println("Ошибка сохранения");
        }
    }
}