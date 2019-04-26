package com.jessica.app;

public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println( "All ducks float" );
    }
    public void performFly(){
        flyBehavior.fly();
    }
    //details left up to each class of duck
    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}