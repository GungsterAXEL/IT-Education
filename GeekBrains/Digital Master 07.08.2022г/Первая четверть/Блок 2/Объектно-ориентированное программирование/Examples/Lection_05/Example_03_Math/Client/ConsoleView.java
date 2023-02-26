package Lection_05.Example_03_Math.Client;

import java.util.Scanner;

import Lection_05.Example_03_Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
