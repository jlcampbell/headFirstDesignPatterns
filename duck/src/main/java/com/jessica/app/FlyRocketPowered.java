package com.jessica.app;

//implements means instead of extending and overriding, you define an implementation
//for this instance
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}