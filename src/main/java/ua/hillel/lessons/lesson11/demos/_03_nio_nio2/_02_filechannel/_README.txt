
Class FileChannel
https://docs.oracle.com/javase/8/docs/api/java/nio/channels/FileChannel.html

Канал для читання, запису, зіставлення та
керування файлом.

FileChannel НЕ може бути встановлений у неблокуючий режим.
Він завжди працює в режимі БЛОКУВАННЯ.

Щоб використовувати FileChannel, його потрібно відкрити.
Не можна відкрити FileChannel безпосередньо.
Необхідно отримати FileChannel через InputStream,
OutputStream або RandomAccessFile.

