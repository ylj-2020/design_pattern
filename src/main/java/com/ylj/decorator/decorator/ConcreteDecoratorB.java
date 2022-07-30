package com.ylj.decorator.decorator;

import com.ylj.decorator.AbstractDecorator;
import com.ylj.decorator.IComponent;

/**
 * @author : ylj
 * create at:  2022/7/30
 */
public class ConcreteDecoratorB extends AbstractDecorator {

    public ConcreteDecoratorB(IComponent component) {
        super(component);
    }

    @Override
    protected void doQuery() {
        System.out.println("[B 包装] 具体的包装功能 balabala...");
    }
}