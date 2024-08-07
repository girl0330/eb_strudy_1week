package com.study.week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyMultipartRequest_02 {
    // data를 파싱하는 함수
    String httpMethod;
    String httpPath;
    String httpVersion;

    Map<String, String> headers = new HashMap<>();
    public void parse(File file) throws FileNotFoundException {

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;

        try {
            fileLine = bufferedReader.readLine();

            if (fileLine != null) {

                /**
                 *  "" 공백을 기준으로 배열에 담음
                 */
                String[] reqLineArray = fileLine.split(" ");

                httpMethod = reqLineArray[0];   // [0]은 methode
                httpPath = reqLineArray[1];     // [1] type
                httpVersion = reqLineArray[2];  // [2] version
            }

            while (true) {
                fileLine = bufferedReader.readLine();
                if (fileLine == null) {
                    break;
                }

                if (fileLine.startsWith("--")) {
                    break;
                }

                String[] headerLineArr = fileLine.split(": |; |=");
                System.out.println("headerLineArr 확인 :::: " + Arrays.toString(headerLineArr));

                for (int i = 0; i < headerLineArr.length -1; i+=2) {

                    String key = headerLineArr[i].strip(); // 홀수 index가 key값이 됨
                    String value = headerLineArr[i+1].strip();

                    headers.put(key,value);
                }
                fileLine = bufferedReader.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
