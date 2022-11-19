package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String beautifiedText = poemDecorator.beautify(text);
        System.out.println(beautifiedText);
    }
}
