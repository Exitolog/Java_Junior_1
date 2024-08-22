package ru.belyakov;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class MethodHw {

    private ArrayList<Integer> list;
    private AtomicInteger counter;
    private int[] sum;
    HomeWork homeWork;

    public MethodHw() {
        list = new ArrayList<>();
        counter = new AtomicInteger(0);
        homeWork = new HomeWork();
        sum = new int[]{0};
        addInList(list, homeWork.COUNT);
        findAverage(list,sum,counter);
        printResult();
    }


    private void addInList(ArrayList<Integer> list, int count){
        for(int i = 1; i < count; i++){
            list.add(i);
        }
    }

    private void findAverage(ArrayList<Integer> list, int[] array, AtomicInteger integer){
        list.forEach(digit ->{
            if(digit % 2 == 0) {
                counter.getAndIncrement();
                sum[0] = sum[0] + digit;
            }
        });
    }

    private void printResult(){
        System.out.println("Среднее арифметическое число в списке = " + sum[0]/counter.get());
        System.out.println("Сумма всех четных чисел в списке = " + sum[0]);
        System.out.println("Количество четных чисел в списке = " + counter.get());
    }

}
