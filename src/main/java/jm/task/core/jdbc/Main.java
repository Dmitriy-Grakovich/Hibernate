package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Victor", "Smirnov", (byte) 40);
        System.out.println("User с именем – Victor добавлен в базу данных ");
        userService.saveUser("Dmitriy", "Petrov", (byte) 36);
        System.out.println("User с именем – Dmitriy добавлен в базу данных ");
        userService.saveUser("Anna", "Smit", (byte) 25);
        System.out.println("User с именем – Anna добавлен в базу данных ");
        userService.saveUser("Ira", "Li", (byte) 32);
        System.out.println("User с именем – Ira добавлен в базу данных ");
        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
