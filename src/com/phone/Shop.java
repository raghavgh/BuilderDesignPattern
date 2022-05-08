package com.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setRam(2).setOs("Android").getPhone();

        System.out.println(p);
    }
}
