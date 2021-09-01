package com.company;

public class Main {

    public static void main(String[] args) {
	//Homework 1:
    int a = 2, b = 4, c = 27;
    int result = a;
    if (b > result)
        result = b;
    if (c > result)
        result = c;
    System.out.println(result);
    //The program finds the greatest value amongst three separate int values

    //Homework 2:
    int x = 5, y = -7, result2 = 0, m = 0;

    if (y < 0) {
        y = -y;
        m = -1;
    }
    else
        m = 1;

    while (y > 0){
        if (y % 2 == 0) {
            x = x + x;
            y = y / 2;
        }
        else {
            result2 = result2 + x;
            y = y - 1;
        }
    }
    if (m < 0)
        result2 = -result2;
    System.out.println(result2);
    //The program multiplies the two given integers
    }
    //random change
}
