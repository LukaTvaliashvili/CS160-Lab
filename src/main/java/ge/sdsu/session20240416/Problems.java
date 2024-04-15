package ge.sdsu.session20240416;

public class Problems {

    public static void main(String[] args) {

    }

    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
    set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

    topping({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    topping({}) → {"bread": "butter"}
    topping({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */

    /*
    Given a map of food keys and their topping values, modify and return the map as follows:
    if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value,
    change that value to "nuts".

    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
    topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */

    /*
    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
     set the other to have that same value in the map.

    mapAB({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
    mapAB({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
    mapAB({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
     */

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0.

    word(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    word(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
    word(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    and the value is that string's length.

    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */

    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
    with the value of all the strings starting with that character appended together in the order they appear in the array.

    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    firstChar([]) → {}
     */
}
