package wordFrequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        String fileName = "words.txt";

        try {
            List<Frequency> wordFrequencies = countWordFrequency(fileName);

            Collections.sort(wordFrequencies);

            for (Frequency wf : wordFrequencies) {
                System.out.println(wf.getWord() + " " + wf.getFrequency());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Frequency> countWordFrequency(String fileName) throws IOException {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.trim();
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        List<Frequency> wordFrequencies = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            wordFrequencies.add(new Frequency(entry.getKey(), entry.getValue()));
        }

        return wordFrequencies;
    }
}

