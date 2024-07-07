/*
 * Interface for UTF8 Chars.
 * Implementations found in the Base(n) classes.
 * UTF8 is the standard character encoding for most
 * systems, this includes "ASCII" which is the first
 * few bytes of the UTF8 format. This format, made
 * clear by the name, operates with binary values
 * not exceeding the first 8 bytes. This allows for
 * all the most necessary characters to be included,
 * but leaves out multi-character encodings.
 */
package exencodings;


public interface UTF8 {

}
