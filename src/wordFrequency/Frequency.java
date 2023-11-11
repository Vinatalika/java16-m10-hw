package wordFrequency;

class Frequency implements Comparable<Frequency> {
    private String word;
    private int frequency;

    public Frequency(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Frequency other) {
        return Integer.compare(other.frequency, this.frequency);
    }
}
