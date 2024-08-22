package ru.belyakov;

import java.util.ArrayList;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class HomeWork {

    private static int COUNT = 106; //количество чисел от 1 до COUNT

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < COUNT; i++){
            list.add(i);
        }

        AtomicInteger counter = new AtomicInteger(0);
        int[] sum = {0};
        list.forEach(digit ->{
            if(digit % 2 == 0) {
                counter.getAndIncrement();
                sum[0] = sum[0] + digit;
            }
        });

        System.out.println("Среднее арифметическое число в списке = " + sum[0]/counter.get());
        System.out.println("Сумма всех четных чисел в списке = " + sum[0]);
        System.out.println("Количество четных чисел в списке = " + counter.get());

    }
}
