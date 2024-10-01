package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._01;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    // Дані для обробки надаються в такій структурі даних
    // як Map (структура даних у вигляді ключ-зачення)
    public Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        map.put("abc1", "orange");
        map.put("abc2", "kiwi");
        map.put("abc3", "mango");
        map.put("abc4", "apple");
        return map;
    }
}
