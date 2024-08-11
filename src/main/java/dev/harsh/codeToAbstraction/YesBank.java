package dev.harsh.codeToAbstraction;

import java.time.ZonedDateTime;

public class YesBank implements RbiInterface{
    @Override
    public void doPay() {
        System.out.println("Yes bank");
    }

    public ZonedDateTime getCurrentDate(){
        return ZonedDateTime.now();
    }
}
