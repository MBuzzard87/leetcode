package com.michaelbuzzard.leetcode;

import java.io.*;

public class Wrapper {

    //Print a statement only allowing a max of 70 columns/characters per row similar to a spreadsheet
    //If a word will be cut off then print that word on the next line instead



    public static void main(String[] args) throws Exception {
        File file = new File("src/ipsum.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null) {
            sb.append(str);
        }

        wrap(sb.toString(), 100);
    }


    public static void wrap(String sentence, int num) {

        String[] splitString = sentence.split(" ");
        StringBuilder curStr = new StringBuilder();

        for (int i = 0; i < splitString.length; i++){
            String tempStr = splitString[i];

            if(tempStr.length() + curStr.length() + 1 <= num) {
                tempStr = tempStr + " ";
                curStr.append(tempStr);
                System.out.print(tempStr);

            } else {
                System.out.print("\n" + tempStr + " ");
                curStr = new StringBuilder(tempStr + " ");
            }
        }
    }
}

//string w/ linebreaks