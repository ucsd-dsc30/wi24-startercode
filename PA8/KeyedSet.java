/**
 * Keyed Set.
 */
public interface KeyedSet {
    /**
     * Insert the string value into the set.
     *
     * @param value value to insert
     * @throws NullPointerException if value is null
     * @return true if the value was inserted, false if the value was already
     *         present
     */
    boolean insert(String value);


    /**
     * Check if the given value is present in the set.
     *
     * @param value value to look up
     * @throws NullPointerException if value is null
     * @return true if the value was found, false if the value was not found
     */
    boolean lookup(String value);

}