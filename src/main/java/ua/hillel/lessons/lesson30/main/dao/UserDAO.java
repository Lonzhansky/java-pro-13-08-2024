package ua.hillel.lessons.lesson30.main.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ua.hillel.lessons.lesson30.main.entity.User;
import ua.hillel.lessons.lesson30.main.utils.HibernateUtil;

import java.sql.*;
import java.util.List;

public class UserDAO {

    public void addUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }
    }

    public List<User> getAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<User> fromUser = session.createQuery("from User", User.class);
            return fromUser.list();
        }
    }

    public User getUserById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(User.class, id);
        }
    }

    public void updateUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }
    }

    public void deleteUser(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = getUserById(id);
            if (user != null) {
                session.delete(user);
            }
            transaction.commit();
        }
    }
}
