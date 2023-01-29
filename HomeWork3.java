package org.example;
import java.util.*;
public class HoneWork3 {
    public static void main(String[] args){
        // Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> List_of_strings = new ArrayList<>();

        List_of_strings.add("Hello");
        List_of_strings.add("World!");
        List_of_strings.add("Peace");
        List_of_strings.add("Things");

        System.out.println(List_of_strings);
        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ArrayList<String> List_of_colors = new ArrayList<>();

        List_of_colors.add("Black");
        List_of_colors.add("White");
        List_of_colors.add("Green");
        List_of_colors.add("Red");
        List_of_colors.add("Brown");

        for (int i = 0; i < List_of_colors.size(); i++) {
            System.out.printf(List_of_colors.get(i) + "! ");
        }
        // Вставить элемент в список в первой позиции
        List_of_colors.add(0, "Yellow");
        System.out.println(List_of_colors);

        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(List_of_colors.get(3));

        // Обновить определенный элемент списка по заданному индексу.
        List_of_colors.set(3, "Purple");
        System.out.println(List_of_colors);

        // Удалить третий элемент из списка.
        List_of_colors.remove(3);
        System.out.println(List_of_colors);

        // Поиска элемента в списке по строке.
        System.out.println(List_of_colors.indexOf("Black"));

        //Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> New_List = new ArrayList<>();

        New_List.add(List_of_strings.get(0));
        New_List.add(List_of_strings.get(3));
        New_List.add(List_of_strings.get(2));
        System.out.println(New_List);

        // Удалить из первого списка все элементы отсутствующие во втором списке.
        List_of_strings.removeAll(New_List);
        System.out.println(List_of_strings);

        //*Сортировка списка.
        Collections.sort(List_of_colors);
        System.out.println(List_of_colors);

        }

    }
