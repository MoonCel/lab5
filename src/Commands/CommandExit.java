package Commands;

/**
 * Класс команды которая завершает работу программы
 */
public class CommandExit extends Command{
    /**
     * Метод который завершает работу программы
     */
    public static void action(){
        System.exit(0);
    }
}