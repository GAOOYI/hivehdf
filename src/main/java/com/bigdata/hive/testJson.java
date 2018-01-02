package com.bigdata.hive;

import com.alibaba.fastjson.JSON;

public class testJson {
    public static void main(String[] args) {
        bean b = new bean();
        b.setMovie("1193");
        b.setRate("5");
        b.setTimeStamp("978300760");
        b.setUid("1");
        String s = "{\"movie\":\"1193\",\"rate\":\"5\",\"timeStamp\":\"978300760\",\"uid\":\"1\"}";
        String jsonString = JSON.toJSONString(b);
        System.out.println(jsonString);

        System.out.println(evaluate(s));
    }
    public static String evaluate(String jsonLine){
        bean b = JSON.parseObject(jsonLine, bean.class);
        return b.toString();
    }
}
