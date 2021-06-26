import Commands.*;
import Elements.Person;
import Manager.Manager;

import java.time.LocalDateTime;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //String temp = System.getenv().get("PersonPATH");
        Manager manager = new Manager();
        TreeSet<Person> collection = new TreeSet<Person>(new PersonComparator());
        LocalDateTime today = LocalDateTime.now();
        String file;
        //file = "/home/s308489/Person.csv";
        file = "C:\\Users\\Евгений\\IdeaProjects\\lab5.1\\src\\Files\\Person.csv";
        System.out.println(file);
        manager.fill(file, collection);
        System.out.println("\nhelp : вывести справку по доступным командам\n");

        while (true){
            System.out.println("Введите команду:");
            String line;
            String command;
            line = in.nextLine();
            String[] field;
            field = line.split(" ");
            command = field[0];
            CommandExecution.action(collection, line, command, file, today);
        }
    }
}