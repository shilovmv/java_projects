package cars;

import java.util.*;

public class Cars {
    public static void main(String [] args){

        Map<String, List<String>> result = new HashMap<>();
        List<String> brandList;
        List<String> carList = new ArrayList<>();
        String[] currentPair;

        carList.add("Тойота седан");
        carList.add("Лада седан");
        carList.add("Лада хэтчбек");
        carList.add("Мерседес седан");
        carList.add("Бмв кроссовер");
        carList.add("Форд хэтчбек");
        carList.add("Пежо кроссовер");

        for(String cur: carList)
        {
            currentPair = cur.split(" ");

            if (result.containsKey(currentPair[1]))
            {
                result.get(currentPair[1]).add(currentPair[0]);
                result.put(currentPair[1], result.get(currentPair[1]));
            }
            else
            {
                brandList = new ArrayList<>();
                brandList.add(currentPair[0]);
                result.put(currentPair[1], brandList);
            }
        }

        System.out.println(result);
    }
}
