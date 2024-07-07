package exencodings;

/**
 * TODO: *THIS*
***/

import java.lang.StringBuilder;

public class Character {

    // Character class fields & properties
    final private StringBuilder Alphabetic = new StringBuilder("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    final private StringBuilder Numeric = new StringBuilder("0123456789");
    final private StringBuilder Symbolic = new StringBuilder(":;'\"<,>.?/[]{}()\\|!@#$%^&*_-+=~`");
    final private StringBuilder FullSet = new StringBuilder(Alphabetic.append(Numeric).append(Symbolic));

    protected String[] charset = { "UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "US-ASCII", "ISO-8859-1" };

    public char getValue(String set, int i) {

        return set.toCharArray()[i];
    }

    public byte getByte(char c) {
        return (byte) c;
    }

}
