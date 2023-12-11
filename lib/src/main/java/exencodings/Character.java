/**
 * CLASS SUMMARY
 * ------------------------------------------------------------------------------------------------
 * This class "Character" pretty much exists at this moment for hosting reserved characters,
 * which are necessary specifically for percent-encoding.
 * Therefore, it isn't exactly helpful or relevant to the other encodings.
 * ------------------------------------------------------------------------------------------------
 * But, if need be, I will have it extend the UTF-8 interface, and we will
 * see about extending the properties to cover base64 as well.
 * ------------------------------------------------------------------------------------------------
 * In the case of needing this to cover multiple reserved characters for
 * encodings, while maintaining certain properties as a character consumable
 * by the application across the board, it can be arranged that the interface
 * instead defines traits that are *separately* implemented by the character class.
 * ------------------------------------------------------------------------------------------------
 * So instead of having one class Character, which contains reserved characters pertaining
 * only to the percent-encoding, there will be a separate interpretation of "reserved characters"
 * for each encoding, whatever "reserved" may mean in the context at hand.
 * ------------------------------------------------------------------------------------------------
***/

package exencodings;

public class Character {

    // Constructors for class fields and imports
    final private char[] Reserved = { ':', '/', '?', '#', '[', ']', '@', '!', '\'', '(', ')', '*', '+', ',', ';', '=', ' ' };
    final private int len = this.Reserved.length;

    public boolean isReserved(char c) {

        if(this.Reserved[len] == c)
        {
            return true;
        }
        else return false;
    }

    public String getValue(int i) {
        switch (Reserved[i]) {
            case 0: return "%20";
            case 1: return
            case 2: return
            case 3: return
            case 4: return
            case 5: return
            case 6: return
            case 7: return
            case 8: return
            case 9: return
            case 10: return
            case 11: return
            case 12: return
            case 13: return
            case 14: return
            case 15: return
        }

    }
    public byte getByte(char c) {
        return (byte) c;
    }

}
