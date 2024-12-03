package ua.hillel.lessons.lesson25.demos._03_composite;

import java.util.ArrayList;
import java.util.List;

public class Messenger {

    LetterComposite messageFromUserA() {
        List<Word> words = List.of(
                new Word('I'),
                new Word('h', 'a', 'v', 'e'),
                new Word('a', 'n'),
                new Word('i', 'd', 'e', 'a')
        );
        return new Sentence(words);
    }

//    LetterComposite messageFromUserB() {
//        List<Word> words = List.of(
//                new Word('O', 'K', '.'),
//                new Word('L', 'e', 't', '\'', 's'),
//                new Word('d', 'o'),
//                new Word('i', 't')
//        );
//        return new Sentence(words);
//    }

    LetterComposite messageFromUserB() {
        Letter letter1 = new Letter('O');
        Letter letter2 = new Letter('K');
        Letter letter3 = new Letter('.');

        List<Letter> letters = new ArrayList<>();
        letters.add(letter1);
        letters.add(letter2);
        letters.add(letter3);
        List<Word> words = List.of(
                new Word(letters),
                new Word('L', 'e', 't', '\'', 's'),
                new Word('d', 'o'),
                new Word('i', 't')
        );
        return new Sentence(words);
    }
}
