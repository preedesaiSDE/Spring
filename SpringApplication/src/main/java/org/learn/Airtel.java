package org.learn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtelBean")
@Primary
public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Airtel");
    }

    @Override
    public void data() {
        System.out.println("Data from Airtel");
    }
}
