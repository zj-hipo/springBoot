package com.zj.springboot.json;

import com.alibaba.fastjson.JSONObject;

public class JSONObjectDemo {
    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("filed0","主键");
        jsonObject.put("filed1","小类ID");
        jsonObject.put("filed2","启用标识");
        jsonObject.put("filed3","属性类型");
        jsonObject.put("filed4","规则名称");
        jsonObject.put("filed5","创建人");
        jsonObject.put("filed6","维护标识");
        jsonObject.put("filed7","创建时间");
        int len=jsonObject.size();
        System.out.println(jsonObject);
        System.out.println(len);
    }
}
