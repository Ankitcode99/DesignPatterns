package org.example.decoratorPattern.decorator;

import org.example.decoratorPattern.BasePizza;

public class Onion extends ToppingsDecorator{

    BasePizza basePizza;

    public Onion(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
