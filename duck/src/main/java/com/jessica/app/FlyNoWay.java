package com.jessica.app;

//implements means instead of extending and overriding, you define an implementation
//for this instance
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}