package com.study.week1;

public class Main_01 {
    public static void main(String[] args) {

        /**
         *   MyRequest_01 reqest = parse(queryString);
         *
         *     assertEquals( "kmc774",  reqest.getParam("id") );
         *     assertEquals( Array.class ,  reqest.getParams("favorite").class );
         *     assertEquals( 2 ,  reqest.getParams("favorite").size() );
         *     assertEquals( "001" ,  reqest.getParams("favorite")[0] );
         *     assertEquals( "002" ,  reqest.getParams("favorite")[1] );
         */

        String url = "https://www.ebrainsoft.com/?id=kmc774&favorite=001&favorite=002&favorite=003";

        MyRequest_01 myRequest01 = new MyRequest_01();
        myRequest01.parse(url);


    }
}
