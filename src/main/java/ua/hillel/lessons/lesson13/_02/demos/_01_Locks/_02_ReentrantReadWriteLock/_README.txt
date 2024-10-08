
Interface ReadWriteLock забезпечує спосіб розрізняти блокування
читання та запису. Це дозволяє кільком потокам одночасно читати
спільний ресурс, забезпечуючи ексклюзивний доступ для запису.
Class ReentrantReadWriteLock є стандартною реалізацією цього
інтерфейсу, що підтримує семантику, подібну до Class ReentrantLock.
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html

Interface ReadWriteLock підтримує пару пов'язаних блокувань:
одне для операцій тільки для читання та одну для запису.
Блокування читання може утримуватись одночасно декількома потоками
читання, поки немає записуючих. Блокування запису є монопольним.

Interface ReadWriteLock забезпечує підвищений рівень паралелізму.
Він працює краще в порівнянні з іншими блокуваннями у додатках,
де операцій запису менше, ніж операцій читання.
