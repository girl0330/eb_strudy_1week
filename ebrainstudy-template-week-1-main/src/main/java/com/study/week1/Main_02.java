package com.study.week1;

import java.io.File;
import java.io.FileNotFoundException;

public class Main_02 {
    /**
     *  assertEquals( "POST",  myMultipartRequest.getMethod() );
     *     assertEquals( "localhost:8080",  myMultipartRequest.getHeader("Host") );
     *     assertEquals( "Apache-HttpClient/4.3.4 (java 1.5)",  myMultipartRequest.getHeader("User-Agent") );
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/STUDY/workspace/ebrainstudy-template-week-1-main/src/main/resources/request-dummy.txt";
        //ebrainstudy-template-week-1-main
        File multipartData = new File(path);

        MyMultipartRequest_02 myMultipartReq = new MyMultipartRequest_02();
        myMultipartReq.parse(multipartData);

    }
}
