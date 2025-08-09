package org.learn;

import org.springframework.stereotype.Component;

@Component("jioBean")
public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Jio");
    }

    @Override
    public void data() {
        System.out.println("Data from Jio");
    }
}
