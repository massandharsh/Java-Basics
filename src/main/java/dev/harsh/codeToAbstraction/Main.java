package dev.harsh.codeToAbstraction;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(RbiInterface.MAX_RETRY);
        RbiInterface rbiInterface = new Icici();
        rbiInterface.doPay();
        System.out.println(ZonedDateTime.now());
    }
}
