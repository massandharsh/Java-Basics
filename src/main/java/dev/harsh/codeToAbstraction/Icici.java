package dev.harsh.codeToAbstraction;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

public class Icici implements RbiInterface{
    @Override
    public void doPay() {
        System.out.println("Do Pay icici");
    }
    public ZonedDateTime getDate(){
        return ZonedDateTime.now();
    }
}
