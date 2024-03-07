/*
 * Name: TODO
 * PID: TODO
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * TODO
 *
 * @author TODO
 * @since TODO
 */

public class SpellChecker {

    public KeyedSet dictWords;

    public void readDictionary(Reader reader, boolean useHashTable) {
        // TODO
    }

    private LinkedList<String> checkWrongLetter(String word) {
        // TODO
        return null;
    }

    private LinkedList<String> checkInsertedLetter(String word) {
        // TODO
        return null;
    }

    private LinkedList<String> checkDeleted(String word) {
        // TODO
        return null;
    }

    private LinkedList<String> checkTransposedLetter(String word) {
        // TODO
        return null;
    }

    private LinkedList<String> checkInsertSpace(String word) {
        // TODO
        return null;
    }

    private String[] checkWord(String word) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        // args[0]: 0 if we should use a MyHashTable and 1 for a MyBloomFilter
        // args[1]: path to dict file
        // args[2]: path to input file

        SpellChecker checker = new SpellChecker();

        File dictionary = new File(args[1]);
        try {
            Reader reader = new FileReader(dictionary);

            //TODO - call readDictionary with the given reader on the correct data structure.


        } catch (FileNotFoundException e) {
            System.err.println("Failed to open " + dictionary);
            System.exit(1);
        }

        File inputFile = new File(args[2]);
        try {
            Scanner input = new Scanner(inputFile); // Reads list of words

            //TODO - go through each word from Scanner

        } catch (FileNotFoundException e) {
            System.err.println("Failed to open " + inputFile);
            System.exit(1);
        }
    }
}
