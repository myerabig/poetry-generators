import java.util.Scanner;
import java.util.Random;

public class Hackathon2018
{
  public static void main(String [] args)
  {
    String response;
    int again = 1;
    
    Scanner in = new Scanner(System.in);
    Random ran = new Random();
    
    System.out.println("Hi, my name is Burty.");
    
    response = prompt();
    do
    {
      again = options(response);
    }while(again == 1);
    
    //if(response.compareTo("hello") == 0)
      //System.out.println("Yes, hello!");
  }
  
  public static String prompt()
  {
    Scanner in = new Scanner(System.in);
    Random ran = new Random();
    
    int rand = ran.nextInt(4) + 1;
    
    if(rand == 1)
    {
      System.out.print("What can I help you with? ");
      String response = in.nextLine();
      return response;
    }
    else if(rand == 2)
    {
      System.out.print("What can I do for you? ");
      String response = in.nextLine();
      return response;
    }
    else if(rand == 3)
    {
      System.out.print("What's up? ");
      String response = in.nextLine();
      return response;
    }
    else if(rand == 4)
    {
      System.out.print("How may I assist you? ");
      String response = in.nextLine();
      return response;
    }
    else
      return "Bye!";
  }
  
  public static int options(String response)
  {
    int again = 1;
    
    do
    {
    if(response.compareTo("joke") == 0)
      response = tellJoke();
    else if(response.compareTo("shrek") == 0)
      response = allStar();
    else if(response.compareTo("insult me") == 0)
      response = ferwerda();
    else if(response.compareTo("slogan") == 0)
      response = pratt();
    //else if(response.compareTo("haiku") == 0)
      //response = genPoem();
    else if(response.compareTo("how are you") == 0)
      response = howRU();
    else if(response.compareTo("i'm sad") == 0)
      response = iAmSad();
    /*else if(response.compareTo("what?") == 0)
      response = genRand();
    else if(response.compareTo("midsummer") == 0)
      response = willyShakes();
    else if(response.compareTo("chicken nuggets") == 0)
      response = vine();
      */
    else if(response.compareTo("list") == 0)
      response = list();
    else if(response.compareTo("bye") == 0)
    {
      adios();
      return 0;
    }
    else
      response = noComprendo();
    }while(again == 1);
    return 1;
  }
  
  public static String tellJoke()
  {
    Random ran = new Random();
    int rand = ran.nextInt(3) + 1;
    
    if(rand == 1)
    {
      System.out.println("A guy walks into a bar and sees three slabs of meat hanging from the ceiling." + "\n" +
                       "He asks the bartender, \"What's with the slabs of meat?\" The bartender replies, \"If you can jump" + "\n" +
                       "up and hit one of the slabs of meat, you get free drinks for the next hour. If you miss, you have" + "\n" +
                       "to pay for everyone else's drinks for the next hour.\" The man thought carefully, then said:" + "\n" +
                       "\"No, I don't think I'll try. The steaks are too high.\"");
      String response = prompt();
      return response;
    }
    else if(rand == 2)
    {
      System.out.println("What's the best thing about Switzerland?" + "\n" +
                         "I don't know, but the flag is a big plus!");
      String response = prompt();
      return response;
    }
    else if(rand == 3)
    {
      System.out.println("Helvetica and Times New Roman walk into a bar." + "\n" +
                         "\"Get out of here!\" shouts the bartender. \"We don't serve your type.\"");
      String response = prompt();
      return response;
    }
    else
      return "Bye!";
  }
  
