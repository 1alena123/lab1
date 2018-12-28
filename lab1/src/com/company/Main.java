package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите предложение: ");
        String str = in.nextLine();

        char[] str1 = str.toCharArray();
        char[] glasn = {'A','a','Y','y','O','o','U','u','I','i','E','e'};

        boolean b = false;
        for(int i = 0; i < str1.length; i++) {
            for(int j = 0; j < glasn.length; j++) {
                if (str1[i] == glasn[j]) {
                    b = true; } }
            if(b) {
                str1[i] = '0'; }
            else {
                str1[i] = '1'; }
            b = false; }
        System.out.println("преобразовнная строка: ");
        System.out.println(str1);
    }}