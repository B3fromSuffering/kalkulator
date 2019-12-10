package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class KodillaKalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaKalkulatorApplication.class, args);


        Kalkulator kalkulatorw = new Kalkulator();
        kalkulatorw.addition(10, 20);
        System.out.println(kalkulatorw.addition(10, 20));

        kalkulatorw.substraction(10, 5);
        System.out.println(kalkulatorw.substraction(10, 5));

    }
}
