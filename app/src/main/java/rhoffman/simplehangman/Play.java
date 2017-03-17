package rhoffman.simplehangman;

import java.util.Random;

/**
 * Created by rhoffman on 3/17/2017.
 */

public class Play{

    public Play(){}

    public void Start(String difficulty)
    {
        int arraySize = 26;
        String words[] = new String[arraySize];
        String hints[] = new String[arraySize];
        switch(difficulty)
        {
            case "easy":

                words[0] = "cat";
                hints[0] = "Animal";
                words[1] = "dog";
                hints[1] = "Animal";
                words[2] = "book";
                hints[2] = "Reading";
                words[3] = "breakfeast";
                hints[3] = "Meals";
                words[4] = "telephone";
                hints[4] = "Communication";
                words[5] = "mixture";
                hints[5] = "Noun";
                words[6] = "music";
                hints[6] = "Form of Expression";
                words[7] = "animal";
                hints[7] = "Think cat, dog, tiger, etc.";
                words[8] = "school";
                hints[8] = "Building";
                words[9] = "plant";
                hints[9] = "Think grass, tree, flower, etc.";
                words[10] = "pen";
                hints[10] = "Office tool.";
                words[11] = "pencil";
                hints[11] = "Office tool.";
                words[12] = "paper";
                hints[12] = "Office tool.";
                words[13] = "note";
                hints[13] = "You can pass it around.";
                words[14] = "fog";
                hints[14] = "Form of percipitation.";
                words[15] = "smoke";
                hints[15] = "Comes from fire.";
                words[16] = "bake";
                hints[16] = "Cooking.";
                words[17] = "alone";
                hints[17] = "Without Others.";
                words[18] = "drive";
                hints[18] = "Car.";
                words[19] = "town";
                hints[19] = "Form of community.";
                words[20] = "city";
                hints[20] = "Form of community.";
                words[21] = "sunny";
                hints[21] = "Sunlight.";
                words[22] = "shine";
                hints[22] = "Glisten.";
                words[23] = "polish";
                hints[23] = "Clean.";
                words[24] = "cap";
                hints[24] = "Head.";
                words[25] = "hat";
                hints[25] = "Head.";
                break;
            case "medium":
                words[0] = "president";
                hints[0] = "Leader.";
                words[1] = "exclamation";
                hints[1] = "Shout out.";
                words[2] = "statement";
                hints[2] = "To say.";
                words[3] = "television";
                hints[3] = "You watch it.";
                words[4] = "physics";
                hints[4] = "Form of Science.";
                words[5] = "algebra";
                hints[5] = "Form of math.";
                words[6] = "geometry";
                hints[5] = "Form of math.";
                words[7] = "difficult";
                hints[7] = "Hard.";
                words[8] = "extreme";
                hints[8] = "Intense.";
                words[9] = "procedure";
                hints[9] = "Steps.";
                words[10] = "ship";
                hints[10] = "Big Boat.";
                words[11] = "soldier";
                hints[11] = "Army.";
                words[12] = "lunch";
                hints[12] = "Meal.";
                words[13] = "hockey";
                hints[13] = "Sports.";
                words[14] = "tennis";
                hints[14] = "Sports.";
                words[15] = "soccer";
                hints[15] = "Sports.";
                words[16] = "football";
                hints[16] = "Sports.";
                words[17] = "basketball";
                hints[17] = "Sports.";
                words[18] = "bias";
                hints[18] = "One sided.";
                words[19] = "magazine";
                hints[19] = "Form of book.";
                words[20] = "computer";
                hints[20] = "Microsoft.";
                words[21] = "internet";
                hints[21] = "World Wide Web.";
                words[22] = "allegedly";
                hints[22] = "Supposedly.";
                words[23] = "system";
                hints[23] = "Network.";
                words[24] = "unison";
                hints[24] = "As one.";
                words[25] = "excited";
                hints[25] = "Upbeat.";
                break;
            case "hard":
                words[0] = "amalgamation";
                hints[0] = "Mixture.";
                words[1] = "proclomation";
                hints[1] = "Proclaim.";
                words[2] = "establishment";
                hints[2] = "Institution.";
                words[3] = "rehabilitation";
                hints[3] = "Reform.";
                words[4] = "rhinoceros";
                hints[4] = "Animal.";
                words[5] = "velociraptor";
                hints[5] = "Dinosaur.";
                words[6] = "declaration";
                hints[6] = "Declare.";
                words[7] = "announcement";
                hints[7] = "Announce.";
                words[8] = "binomial";
                hints[8] = "Form of monomial.";
                words[9] = "polynomial";
                hints[9] = "Form of trinomial.";
                words[10] = "congregation";
                hints[10] = "Group.";
                words[11] = "obligation";
                hints[11] = "Required.";
                words[12] = "structure";
                hints[12] = "Anatomy.";
                words[13] = "description";
                hints[13] = "Describe.";
                words[14] = "perscription";
                hints[14] = "Perscribe.";
                words[15] = "subscribe";
                hints[15] = "Join.";
                words[16] = "address";
                hints[16] = "Place.";
                words[17] = "township";
                hints[17] = "Multiple Schools.";
                words[18] = "mischievous";
                hints[18] = "Sneaky.";
                words[19] = "bewildered";
                hints[19] = "Puzzled, Confused.";
                words[20] = "accusation";
                hints[20] = "To Conclude.";
                words[21] = "designation";
                hints[21] = "Assign.";
                words[22] = "disgusting";
                hints[22] = "Nasty, Gross.";
                words[23] = "prolonged";
                hints[23] = "Extend.";
                words[24] = "restoration";
                hints[24] = "Rebuild.";
                words[25] = "regeneration";
                hints[25] = "To Be Reborn.";
        }

        String word;
        String hint;
        String guess = "";
        Random rand = new Random();
        int randInt = rand.nextInt(arraySize);
        word = words[randInt];
        hint = hints[randInt];
        int wordLength = word.length() + 1;

        for(int i = 1;i < wordLength;i++)
        {
            guess += "-";
        }

        //start guessing
        String lettersUsed = "";
        int tt = 0;
        boolean canPlay = true;

        MainGameFunction(guess, tt, canPlay, lettersUsed, word, hint);

    }

    public void MainGameFunction(String guess, int tries, boolean canPlay, String lettersUsed, String word, String hint)
    {
        if(tries == 6)
        {
            canPlay = false;
            //Lose();
        }
        else
        {
            char userGuess[] = guess.toCharArray();
            char userWord[] = word.toCharArray();
            Guess(guess, tries, lettersUsed, guess, word, hint);
        }
    }

    public void Guess(String guess, int tries, String lettersUsed, String userGuess, String word, String hint)
    {
        if(userGuess.equals(word))
        {
            //Win();
        }
        else if(tries == 6)
        {
            //todo update textbox modal with you lose message
            //Lose();
        }
        else
        {
            //todo process guess here from buttons on UI
        }
    }

}


