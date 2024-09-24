
Методи mark() і reset() дозволяють запам’ятати
певну позицію та повернутися до неї пізніше.

public final Buffer mark()
Встановлює позначку цього буфера на його позицію.

public final Buffer reset()
Скидає позицію цього буфера до попередньо позначеної позиції.
Виклик цього методу не змінює і не відкидає значення позначки.

Коли вперше створюємо екземпляр ByteBuffer,
позначка не визначена.
Потім можемо викликати метод mark(), і позначка
встановлюється на поточну позицію.
Після деяких операцій виклик методу reset() змінить
позицію назад на позначку.

ByteBuffer buffer = ByteBuffer.allocate(10); // mark = -1, position = 0, limit = 10, capacity = 10;
buffer.position(2);                          // mark = -1, position = 2, limit = 10, capacity = 10;
buffer.mark();                               // mark = 2,  position = 2, limit = 10, capacity = 10;
buffer.position(5);                          // mark = 2,  position = 5, limit = 10, capacity = 10;
buffer.reset();                              // mark = 2,  position = 2, limit = 10, capacity = 10;


