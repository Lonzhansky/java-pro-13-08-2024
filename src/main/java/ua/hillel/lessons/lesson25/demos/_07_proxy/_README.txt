
Заступник (Proxy)
---------------------
Дозволяє підставляти замість реальних об'єктів
спеціальні об'єкти-замінники.
Ці об'єкти перехоплюють виклики до оригінального
об'єкту, дозволяючи зробити щось до або після передачі
оригіналу.

У шаблоні Proxy, клас представляє функціональність
іншого класу.

У шаблоні Proxy, ми створюємо об'єкт, що має вихідний
об'єкт, щоб пов'язати його функціональність із зовнішнім
світом.

Шаблон Proxy дозволяє надавати інтерфейс (клас, який діє
як інтерфейс) іншим об’єктам, створюючи клас-обгортку
як проксі. Клас-обгортка, який є проксі, може додати
додаткову функціональність певному об'єкту без зміни
коду цього об'єкта.

Шаблон Proxy, також відомий як Сурогат (Surrogate).
Надає сурогат або заповнювач для іншого об’єкта, щоб
контролювати доступ до нього.


Як правило, шаблон Proxy ВИКОРИСТОВУЄТЬСЯ для:
 - Контролю доступу до іншого об'єкта.
 - Лінивої ініціалізації.
 - Впровадження журналювання (логування).
 - Полегшення підключення до мережі.
 - Підрахунку посилань на об’єкт.


Демо
------
Човен вмішує 3-и особи. Контролюємо доступність до човна,
виходячі з дозволеної кількості осіб.
Проксі BoatRealProxy контролює доступ до фактичного
об’єкта (BoatReal).

