package com.study.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyRequest_01 {
    /**
     * String url = "https://www.ebrainsoft.com/? id=kmc774 & favorite=001 & favorite=002 & favorite=003"
     *
     * parse(String url){url 쪼개기, Map parms 저장}
     *
     * class Request {}
     * */
    Map<String, ArrayList<String>> param = new HashMap<>(); //Map param = {id=kmc774, favorite=001}

    public MyRequest_01 parse(String url) {

        MyRequest_01 myRequest01 = new MyRequest_01();

        String[] splitUrl = url.split("\\?");
        String queryString = splitUrl[1];

        String[] queryArrays = queryString.split("&"); //[id=kmc774, favorite=001, favorite=002, favorite=003]

        for (String queryArray : queryArrays) { //1. id=kmc774 -> [id, kmc774] [favorite, 001] [favorite, 002] [favorite, 003]
            String[] keyValue = queryArray.split("=");

            String key = keyValue[0]; // key= "id, favorite, favorite, favorite,"
            String value = keyValue[1]; // value= "kmc774, 001, 002, 003"

            if (!param.containsKey(key)) {
                param.put(key, new ArrayList<>()); // key=[]
            }

            /**
             * 리스트에 값 추가
             */
            param.get(key).add(value);
        }

        return myRequest01;
    }

    /**
     * assertEquals( "kmc774",  reqest.getParam("id") );
     *          *     assertEquals( Array.class ,  reqest.getParams("favorite").class );
     *          *     assertEquals( 2 ,  reqest.getParams("favorite").size() );
     *          *     assertEquals( "001" ,  reqest.getParams("favorite")[0] );
     *          *     assertEquals( "002" ,  reqest.getParams("favorite")[1] );
     */

    String getParam(String key) {
        return null;
    }
}
