package com.weixin.demo.entity;

public  abstract class AbstractButton {
    public  String name;

    public AbstractButton( String name) {
        this.name = name;
    }

    public AbstractButton() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractButton{" +

                ", name='" + name + '\'' +
                '}';
    }
}
