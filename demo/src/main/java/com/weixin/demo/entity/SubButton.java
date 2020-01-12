package com.weixin.demo.entity;


import java.util.ArrayList;
import java.util.List;

//二级菜单集合,子菜单最多5个
public class SubButton extends AbstractButton {

    List<AbstractButton>  sub_button=new ArrayList<AbstractButton>();

    public SubButton(String name) {
        super(name);
    }

    public SubButton() {
    }

    public List<AbstractButton> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<AbstractButton> sub_button) {
        this.sub_button = sub_button;
    }
}
