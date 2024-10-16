import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String stopWords_filePath = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\stopwords.txt";
        String baseball_filePath1 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\baseball.txt";
        String baseball_filePath2 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\baseball2.txt";
        String baseball_filePath3 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\baseball3.txt";
        String football_filePath1 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\football.txt";
        String football_filePath2 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\football2.txt";
        String football_filePath3 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\football3.txt";
        String basketball_filePath1 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\basketball.txt";
        String basketball_filePath2 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\basketball2.txt";
        String basketball_filePath3 = "C:\\Users\\mpack\\Documents\\Programming Workshop Lab\\Milestone 1\\basketball3.txt";
        Article stopWords = new Article(stopWords_filePath);
        Article baseball1 = new Article(baseball_filePath1);
        Article baseball2 = new Article(baseball_filePath2);
        Article baseball3 = new Article(baseball_filePath3);
        Article football1 = new Article(football_filePath1);
        Article football2 = new Article(football_filePath2);
        Article football3 = new Article(football_filePath3);
        Article basketball1 = new Article(basketball_filePath1);
        Article basketball2 = new Article(basketball_filePath2);
        Article basketball3 = new Article(basketball_filePath3);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an article topic (baseball, football, basketball): ");
            String topic = scanner.nextLine();

            if (topic.equals("baseball")) {
                System.out.println("The first baseball article has " + baseball1.getWordCount() + " words.");
                baseball1.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + baseball1.getWordCount() + " words.");
                System.out.println("The first baseball article has the following word frequencies:");
                baseball1.getWordFrequency();
                System.out.println();

                System.out.println("The second baseball article has " + baseball2.getWordCount() + " words.");
                baseball2.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + baseball2.getWordCount() + " words.");
                System.out.println("The second baseball article has the following word frequencies:");
                baseball2.getWordFrequency();
                System.out.println();

                System.out.println("The third baseball article has " + baseball3.getWordCount() + " words.");
                baseball3.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + baseball3.getWordCount() + " words.");
                System.out.println("The third baseball article has the following word frequencies:");
                baseball3.getWordFrequency();
                break;
            }

            else if (topic.equals("football")) {
                System.out.println("The first football article has " + football1.getWordCount() + " words.");
                football1.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + football1.getWordCount() + " words.");
                System.out.println("The first football article has the following word frequencies:");
                football1.getWordFrequency();
                System.out.println();

                System.out.println("The second football article has " + football2.getWordCount() + " words.");
                football2.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + football2.getWordCount() + " words.");
                System.out.println("The second football article has the following word frequencies:");
                football2.getWordFrequency();
                System.out.println();

                System.out.println("The third football article has " + football3.getWordCount() + " words.");
                football3.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + football3.getWordCount() + " words.");
                System.out.println("The third football article has the following word frequencies:");
                football3.getWordFrequency();
                break;
            }
            else if (topic.equals("basketball")) {
                System.out.println("The first basketball article has " + basketball1.getWordCount() + " words.");
                basketball1.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + basketball1.getWordCount() + " words.");
                System.out.println("The first basketball article has the following word frequencies:");
                basketball1.getWordFrequency();
                System.out.println();

                System.out.println("The second basketball article has " + basketball2.getWordCount() + " words.");
                basketball2.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + basketball2.getWordCount() + " words.");
                System.out.println("The second basketball article has the following word frequencies:");
                basketball2.getWordFrequency();
                System.out.println();

                System.out.println("The third basketball article has " + basketball3.getWordCount() + " words.");
                basketball3.removeWord(stopWords);
                System.out.println("After removing the stop words, the article has " + basketball3.getWordCount() + " words.");
                System.out.println("The third basketball article has the following word frequencies:");
                basketball3.getWordFrequency();
                break;
            }
            else {
                System.out.println("Invalid Input!");
            }

        }


    }
}

    class Article {

        private File file;
        private Scanner reader;
        private ArrayList<String> data;

        public Article(String filePath) throws IOException {
            this.file = new File(filePath);
            this.reader = new Scanner(this.file);
            this.data = new ArrayList<>();
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                line = line.replaceAll("[^a-zA-Z]", " ");
                line = line.toLowerCase();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        this.data.add(word);
                    }
                }
            }
            reader.close();
        }

        public ArrayList<String> getData() {
            return data;
        }

        public int getWordCount() {
            return this.data.size();
        }

        public ArrayList<String> removeWord(Article article) {

            for (int i = this.data.size() -1; i >= 0; i--) {
                if (article.getData().contains(this.data.get(i))) {
                    this.data.remove(i);
                }
            }
            return this.data;
        }

        public void getWordFrequency() {

            ArrayList<String> uniqueWord = new ArrayList<>();
            ArrayList<Integer> frequency = new ArrayList<>();
            ArrayList<String> result = new ArrayList<>();


            for (String word : data) {
                int index = uniqueWord.indexOf(word);
                if (index != -1) {
                    frequency.set(index, frequency.get(index) + 1);
                }
                else {
                    uniqueWord.add(word);
                    frequency.add(1);
                }
            }

            FrequencySort s1 = new FrequencySort(uniqueWord, frequency);
            s1.sort();
            }
        }


    class FrequencySort {

        private ArrayList<String> unique;
        private ArrayList<Integer> freq;

        public FrequencySort(ArrayList<String> uniqueWords, ArrayList<Integer> frequency) {
            this.unique = uniqueWords;
            this.freq = frequency;
        }

        public void sort() {
            for (int i = 0; i < freq.size() - 1; i++) {
                for (int j = 0; j < freq.size() - i-1; j++) {
                    if (freq.get(j) < freq.get(j + 1)) {
                        int tempFreq = freq.get(j);
                        freq.set(j, freq.get(j + 1));
                        freq.set(j + 1, tempFreq);

                        String tempWord = unique.get(j);
                        unique.set(j, unique.get(j + 1));
                        unique.set(j + 1, tempWord);
                    }
                }
            }

            for (int i = 0; i < freq.size(); i++) {
                System.out.println(unique.get(i) + ": " + freq.get(i));
            }

        }

    }


