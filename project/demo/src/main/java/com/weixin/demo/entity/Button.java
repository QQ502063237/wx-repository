package com.weixin.demo.entity;

import java.util.ArrayList;
import java.util.List;

//一级菜单集合,最多三个
public class Button  {
    List<AbstractButton> button=new ArrayList<AbstractButton>();

    public Button(List<AbstractButton> button) {
        this.button = button;
    }

    public Button() {
    }

    public List<AbstractButton> getButton() {
        return button;
    }

    public void setButton(List<AbstractButton> button) {
        this.button = button;
    }
}
