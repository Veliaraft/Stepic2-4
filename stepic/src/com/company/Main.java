package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    //Я изначально заключил часть комментариев в коде, и постарался написать код так,
    //чтобы вам было меньше мороки печатать вызовы функций.
    //Всё уже напечатано - вам остаётся только раскомментировать строки,
    //содержащие вызовы функций, и посмотреть результат работы.

    public static void main(String[] args) throws Exception {
        //2.4 - Задание 1: Вернуть кубы итераций для заданного диапазона.
        //int[] arr = CubesList(7); for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + "; ");

        //2.4 - Задание 2: Найти наиболее частовстречающееся слово.
        //wordCounter();

        //2.4 - Задание 3: Реализовать функцию ExceptionExample() генерирующую исключение Exception
        //ExceptionExample();

        //2.4 - Задание 4: Реализовать функцию checkClient(client : String) которая генерирует ситуативное исключение.
        //генерирует DogException в случае, если аргумент client содержит слово "dog"
        //генерирует CatException в случае, если аргумент client содержит слово "cat"
        //checkClient("Hello, mister Dog!");

        //2.4 - Задание 5: Создайте класс SphinxesException, который наследует класс Exception.
        //throw new SphinxesException("New class of exceptions created and overriding");

        /*2.4 - Задание 6: Реализовать функцию engineStatus(engineNumber:Int): String, которая делает безопасный
         (с точки зрения необработанных исключений) вызов функции rawEngineStatus(engineNumber:Int):String :
         1) если произошло исключение EngineNotFoundException, то вернуть строку "engine <number> not found";
         2) если произошло исключение SensorsMeltException, то вернуть строку "engine <number> offline";
         3) если не произошло исключение, то вернуть результат работы rawEngineStatus.
         где <number> - номер двигателя.
        Функцию rawEngineStatus и исключения разрабатывать не нужно!
        (((Реализовал, так же с бросанием своих исключений для возможности проверки.
        Рабочий код размещён в классе SpaceShuttle.)))*/
        //int engineNumber = 1;
        //System.out.println(new SpaceShuttle().engineStatus(engineNumber));
    }

    public static int[] CubesList(int iterator){
        int[] a = new int[iterator];
        for(int i = 0; i < iterator; i++){
            a[i] = i*i*i;
        }
        return a;
    }

    public static void wordCounter(){
        //Я прописал все инпуты степика. Подставьте/поменяйте цифру, либо внесите свой инпут.
        //Сюда весь метод толкать не стал - в купе с инпутами многабукав и страшна.
        calculateWordStat calcWord = new calculateWordStat();
        String input = "PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM";
        String input2 = "KTTKAP ZSAC RKSLNFE LYAB ZSAC ZSAC NQUZKL LYAB ZSAC KTTKAP ZSAC ZSAC KTTKAP RKSLNFE ZSAC ZSAC RKSLNFE LYAB ZSAC RKSLNFE KTTKAP LYAB RKSLNFE NQUZKL RKSLNFE LYAB RKSLNFE RKSLNFE LYAB RKSLNFE KTTKAP ZSAC RKSLNFE KTTKAP ZSAC LYAB LYAB LYAB RKSLNFE ZSAC";
        String input3 = "BAMMWC ZTSKPZ LLXMOU BAMMWC BAMMWC BAMMWC IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB LLXMOU GSLXNL BAMMWC GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB IFYXBAB GSLXNL IFYXBAB LLXMOU BAMMWC IFYXBAB ZTSKPZ BAMMWC BAMMWC BAMMWC IFYXBAB LLXMOU";
        System.out.println(calcWord.calculateWordStat(input));
    }

    public static void ExceptionExample() throws Exception {
        throw new Exception("Exception");
    }

    public static void checkClient(String client) throws Exception {
        client = client.replaceAll("\\.", "");
        client = client.replaceAll(",", "");
        client = client.replaceAll("!", "");
        List<String> words = Arrays.asList(client.split(" "));
        for (String word: words) {
            if (word.toLowerCase().equals("dog")){
                throw new Exception("DogException");
            }
            else if (word.toLowerCase().equals("cat")){
                throw new Exception("CatException");
            }
        }
    }
}
