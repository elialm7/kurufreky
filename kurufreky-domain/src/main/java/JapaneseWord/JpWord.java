package JapaneseWord;

import java.util.Objects;

public class JpWord {

    private String surface;
    private String partofspeech;
    private String baseform;
    private String reading;
    private Integer frecuency;


    public JpWord(String surface, String partofspeech, String baseform, String reading, Integer frecuency) {
        this.surface = surface;
        this.partofspeech = partofspeech;
        this.baseform = baseform;
        this.reading = reading;

        this.frecuency = frecuency;
    }


    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getPartofspeech() {
        return partofspeech;
    }

    public void setPartofspeech(String partofspeech) {
        this.partofspeech = partofspeech;
    }

    public String getBaseform() {
        return baseform;
    }

    public void setBaseform(String baseform) {
        this.baseform = baseform;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }


    public Integer getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(Integer frecuency) {
        this.frecuency = frecuency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JpWord jpWord = (JpWord) o;
        return Objects.equals(surface, jpWord.surface) && Objects.equals(partofspeech, jpWord.partofspeech)
                && Objects.equals(baseform, jpWord.baseform) && Objects.equals(reading, jpWord.reading)
               && Objects.equals(frecuency, jpWord.frecuency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface, partofspeech, baseform, reading, frecuency);
    }

    @Override
    public String toString() {
        return "JpWord{" +
                "surface='" + surface + '\'' +
                ", partofspeech='" + partofspeech + '\'' +
                ", baseform='" + baseform + '\'' +
                ", reading='" + reading + '\'' +

                ", frecuency=" + frecuency +
                '}';
    }
}
