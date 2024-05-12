package JapaneseWord;



public class JpWordBuilder {
   private String surface;
   private String partofspeech;
   private String baseform;
   private String reading;
   private Integer frecuency;
   private JpWordBuilder(){}
   public static JpWordBuilder builder(){
      return new JpWordBuilder();
   }
   public JpWordBuilder withSurface(String surface){
      this.surface = surface;
      return this;
   }
   public JpWordBuilder withPartOfSpeech(String partOfSpeech){
      this.partofspeech = partOfSpeech;
      return this;
   }
   public JpWordBuilder withBaseForm(String baseform){
      this.baseform = baseform;
      return this;
   }
   public JpWordBuilder withReading(String reading){
      this.reading = reading;
      return this;
   }
   public JpWordBuilder withFrecuency(Integer frecuency){
      this.frecuency = frecuency;
      return this;
   }

   public JpWord build(){
      return new JpWord(
              surface,
              partofspeech,
              baseform,
              reading,
              frecuency
      );
   }

}
