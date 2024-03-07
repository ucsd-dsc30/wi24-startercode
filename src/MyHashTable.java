/*
 * Name: TODO
 * PID: TODO
 */

import java.util.LinkedList;

/**
 * TODO
 * 
 * @author TODO
 * @since TODO
 */

public class MyHashTable implements KeyedSet {

    /* instance variables */
    private int size; // number of elements stored
    private LinkedList<String>[] table; // data table

    public MyHashTable() {
        // TODO
    }

    @SuppressWarnings("unchecked")
    public MyHashTable(int capacity) {
        // TODO
    }

    public boolean insert(String value) {
        // TODO
        return false;
    }

    public boolean delete(String value) {
        // TODO
        return false;
    }

    public boolean lookup(String value) {
        // TODO
        return false;
    }

    public String[] returnAll() {
        // TODO
        return null;
    }

    public int size() {
        // TODO
        return -1;
    }

    public int capacity() {
        // TODO
        return -1;
    }

    public String getStatsLog() {
        // TODO
        return null;
    }

    /**
     * Utility function provided to help with debugging
     */
    public void printTable() {
        String s = "";
        for (int i = 0; i < table.length; i++) {
            s = s + i + ":";
            if (!table[i].isEmpty()) {
                for (String t : table[i])
                    s = s + " " + t + ",";
                // remove trailing comma
                s = s.substring(0, s.length() - 1);
            }
            s = s + "\n";
        }
        // remove trailing newline
        s = s.substring(0, s.length() - 1);
        System.out.println(s);
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        // TODO
    }

    private int hashString(String value) {
        // TODO
        return -1;
    }
}
