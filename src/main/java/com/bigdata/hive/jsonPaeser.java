package com.bigdata.hive;

import com.alibaba.fastjson.JSON;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class jsonPaeser extends UDF {

    public String evaluate(String jsonLine) throws IOException {
//        bean b = JSON.parseObject(jsonLine, bean.class);
        ObjectMapper objectMapper = new ObjectMapper();
        bean b = objectMapper.readValue(jsonLine, bean.class);
        return b.toString();
    }
}
