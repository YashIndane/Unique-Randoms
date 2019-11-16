package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // CODE FOR GENERATING RANDOMLY UNIQUE NUMBERS FROM GIVEN RANGE!

        System.out.println("Enter the last number till which the range is:");
        Scanner scanner=new Scanner(System.in);
        int last_num=scanner.nextInt();
        scanner.close();


        int values[] = new int[last_num+1];
        List<Integer> list = new ArrayList<>();
        for (int y = 0; y <= last_num; y++) {
            list.add(y);
        }

        int m=last_num+1;

        for (int h = 0; h <= last_num; h++) {
            Random b = new Random();

            int v = b.nextInt(m);
            try {
                values[h] = list.get(v);

                list.remove(v);
                m--;
            } catch (Exception t) {
            }
        }

        for (int k:values){
            System.out.println(k);
        }
    }

}
