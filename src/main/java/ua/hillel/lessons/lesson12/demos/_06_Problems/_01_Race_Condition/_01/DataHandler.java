package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._01;

import java.util.ConcurrentModificationException;
import java.util.Map;

// Критична секція «перевір, потім дій» може спричинити стан перегонів.
//
// Якщо два або більше потоків викликають метод DataHandler.checkThenAct
// для одного і того ж об'єкта DataHandler, то  два або більше потоків
// можуть одночасно виконати оператор if, оцінити map.containsKey("abc1")
// як true і, таким чином, перейти до блоку коду тіла оператора if.
//
// Кілька потоків можуть потім спробувати видалити пару ключ-значення,
// що зберігається для ключа "abc1", але тільки один з них зможе це зробити.
// Інші повернуть null значення, оскільки інший потік вже видалив пару
// ключ-значення.
//
// Метод DataHandler.checkThenAct може викинути ConcurrentModificationException.
// Цей виняток може бути створено методами, які виявили одночасну модифікацію
// об’єкта, коли така модифікація неприпустима.
// Тут може бути одночасна модифікація Map кількома потоками.
public class DataHandler {

    public String checkThenAct(Map<String, String> map)
            throws ConcurrentModificationException {
        if (map.containsKey("abc1")) {
            String val = map.remove("abc1");
            if (val == null) {
                return "Value for 'abc1' was null";
            }
        } else {
            map.put("abc1", "apricot");
        }
        return "Data: " + map;
    }
}

