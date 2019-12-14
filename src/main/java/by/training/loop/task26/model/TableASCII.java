package by.training.loop.task26.model;

public class TableASCII {

    public void showASCII(){

        char [] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 1; i < alphabet.length; i++) {

            System.out.println((int) alphabet [i] + " " + alphabet[i]);
        }
    }
}
