package com.weixin.demo.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//将请求流解析成 Map

public class RequestMessage {

    public static Map<String ,String> requestMap(HttpServletRequest request) throws IOException, DocumentException {
        Map<String,String> documentMap=new HashMap<String,String>();
        //获取请求流
        ServletInputStream is = request.getInputStream();
        // 创建SAXReader对象
        SAXReader reader = new SAXReader();
        //流转换为文档对象
        Document document = reader.read(is);
        //获取文档根节点数据
        Element root = document.getRootElement();
        //获取根节点下面所有的子节点
        List<Element> elements = root.elements();
        //遍历子节点,添加到hashMap
        for (Element e:elements){
            documentMap.put(e.getName(),e.getStringValue());
        }
        return documentMap;
    }
}
