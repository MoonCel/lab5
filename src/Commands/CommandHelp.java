package Commands;

/**
 *  Класс для вывода справки по всем командам
 *
 */
public class CommandHelp extends Command {
    /**
     *  Вывод справкипо всем командам
     *
     */
    public static void action(){
        System.out.println("\nhelp: вывести справку по доступным командам");
        System.out.println("info : вывести в стандартный поток вывода информацию о коллекции");
        System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        System.out.println("add {element} : добавить новый элемент в коллекцию");
        System.out.println("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
        System.out.println("remove_by_id id : удалить элемент из коллекции по его id");
        System.out.println("clear : очистить коллекцию");
        System.out.println("save : сохранить коллекцию в файл");
        System.out.println("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        System.out.println("exit : завершить программу (без сохранения в файл)");
        System.out.println("add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции");
        System.out.println("add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
        System.out.println("remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n");
        System.out.println("group_counting_by_coordinates : сгруппировать элементы коллекции по значению поля coordinates, вывести количество элементов в каждой группе\n");
        System.out.println("filter_contains_name name : вывести элементы, значение поля name которых содержит заданную подстроку\n");
    }
}
