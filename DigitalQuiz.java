/*My name is Guo Dong Zhang. The following program is a quiz that prompts the user.
 * Each question is being printed to the console.
 * The answers are being read into an array of Strings.
 * The Strings are then compared to the desired string using conditionals.
 * Each question will be graded with points of 1; the total is 7 points.
 */
import java.util.Scanner;
public class DigitalQuiz{
  public static void main(String[]args){
    Scanner answer = new Scanner(System.in);
    String[]answers = new String[7];
    String response = "";
    int score = 0;
    System.out.print("HOW WELL DO YOU KNOW LATINX FOODS AND THEIR HISTORY?");
    System.out.println();
    System.out.println("Introduction: Have you wonder which taco you are? Don't lie " +
                       "because I know you do. You've also wondered which Mofongo " +
                       "you were in your past life or which quesadilla " +
                       "is your lucky charm of the day based on the Buzzfeed quizzes. " +
                       "Instead of wondering which taco you are, how about getting to " +
                       "know the taco first before you make your life commitments to them? " +
                       "In this quiz, you will learn about different 'personalities,' " +
                       "so to speak, of the tacos and their background (Tacos del " +
                       "pastor is better than carne asada. I said it). Are you ready to " +
                       "swipe right?\n" + "a) yes\n" + "b) I was born ready\n" + "c) bib");
    response = answer.next();
    if(response.equals("a") || response.equals("b")){
      System.out.println();
    }else if(response.equals("c")){
      System.out.println("the following is the bibliography:\n");
      answer.close();
      return;
    }
    System.out.println();
    System.out.println("1)Which of the following organizations practices Polyculture?\n" +  
                       "a) Soul Fire farm\n" + "b) La Finca Del Sur\n" +
                       "c) Woke Foods\n" + "d) Herban Cura");//Question 1
    answers[0] = answer.next();
    if(answers[0].equals("a")){
      score++;
      System.out.println("Good Job!");
    }else {
      System.out.println("Unfortunately, the correct answer is A) SOUL FIRE FARM.");
    }
    System.out.println("Polyculture is a practice where each section" +
                       "is planted with different types of seeds instead of One." +
                       "The Soul Fire farmers use this practice to plant corn, beans" +
                       " squash, and other edibles altogether. They learn from" +
                       " the Mohican farmers, the orginal owners of the land.");
    System.out.println();
    System.out.println("2)Are vegan Afro-Carribean foods real?\n" +
                       "a) Yes\n" + "b) No");//Question 2
    answers[1] = answer.next();
    if(answers[1].equals("a")){
      score++;
      System.out.println("You've got it! ");
    }else {
      System.out.println("They are real! ");
    
    }
    System.out.println("Woke Foods is an organization that offers " +
                       "organic Afro-Carribean foods like Sancocho and Pastelitos " +
                       "at affordable pricing for working-class families. It strives to " +
                       "preserve Afro-Latinx cultures and, at the same time, provides " +
                       "enough nutrients for the human bodies. Woke Foods envisions that " +
                       "food is the connection between our health and mother nature, and " +
                       "through food, they hope to channel that connection and better our " +
                       "mental and physical health.");
    System.out.println();
    System.out.println("3)Are there alternatives to buy fresh food amidst the pandemic " +
                       "besides Amazon Fresh?\n" + "a) Yes\n" + "b) No");//Question 3
    answers[2] = answer.next();
    if(answers[2].equals("a")){
      score++;
      System.out.println("Claro que si, mi amor!");
    }else {
      System.out.println("Sorpresa, sorpresa. ");
    }
    System.out.println("If you are a resident of Globeville " +
                       "and Elyria-Swansea (GES) in Denver, Colorado, The GrowHaus " +
                       "is a nonprofit community that accepts order online! They " +
                       "work with other organizations such as Denver Food Rescue, " +
                       "We Don’t Waste, and Bondadosa to ensure high quality food " +
                       "to be delivered at your door for the price of just $1.99! " +
                       "A que estas esperando? Get yourself the food you need to make " +
                       "that homecook sofrito. Be sure to check your local community " +
                       "organizations that may have such services available! Also, " +
                       "Don't forget to visit https://wokefoods.coop/recipes/ for recipes ;)");
    System.out.println();
    System.out.println("4) Which of the ingredient shared by tacos and mexican tamales?\n" +
                       "a) sugar\n" + "b) milk\n" + "c) salsa\n" + "d) tortillas");//Question 4
    answers[3] = answer.next();
    if(answers[3].equals("d")){
      score++;
      System.out.println("Estas bien!");
    }else {
      System.out.println("Le voy a contar a tu mama! It's Tortillas, mijitos!");
    }
    System.out.println("Tortillas are made with corn based dough using " +
                       "the tortilladora (tortilla press). The earliest Tortilleria " +
                       "(tortilla shop) was created by Concepcion 'concha' Sanchez, " +
                       "who used the electric molino (corn mill) to ground corn and " +
                       "the tortilladora to flatten the corn dough and make tortillas. " +
                       "With the assistance of these two machines, Sanchez was able to " +
                       "make tortillas and tamales at a larger quanity and faster pace. " +
                       "The tortilleria supported the Sanchez family's survival during " +
                       " the Great Depression. ");
    System.out.println();
    System.out.println("5)You've heard the controversy of pineapples on pizza. " +
                       "I present you the new question of 2020: Can milk go with " +
                       "ham?\n" + "a)Yes\n" + "b)YYAASS");//Question5
    answers[4] = answer.next();
    if(answers[4].equals("a")){
      System.out.println("Yes, my little sweet peach pie!");
    }else {
      System.out.println("YYYYAAASSS QUEEN!");
    }
    score++;
    System.out.println("Milk can go with ham! " +
                       "Milk-baked ham is a recipe in Princess Pamela's Soul " +
                       "Food Cookbook. Soul Foods are created as a result of " +
                       "the Soul Food movement. The Soul Food movement was " +
                       "created to solidify and celebrate African American " +
                       "culture. Soul Foods are created using the recipes of " +
                       "southern black folks, which resembles their pride " +
                       "and way of life. Much like Soul Music,Soul Foods " +
                       "are black Americans contribution to the American cultures!");
    System.out.println();
    System.out.println("6) What is the nickname for female mexican food vendors in the " +
                       "late 1800s and early 1900s?\n" + "a) Spice Mistress\n" + 
                       "b) Lady Jalapenas\n" + "c) Chili Queen\n" + "d) Salsa Dames");//Question 6
    answers[5] = answer.next();
    if(answers[5].equals("c")){
      score++;
      System.out.println("Desafortunamente, tienes razon.");
    }else {
      System.out.println("The correct answer is c) Chili Queen.");
    }
    System.out.println("The term Chili Queen was used to " +
                       "not only characterize the women who make tamales and tortillas, " +
                       "but also to fetishize them. Anglo-male Americans would flirt with " +
                       "female vendors to prove their alphaness, so to speak.It is a stereotype " + 
                       "for mexican vendors,to be hot, as it associates with the spicy food in " +
                       "mexican cuisine, despite the fact that many of the vendors are male. " +
                       "In the expedition of cheap foods, Anglo Americans indulges in " +
                       "Mexican cuisine however, tamales vendors are also the victims " +
                       "in the political crossfires of criminality. As a result, " +
                       "tamales vendors are often harassed by the police and constricted " +
                       "to sell tamales in segregated regions. Latinx identities are not " +
                       "just black and white!");
    System.out.println();
    System.out.println("7) How many ingredients are in Mole Poblano?\n" +
                       "a) 10\n" + "b) 12\n" + "c) 5\n" + "d) 20");//Question 7
    answers[6] = answer.next();
    if(answers[6].equals("d")){
      System.out.println("Buena Onda!"); 
                         
    }else {
      System.out.println("nada");
    }
    System.out.println("There are approximately 20 ingredients in Mole " +
                       "Poblano! Depending on the region of Mexico, there are " +
                       "different variations of Mole. Nonetheless, Mole can be" +
                       "made with cloves, cinnamon, peppercorn, saffron, cumin, " +
                       "chocolate, chile costeno, chile de Arbol etc. What's interesting is that " +
                       "Cloves,cinnamon, and peppercorn are spices from the Islamic world;" +
                       "Saffron and cumin are imported from Spain; chocolate, chile " +
                       "costeno, chile de arbol are chilies from the Americas. In " +
                       "other words, Mole Poblano is a combination of 3 cultures! " +
                       "The diveristy of ingredinents is analogous to the diversity " +
                       "of the Latinx community!");
    
    System.out.println();
    System.out.print("Total socre:" + score);//Results 
    System.out.println();
    if(score > 0 && score < 4){
      System.out.println("Your score is a little low pero no te preocupes! ");
    }else if(score == 4 || score == 5){
      System.out.println("Buen trabajo! It seems like you know your foods pretty well!");
    }else {
      System.out.println("Congratulations! Tell your family and they'll be proud of you!");
    }
    System.out.println("The goal of this quiz is to understand that " +
                       "foods, like people, have a deep and complex history. Through " +
                       "food, we are able to learn/reclaim Latinx heritage and solidify " +
                       "Latinx identities. Keep in mind this quiz only shows a glimpse of " +
                       "the whole picture. There are much more to it! " +
                       "I hope you had fun with this quiz walk away " +
                       "with some understanding or knowledge about the Latinx community " +
                       "after taking this quiz. After all, knowledge is power!");
    answer.close();
  }
}
    