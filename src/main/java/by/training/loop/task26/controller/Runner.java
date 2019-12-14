package by.training.loop.task26.controller;

//Вывести на экран соответствий между символами и их численными
// обозначениями в памяти компьютера (Таблицу ASCII).

import by.training.loop.task26.model.TableASCII;

public class Runner {

    public static void main(String[] args) {

      new TableASCII().showASCII();
    }
}
