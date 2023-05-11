package hw.lesson75;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1Copy {
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
        if (args.length == 0) {
            System.out.println("Нет переданных аргументов.");
            return;
        }

        System.out.println("Введённые слова:");
        for (String word : args) {
            System.out.print(word + " ");
        }
        System.out.println();

        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : args) {
            uniqueWords.add(word);
        }

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}