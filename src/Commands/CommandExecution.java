package Commands;

import Elements.Person;
import java.time.LocalDateTime;
import java.util.TreeSet;
    public class CommandExecution extends Command{
        /**
         * Команда которая исполняет все команды
         *
         * @param collection - коллекция
         * @param line - строка котрую вводят с консоли
         * @param command - комманда котрую вводят с консоли
         * @param file - файл в котором храниться коллекция
         * @param time - текущее время
         */
        public static void action(TreeSet<Person> collection, String line, String command, String file, LocalDateTime time){ // TODO: implement method from comman, why u create new?
            //System.out.println(line);
            if (line.equals("help")){
                CommandHelp.action();
                //System.out.println("pop");

            } else if (line.equals("info")){
                CommandInfo.action(collection, time);

            } else if (line.equals("show")){
                CommandShow.action(collection);

            } else if (line.equals("exit")){
                CommandExit.action();

            } else if (line.equals("add")){
                CommandAdd.action(line, collection);

            } else if ((command).equals("update_id")){
                CommandUpdateID.action(line, collection);

            } else if ((command).equals("remove_by_id")){
                CommandRemoveByID.action(line, collection);

            } else if ((command).equals("FilterContains")){
                if (line.split(" ").length == 2) {
                    CommandFilterContains.action(collection, line.split(" ")[1]);
                }
            } else if ((command).equals("add_if_min")){
                CommandAddIfMin.action(line, collection);

            } else if ((command).equals("add_if_max")){
                CommandAddIfMax.action(line, collection);

            } else if ((command).equals("remove_greater")){
                CommandRemoveGreater.action(line, collection);

            } else if ((line).equals("clear")){
                CommandClear.action(collection);

            } else if ((line).equals("save")){
                CommandSave.action(file, collection);

            } else if ((command).equals("execute_script")){
                CommandExecuteScript.action(collection, line, command, file, time);

            } else {
                System.out.println("\nНеизвестная команда");
                System.out.println("help : вывести справку по доступным командам\n");
            }
        }
    }
