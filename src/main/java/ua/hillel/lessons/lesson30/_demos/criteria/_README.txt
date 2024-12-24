
Техстек: Maven, Hibernate (Criteria).
---------------

Criteria Queries — програмний спосіб виконання запиту,
тобто без необробленого SQL.
У порівнянні з HQL, Criteria Queries - об'єктно-орієнтована API,
яка дозволяє писати динамічні запити до БД.
Головною перевагою Criteria Queries над HQL вважається більш чистий
та об’єктно-орієнтований API.
Починаючи з Hibernate 5.2, Hibernate Criteria API застаріло,
і нові розробки зосереджені на JPA Criteria API.


https://docs.jboss.org/hibernate/orm/6.6/userguide/html_single/Hibernate_User_Guide.html#criteria
https://www.baeldung.com/hibernate-criteria-queries

---------------

1) Визначаємо об'єкти (сутності) реального світу.
На основі цих об'єктів сформуємо таблиці БД та
моделі Java-класів

2) Складаємо SQL-запити (SQLs.sql).

3) Створюємо Maven-проект.

4) Додаємо залежності.

5) Формуємо конфігураційний файл, який можна додати
до .gitignore, оскільки присутні чутливі дані (логін,
пароль доступу до БД)
src/main/resources/app.properties

6) Формуємо пакети, класи

7) Перевіряємо працездатність програми.

--------------------------

Interface Session
Основний інтерфейс часу виконання між Java програмою і Hibernate.
Представляє поняття контексту збереження, набору екземплярів керованих об'єктів,
пов'язаних з логічною транзакцією.
https://docs.jboss.org/hibernate/orm/6.4/javadocs/org/hibernate/Session.html

Interface SessionFactory
Є екземпляром Hibernate. Підтримує метамодель часу виконання, що представляє постійні
об'єкти, їх атрибути, їх асоціації та їх зіставлення з таблицями реляційної
бази даних, і навіть конфігурацію, що впливає на поведінку Hibernate під час
виконання, та екземпляри служб, які Hibernate необхідно виконувати свої обов'язки.
https://docs.jboss.org/hibernate/orm/6.4/javadocs/org/hibernate/SessionFactory.html

Interface Transaction
Представляє локальну транзакцію ресурсу, де локальна транзакція інтерпретується
Hibernate як будь-яка транзакція, що знаходиться під управлінням Hibernate.
https://docs.jboss.org/hibernate/orm/6.4/javadocs/org/hibernate/Transaction.html

Interface MutationQuery
У контексті активної session представляє запит на зміну, що виконується,
тобто insert, update, або delete.
Це спрощена версія Query, що надає лише методи, що стосуються запитів на зміну.
https://docs.jboss.org/hibernate/orm/6.4/javadocs/org/hibernate/query/MutationQuery.html
https://docs.jboss.org/hibernate/orm/6.4/javadocs/org/hibernate/query/QueryProducer.html#createMutationQuery(java.lang.String)

Class Properties
Службовий клас, призначений для обробки файлів конфігурації, де властивості
(прості параметри) зберігаються у вигляді пар ключ-значення поза скомпільованим
кодом.
https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html

