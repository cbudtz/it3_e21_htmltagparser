package com.company;

import java.util.Scanner;

public class Main {
    private static int[][] states = {
            //<,  , h, /, >, *
            { 1, 9, 9, 9, 9, 9},								// 0
            { 9, 1, 2, 3, 9, 9},								// 1
            { 9, 4, 2, 9, 8, 9},								// 2
            { 9, 3, 5, 9, 9, 9},								// 3
            { 9, 4, 9, 6, 8, 9},								// 4
            { 9, 7, 5, 9, 8, 9},								// 5
            { 9, 6, 9, 9, 8, 9},								// 6
            { 9, 7, 9, 9, 8, 9}									// 7
    };
    private static int currentState = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tag = scan.nextLine();
        for (int i = 0; i < tag.length(); i++) {
            System.out.println("currentState: " + currentState);
            System.out.println("read: " + tag.charAt(i));
            int col = getColumn(tag.charAt(i));
            currentState = states[currentState][col];
            if (currentState == 9) {
                System.out.println("Illegal input");
                break;
            }
            if (currentState==8){
                System.out.println("finished reading input - Input OK");
                break;
            }
        }


    }

    private static int getColumn(char c) {
        if (c == '<') return 0;
        if (c == ' ') return 1;
        if (c >= 'a' && c<='z') return 2;
        if (c == '/') return 3;
        if (c == '>') return 4;
        return 5;
    }
}
