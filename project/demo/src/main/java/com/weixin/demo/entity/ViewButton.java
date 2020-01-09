package com.weixin.demo.entity;

public class ViewButton extends  AbstractButton {
    private String url;

    public ViewButton(String url) {
        this.type="view";
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
