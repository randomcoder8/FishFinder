import java.util.Scanner;

public class FishFinder {

   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
   
      System.out.println("What is your name?");
      String name1 = kb.nextLine();
      System.out.println("What do you want your pet fishes name to be?");
      String name = kb.nextLine();
      System.out.println("Status Quo: You are a kid named " + name1 + " living a normal life.");
      System.out.println("            You own a pet goldfish named " + name + ".");
      System.out.println("            Press 'ENTER' To Continue");
      kb.nextLine();
      
      System.out.println("Oh no! You wake up one morning and your fish is missing!");
      System.out.println("Do you:");
      System.out.println("a) search the house");
      System.out.println("b) call the police");
      
      String answer;
      answer = kb.nextLine();
      if (answer.equalsIgnoreCase("a")) 
         System.out.println("You find him nowhere!");
         
      else { 
         System.out.println("They laugh and tell you there is nothing they can do about it. You search the house and find him nowhere!");
      }
      kb.nextLine();
      System.out.println("You go downstairs and ask your mom what happened to your pet fish");
      
      kb.nextLine();
      System.out.println("How do you ask your mom?");
      System.out.println("a) MOM! WHERE IS MY FISH?!??!");
      System.out.println("b) Hi mom! Do you know where my fish is?");
      
      String answer1;
      answer1 = kb.nextLine();
      if (answer1.equalsIgnoreCase("a")) {
         System.out.println("Your mom answers: " + name1 + "!");
         System.out.println("a) Go to your room or");
         System.out.println("b) apologize!");
      
         String answer2;
      
         answer2 = kb.nextLine();
      
      
      
      
         if (answer2.equalsIgnoreCase("a")) {
            System.out.println("WRONG! You should always apologize to your mother! Now you ask in a calm tone. She says she doesn't know but you can ask your father who just left for work.");
         }
         else {
            System.out.println("Good! You should always apologize to your mother! Now you ask in a calm tone. She says she doesn't know but you can ask your father who just left for work.");
         }
      }
      else
         System.out.println("Your mom answers: I'm sorry, I don't know You can ask your father who has just left for work.");
      
      kb.nextLine();
      
      System.out.println("You drive to go see you father. He work's at 'The Codfather', a locally renowned marina restaurant.");
      System.out.println("You go inside and ask to see your father\n");
      
      kb.nextLine();
      
      System.out.println("As you are walking to the back, you notice a sign... it reads:");
      System.out.println("\n   FISH SHORTAGE!     ");
      System.out.println("   National Crisis");
      System.out.println("   FISH WANTED!!!! Donate Today To Save The Hunger Of The People Of The Codfather!!!! (REWARD FOR PETS)");
      
      kb.nextLine();
      
      System.out.println("You walk into the back to find a mountainous collection of fish tanks but you notice one in particular...");
      
      kb.nextLine();
      
      System.out.println("You are greeted by your father! " + name1 + "! What are you doing here, at The Codfather?");
      System.out.println("a) I am here to see you at work!");
      System.out.println("b) Where is my fish?");
     
      kb.nextLine();
      
      if (answer.equalsIgnoreCase("a")) {
         System.out.println("Oh good! You can work then. And their may be a reward at the end! We may have to cook " + name + ". I'm sorry.");
      }
      else {
         System.out.println("I see. Unfortunately, their is a fish crisis. And he may need to be cooked. After all, The Codfather is packed!");
      }
      kb.nextLine();
         
      System.out.println("You decide to work at The Codfather for the day to save your pet fish!");
         
      kb.nextLine();
         
      System.out.println("Your first order!");
                  
      double rand = (Math.random()) * 3;
      
      if (rand == 0) {
         System.out.println("Type of fish: Tuna!");
      }
      else if (rand == 1) { 
         System.out.println("Type of fish: Salmon!"); 
      }
      else {          
         System.out.println("Type of fish: Trout!");
      }
      
      double rand2 = (Math.random() * 3);
      if (rand == 0) {
         System.out.println("Cooking method: Baking");
      }
      else if (rand == 1) {
         System.out.println("Cooking method: Grilled");
      }
      else {
         System.out.println("Cooking method: Fillet");
      }
            
      kb.nextLine();
         
      System.out.println("After a long shift working at The Codfather, you are very concerned about " + name + "! You also begin to realize there are no fish left...");
         
      kb.nextLine();
         
      System.out.println("You walk up to your father and ask:");
      System.out.println("a) WHERE IS MY FISH???");
      System.out.println("b) Hi! Where might my fish be?");
         
      kb.nextLine();
      if (answer == "a") {
         System.out.println("Calm Down! Your fish was fried!");
      }
      else {
         System.out.println("We are so sorry, your fish was grilled today. Their was a hungry customer!");
         
         kb.nextLine();
      }
   }
}