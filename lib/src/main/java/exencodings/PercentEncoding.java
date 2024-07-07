package exencodings;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.io.File;
import java.io.*;
import java.lang.StringBuilder;

/**
 *
 *
***/
public class PercentEncoding {

    Character c = new Character();

    /**
     * Method
     * @param str string to be encoded
     * @param i character set list index
     *
    ***/
    public String encode(String str, int i) {
        try {
            return URLEncoder.encode(str, c.charset[i]);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public String decode(String str, int i) {
        try {
            return URLDecoder.decode(str, c.charset[i]);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
