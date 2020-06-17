package com.app.web.controller;

import java.util.StringTokenizer;

public class Greeter {

    public static String getTitle() {
        return "VyVS";
    }

    public static String getDate() {
        return java.time.LocalDate.now().toString();
    }

    public static int getSum(String input) {
        StringTokenizer st = new StringTokenizer(input, "+");
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        return sum;
    }
}