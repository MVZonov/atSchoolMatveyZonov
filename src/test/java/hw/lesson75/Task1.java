package hw.lesson75;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*Напишите программу, которая через аргументы командной строки получает "слова" (каждый аргумент - отдельное слово),
    печатает полученную последовательность слов, а потом выводит только уникальные слова из переданной последовательности.
Сохранять порядок символов в итоговом выводе необязательно.

Если в программу не переданы аргументы, то она завершается.
Пример:
1)
Ввод: a aa abc a ab aa
Вывод:
a aa abc a ab aa
a aa ab abc

2)
Ввод:
Вывод:*/
    public static void main(String[] args) {
        List<String> uniqueWords = new ArrayList<>();

        if (args.length == 0) {
            System.out.println("Нет переданных аргументов.");
            return;
        }

        System.out.println("Ввод:");
        for (String value : args) {
            System.out.print(value + " ");
            if (!uniqueWords.contains(value)) {
                uniqueWords.add(value);
            }
        }
        System.out.println();
        for (String value : uniqueWords) {
            System.out.print(value + " ");
        }
    }
}