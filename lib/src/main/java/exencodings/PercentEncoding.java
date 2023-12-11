package exencodings;

import java.util.*;
import java.io.File;
import java.io.*;
import java.lang.StringBuilder;

/**
 * PercentEncoding is the class that hosts the conversion of the URI encoding
 * method in question, which is also known as "percent-encoding" or "URL encoding",
 * and sometimes (in my case) "URI encoding". The encoding exists in order to keep
 * certain characters from causing an error & being unable to represent the characters.
 * In a similiar way to how Base64 encodes text to be the right size for transmission
 * over servers, this encoding avoids any kind of issue with incompatibility with the
 * size of the blocks that represents the characters, as well as facilitating such
 * transactions of data.
***/
public class PercentEncoding {

/**
 * Unreserved Characters: Do not need to be encoded,
 * Reserved Characters: Do need to be encoded
***/

    // Class level class constructors
    StringBuilder sb = new StringBuilder();

    public String encodeString(String str) {

        Character car = new Character();
        char[] strArr = str.toCharArray();

        for (char c: strArr) {
            if(car.isReserved(c) == true) {

            }

        }
        return str;
    }
    public String decodeString (String str) {

        return str;
    }


}
