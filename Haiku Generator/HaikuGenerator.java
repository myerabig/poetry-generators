import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class HaikuGenerator
{
  public static void main(String [] args)
  {
    int again = 0;
    
    System.out.println("Welcome to the Poetry Generator!\n");
    
    do
    {
      again = Menu();
    }while(again == 1);
  }
  
  public static int Menu()
  {
    Scanner in = new Scanner(System.in);
    
    int again = 0;
    
    Haiku();
    
    System.out.println("\nWould you like to generate another poem?");
    System.out.println("Enter 0 for no and 1 for yes.");
    again = in.nextInt();
    
    return again;
  }
  
  public static String getConnectingWord()
  {
    Random ran = new Random();
    
    String connectingWords[] = new String[]{"the"};
    
    return connectingWords[ran.nextInt(connectingWords.length)];
  }
  
  public static String getOneSyllable(int type)
  {
    Random ran = new Random();
    String oneSyllable[];
    
    if(type == 1){
      oneSyllable = new String[]{"cat", "dog", "life", "love", "world", "you", "fish", "man", "king", "ice", "tree", "month", "death", "time", "bee", "air", "ant", "star", "mouth", "soul", "age", "duck", "foot", "dream", "rain", "cake", "fruit", "rat", "worm"};
    }
    else if(type == 2){
      oneSyllable = new String[]{"is", "does", "eats", "hits", "hates", "fears", "faces", "plants", "bans", "puts", "moves", "gifts", "frees", "knows", "cooks", "forms", "gains", "guards", "calls"};
    }
    else{
      oneSyllable = new String[]{"five", "green", "big", "small", "ill", "long", "mad", "bored", "wise", "huge", "quick", "red", "odd", "rich", "shy", "brave", "calm", "kind", "cold", "warm", "rough", "loud", "swift", "light", "weak"};
    }
    
    return oneSyllable[ran.nextInt(oneSyllable.length)];
  }
  
  public static String getTwoSyllables(int type)
  {
    Random ran = new Random();
    String twoSyllables[];
    
    if(type == 1){
      twoSyllables = new String[]{"kitty", "puppy", "actor", "artist", "blindness", "darkness", "mistake", "nonsense", "subway", "arrow", "apple", "cabbage", "elbow", "helmet", "lobster", "monster", "napkin", "office", "dragon", "forest", "motor", "photo", "thunder", "bagel", "climate", "cocoa", "decay", "flavor", "hero", "odor", "razor", "target"};
    }
    else if(type == 2){
      twoSyllables = new String[]{"forgets", "collects", "elects", "prevents", "survives", "explains", "maintains", "remains", "perfects", "donates", "changes", "bullies", "values", "balances", "measures", "promises", "repays", "completes", "channels", "copies", "limits", "presents", "regards"};
    }
    else{
      twoSyllables = new String[]{"foolish", "peaceful", "rainy", "common", "secret", "broken", "evil", "joyful", "simple", "better", "nuclear", "hungry", "solid", "thirsty", "awkward", "worthless", "heavy", "liquid", "fancy", "nervous", "honest", "eager", "pretend", "solo", "purple", "thoughtful", "lucky"};
    }
      
    return twoSyllables[ran.nextInt(twoSyllables.length)];
  }
  
  public static String getThreeSyllables(int type)
  {
    Random ran = new Random();
    String threeSyllables[];
    
    if(type == 1){
      threeSyllables = new String[]{"umbrella", "candlestick", "family", "banana", "happiness", "animal", "adventure", "energy", "history", "holiday", "memory", "media", "pollution", "radio", "melody", "mercury", "library", "oxygen", "mystery", "halloween", "skeleton", "computer", "gravity", "solution", "government", "anything", "accident", "beginning", "boulevard", "punishment", "hydrogen", "confusion"};
    }
    else if(type == 2){
      threeSyllables = new String[]{"celebrates", "remembers", "avenges", "exchanges", "understands", "recycles", "discovers", "compliments", "suffocates", "educates", "abandons", "encounters", "duplicates", "witnesses", "dominates", "continues", "empowers", "benefits", "aggravates", "terrifies", "compliments"};
    }
    else{
      threeSyllables = new String[]{"important", "dangerous", "musical", "innocent", "serious", "curious", "difficult", "radical", "excited", "generous", "powerful", "colorful", "infinite", "glorious", "edible", "ultimate", "attractive", "effortless", "aggressive", "athletic", "determined", "united", "qualified", "radical", "average"};
    }
    
    return threeSyllables[ran.nextInt(threeSyllables.length)];
  }
  
  public static void Haiku()
  {
    Random ran = new Random();
    Scanner in = new Scanner(System.in);
    
    String subject;
    
    System.out.print("Enter a SINGLE SYLLABLE word to use as the subject of your haiku: ");
    subject = in.nextLine();
    
    System.out.println("Here's your haiku: \n\n");
    System.out.println(fiveSyllables(subject));
    System.out.println(sevenSyllables());
    System.out.println(fiveSyllables(subject));
  }
  
  public static String fiveSyllables(String subject)
  {
    Random ran = new Random();
    
    int pattern = ran.nextInt(5) + 1;
    
    if(pattern == 1)
      return subject + " " + getOneSyllable(2) + " " + getConnectingWord() + " " + getOneSyllable(3) + " " + getOneSyllable(1);
    else if(pattern == 2)
      return subject + " " + getOneSyllable(2) + " " + getTwoSyllables(3) + " " + getOneSyllable(1);
    else if(pattern == 3)
      return getConnectingWord() + " " + getTwoSyllables(3) + " " + subject + " " + getOneSyllable(2);
    else if(pattern == 4)
      return subject + " " + getConnectingWord() + " " + getThreeSyllables(3);
    else
      return subject + " " + getTwoSyllables(2) + ", " + getTwoSyllables(3);
  }
  
  public static String sevenSyllables()
  {
    Random ran = new Random();
    
    int pattern = ran.nextInt(7) + 1;
    
    if(pattern == 1)
      return getConnectingWord() + " " + getOneSyllable(3) + " " + getOneSyllable(1) + " " + getThreeSyllables(2) + " " + getOneSyllable(1);
    else if(pattern == 2)
      return getOneSyllable(3) + " " + getTwoSyllables(1) + " " + getOneSyllable(2) + " " + getThreeSyllables(1);
    else if(pattern == 3)
      return getTwoSyllables(1) + " " + getOneSyllable(2) + " " + getConnectingWord() + " " + getTwoSyllables(3) + " " + getOneSyllable(1);
    else if(pattern == 4)
      return getThreeSyllables(1) + " " + getOneSyllable(2) + " " + getThreeSyllables(1);
    else
      return getThreeSyllables(3) + " " + getOneSyllable(1) + " " + getTwoSyllables(2) + " " + getOneSyllable(1);
  }
}
