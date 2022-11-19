package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Hello", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Example text", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("SplitInTwo", ((text) -> text.substring(0, text.length() / 2) + " " + text.substring(text.length() / 2, text.length())));
        poemBeautifier.beautify("   Strip of spaces   ", text -> text.replace(" ", ""));
    }
}