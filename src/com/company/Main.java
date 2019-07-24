package com.company;

public class Main {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(new Helm("кожанный руль"),new Wheel(22.0,"German road"));
        Ferrari ferrari = new Ferrari(new Helm("металлический руль"),new Wheel(19.2,"Italian quality"));
    }
}
