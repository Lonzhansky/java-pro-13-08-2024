
Обробка перегонів даних за допомогою статичної
синхронізації.
-------------------------------------------------
Використовуючи статичну синхронізацію, надаємо
блокування класу.

Клас вибиратиме по 1 об'єкту за раз.
Об'єкт, своєю чергою, вибере 1 потік і пропустить
його через чутливу ділянку.

Застосовуючи статичну синхронізацію, ми підготували
систему для запобігання некоректному бронюванню
квитків.
