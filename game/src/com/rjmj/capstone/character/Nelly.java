package com.rjmj.capstone.character;

public class Nelly implements Character {
    private final String name = "Nelly";

    // TODO: Update with the correct question.
    private final String question = null;

    // TODO: Update with correct room assignment.
    private final String room = "Dinning Room";

    @Override
    public void talk() {
        System.out.println("Welcome to the Apprenticeship!  Your journey has been hard, but I will help you");
        System.out.println("You have been intentionally injected with CoVID.  Luckily the vaccine ingredients");
        System.out.println("are located in this Mansion.  If you fail to properly mix and administer the vaccine");
        System.out.println("within 10 minutes you will die.");
        System.out.println("To move around, you simply will type 'Up' 'Back' 'Left' and 'Right' as applicable.");
        System.out.println("To get you started here is a Syringe.  You will need to find the remaining items");
        System.out.println("Best of luck!");
    }

    @Override
    public String askQuestion() {
        return null;
    }

    @Override
    public void answerQuestion() {

}
}
