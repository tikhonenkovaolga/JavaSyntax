package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
       HashMap<String, Cat> map = new HashMap<>();
       for (int i = 0; i < cats.length; i++){
           map.put(cats[i], new Cat(cats[i]));
       }
       return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {

            this.name = name;
        }

        @Override
        public String toString() {

            return name != null ? name.toUpperCase() : null;
        }
    }
}

//1. Программа не должна считывать значения с клавиатуры.
//        2. В методе addCatsToMap() объяви переменную коллекции HashMap с типом элементов String, Cat и сразу проинициализируй ee.
//        3. Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats, согласно условию.
//        4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.