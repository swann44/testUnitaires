package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
    }

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("null");
        }
        String uniqueVowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                if (uniqueVowels.indexOf(letters[i]) >= 0) {
                }
                else {
                    uniqueVowels += letters[i];
                }

            }
        }


        return uniqueVowels;
    }
}
