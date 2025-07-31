package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ваня", "Петров", (byte) 20);
        System.out.println("User с именем — Ваня добавлен в базу данных");
        userDao.saveUser("Дима", "Крылов", (byte) 25);
        System.out.println("User с именем — Дима добавлен в базу данных");
        userDao.saveUser("Денис", "Калинин", (byte) 31);
        System.out.println("User с именем — Денис добавлен в базу данных");
        userDao.saveUser("Петр", "Минин", (byte) 38);
        System.out.println("User с именем — Петр добавлен в базу данных");

        userDao.removeUserById(1);

        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}