
public final Buffer clear()
Повертає поточну позицію на 0

Викликаючи метод clear() для об’єкта буфера, можемо виконати
дії за один раз:
- Повернути поточну позицію на 0.
- Встановити ліміт буфера на ємність (Ємність буфера
встановлюється під час створення).
- Встановити значення позначки на -1 (позначка матиме
невизначений стан).


public final Buffer flip()
Перевертає цей буфер.
Межа встановлюється на поточну позицію,
а потім позиція встановлюється на нуль.
Якщо позначка визначена, вона відкидається.


public final Buffer rewind()
Перемотує цей буфер.
Позиція встановлюється на нуль, а позначка скидається.
Метод rewind() використовується для повторного читання
даних. Коли викликаємо метод rewind() в екземплярі буфера,
він скидає поточну позицію на 0 і встановлює позначку в
невизначений стан (mark = -1).
