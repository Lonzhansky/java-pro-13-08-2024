
Метод interrupt() дозволяє перервати сплячий або чекаючий потік.

Переривання - вказівка потоку, що він повинен припинити те,
що він робить, і зайнятися чимось іншим.

Розробник повинен вирішити, як саме потік відреагує на
переривання, але часто потік завершується.

Щоразу, коли викликаємо метод interrupt(), можемо не відразу
побачити ефект, якщо цільовий потік знаходиться в сплячому або
очікуваному стані, він буде негайно перерваний.

Якщо цільовий потік не перебуває у стані сну чи очікування,
то виклик переривання буде очікувати, поки цільовий потік не увійде
стан сну або очікування. Як тільки цільовий потік перейде
у стан сну чи очікування, він набуде чинності негайно.

За час свого існування, якщо цільовий потік ніколи не переходив у
сплячий стан або стан очікування, виклик переривання не впливає
на нього, просто виклик переривання буде витрачений марно.
