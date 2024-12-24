package ua.hillel.lessons.lesson30.main.dao;

import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;
import ua.hillel.lessons.lesson29.DatabaseInitializer;
import ua.hillel.lessons.lesson30.main.entity.*;
import ua.hillel.lessons.lesson30.main.utils.HibernateUtil;

import java.sql.*;
import java.util.List;

public class OrderDAO {

    public void addOrder(Order order) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        }
    }

    // HQL
//    public void addOrder(Order order) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//
//            String hql = "INSERT INTO Order (user, productName, quantity, price)" +
//                    "VALUES (:user, :productName, :quantity, :price)";
//
//            MutationQuery mutationQuery = session.createMutationQuery(hql);
//
//            mutationQuery.setParameter("user", order.getUser());
//            mutationQuery.setParameter("productName", order.getProductName() );
//            mutationQuery.setParameter("quantity", order.getQuantity());
//            mutationQuery.setParameter("price", order.getPrice());
//
//            mutationQuery.executeUpdate();
//
//            transaction.commit();
//
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            System.out.println(e.getMessage());
//        }
//    }

    // Criteria API
//    public void addOrder(Order order) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//
//            HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//            JpaCriteriaQuery<Order> criteriaQuery = criteriaBuilder.createQuery(Order.class);
//            Root<Order> root = criteriaQuery.from(Order.class);
//            criteriaQuery.select(root);
//
//            session.save(order);
//
//            transaction.commit();
//        }
//    }

    public List<Order> getAllOrders() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Order> fromOrder = session.createQuery("from Order", Order.class);
            return fromOrder.list();
        }
    }

    public void deleteOrder(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Order order = session.get(Order.class, id);
            if (order != null) {
                session.delete(order);
            }
            transaction.commit();
        }
    }
}