  public static String allStar()
  {
    System.out.println("Somebody once told me the world is gonna roll me" + "\n" +
                       "I ain't the sharpest tool in the shed" + "\n" +
                       "She was looking kind of dumb with her finger and her thumb" + "\n" +
                       "In the shape of an \"L\" on her forehead" + "\n" +
                       "Well the years start coming and they don't stop coming" + "\n" +
                       "Fed to the rules and I hit the ground running" + "\n" +
                       "Didn't make sense not to live for fun" + "\n" +
                       "Your brain gets smart but your head gets dumb" + "\n" +
                       "So much to do, so much to see" + "\n" +
                       "So what's wrong with taking the back streets?" + "\n" +
                       "You'll never know if you don't go" + "\n" +
                       "You'll never shine if you don't glow" + "\n" +
                       "Hey now, you're an all-star, get your game on, go play" + "\n" +
                       "Hey now, you're a rock star, get the show on, get paid" + "\n" +
                       "And all that glitters is gold" + "\n" +
                       "Only shooting stars break the mold" + "\n" +
                       "It's a cool place and they say it gets colder" + "\n" +
                       "You're bundled up now, wait till you get older" + "\n" +
                       "But the meteor men beg to differ" + "\n" +
                       "Judging by the hole in the satellite picture" + "\n" +
                       "The ice we skate is getting pretty thin" + "\n" +
                       "The water's getting warm so you might as well swim" + "\n" +
                       "My world's on fire, how about yours?" + "\n" +
                       "That's the way I like it and I never get bored" + "\n" +
                       "Hey now, you're an all-star, get your game on, go play" + "\n" +
                       "Hey now, you're a rock star, get the show on, get paid" + "\n" +
                       "All that glitters is gold" + "\n" +
                       "Only shooting stars break the mold" + "\n" +
                       "Hey now, you're an all-star, get your game on, go play" + "\n" +
                       "Hey now, you're a rock star, get the show, on get paid" + "\n" +
                       "And all that glitters is gold" + "\n" +
                       "Only shooting stars" + "\n" +
                       "Somebody once asked could I spare some change for gas?" + "\n" +
                       "I need to get myself away from this place" + "\n" +
                       "I said yep what a concept" + "\n" +
                       "I could use a little fuel myself" + "\n" +
                       "And we could all use a little change" + "\n" +
                       "Well, the years start coming and they don't stop coming" + "\n" +
                       "Fed to the rules and I hit the ground running" + "\n" +
                       "Didn't make sense not to live for fun" + "\n" +
                       "Your brain gets smart but your head gets dumb" + "\n" +
                       "So much to do, so much to see" + "\n" +
                       "So what's wrong with taking the back streets?" + "\n" +
                       "You'll never know if you don't go (go!)" + "\n" +
                       "You'll never shine if you don't glow" + "\n" +
                       "Hey now, you're an all-star, get your game on, go play" + "\n" +
                       "Hey now, you're a rock star, get the show on, get paid" + "\n" +
                       "And all that glitters is gold" + "\n" +
                       "Only shooting stars break the mold" + "\n" +
                       "And all that glitters is gold" + "\n" +
                       "Only shooting stars break the mold");
    String response = prompt();
    return response;
  }
  
  public static String ferwerda()
  {
    Random ran = new Random();
    int rand = ran.nextInt(3) + 1;
    
    if(rand == 1)
    {
      System.out.println("Mirrors can't talk. Lucky for you, they can't laugh either.");
      String response = prompt();
      return response;
    }
    else if(rand == 2)
    {
      System.out.println("Some day you'll go far... and I hope you stay there.");
      String response = prompt();
      return response;
    }
    else if(rand == 3)
    {
      System.out.println("When I see your face, there's not a thing that I would change..." + "\n" +
                         "except the direction that I'm walking in.");
      String response = prompt();
      return response;
    }
    else
      return "bye";
  }
  
  public static String pratt()
  {
    Random ran = new Random();
    int rand = ran.nextInt(3) + 1;
    
    if(rand == 1)
    {
      System.out.println("Like a good neighbor, State Farm is there!");
      String response = prompt();
      return response;
    }
    else if(rand == 2)
    {
      System.out.println("Maybe she's born with it. Maybe it's Maybelline.");
      String response = prompt();
      return response;
    }
    else if(rand == 3)
    {
      System.out.println("I'm Lovin' It! Ba da ba ba ba!");
      String response = prompt();
      return response;
    }
    else
      return "bye";
  }
  
  public static String howRU()
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("I'm quite well, how are you?");
    in.nextLine();
    String response = prompt();
    return response;
  }
  
  public static String iAmSad()
  {
    System.out.println("I'm sorry to hear that! Let me tell you a joke!");
    String response = tellJoke();
    return response;
  }
  
  public static void adios()
  {
    System.out.println("Goodbye!");
  }
  
  public static String noComprendo()
  {
    System.out.println("I'm sorry, I don't understand. Try again?");
    String response = prompt();
    return response;
  }
  
  public static String list()
  {
    System.out.println("joke" + "\n" +
                       "shrek" + "\n" +
                       "insult me" + "\n" +
                       "slogan" + "\n" +
                       "how are you" + "\n" +
                       "i'm sad" + "\n" +
                       "bye");
    String response = prompt();
    return response;
  }
}
