
Pure Fabrication (Чиста вигадка)
------------------------------------
Дозволяє вирішити проблему високої зв'язності модулів
системи, шляхом введення у програмне середовище додаткового
класу (що не відображає реальної сутності з предметної
області) та наділення його необхідними обов'язками.

Відповідно до цього патерну, ДЛЯ забезпечення low coupling
та high cohesion, можна синтезувати штучну сутність (об'єкт).
Наприклад, фасад до бази даних.

ПИТАННЯ: Який об'єкт наділити обов'язками, але принципи
"інформаційний експерт", "високе зачеплення" не виконуються
чи не підходять?

ВІДПОВІДЬ: Використовувати синтетичну сутність, яка
забезпечує високе зачеплення.

ПРИКЛАД:
Який клас має маніпулювати над об'єктом Product у базі даних?
Якщо дотримуватися принципу "інформаційний експерт", то
Product, але наділивши його такою відповідальністю ми
отримуємо слабке зачеплення усередині нього.
Тоді створюємо синтетичну сутність – ProductDaoImpl, яка
буде сильно зчеплена всередині і матиме єдину відповідальність
– маніпулювати над об'єктом Product у базі даних.
Оскільки ми вигадали цей об'єкт, а не спроектували з предметної
галузі, то він дотримується принципу "чиста вигадка".

ПРИМІТКА: У цьому прикладі демонструється імітація роботи з
БД через колекції, тому для id застосовується 0-based система,
але в СУБД - 1-based система.

