package com.weixin.demo.entity;

public class ViewButton extends  AbstractButton {
    private String url;
    private  String type="view";

    public ViewButton(String url,String name) {
        super(name);
        this.url = url;
    }

    public ViewButton() {
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ViewButton{" +
                "url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
