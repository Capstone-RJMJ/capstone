package com.rjmj.capstone.player;

import com.rjmj.capstone.engine.UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recipe {
    private List<Color> colorMix = new ArrayList(3);
    private List<Color> playerMix = new ArrayList(3);
    private final Color[] clrEnum = {Color.RED, Color.BLUE, Color.GREEN};
    private boolean isMatch = false;

    public void mixRandomRecipe(){
        while(colorMix.size() < 3){
            Color ranColor = clrEnum[(getRandom())];
            if(!colorMix.contains(ranColor)){
                colorMix.add(ranColor);
            }
        }
        System.out.println("recipe is: " + getColorMix().toString());
    }

    public void setPlayerMix() {
        int count = 1;
        UserInput input = new UserInput();
        System.out.println("The recipe needs to be mixed in a specific order.\nEach ingredient is only used once.\n");
        while(playerMix.size() < 3){
            String q = "Enter ingredient number " + count +" , choose from: (RED,BLUE,GREEN)";
            String choice = input.getInput(q).toUpperCase();
            if(choice.startsWith("R")){
                playerMix.add(Color.RED);
            }
            else if(choice.startsWith("B")){
                playerMix.add(Color.BLUE);
            }
            else if(choice.startsWith("G")){
                playerMix.add(Color.GREEN);
            }
            count++;
        }
        setMatch(isRecipeMatch(getPlayerMix()));
    }

    public boolean isRecipeMatch(List<Color> formula){
        boolean result = false;
        for(int i = 0; i < colorMix.size(); i++) {
            if (!formula.get(i).equals(getColorMix().get(i))) {
                System.out.println("Dude, that's not the right. Try again.");
                playerMix = new ArrayList(3);
                return false;
            } else {
                System.out.println("That is correct, you just cured yourself!");
                result = true;
            }
        }
        return result;
    }

    public void playerFormula(Color color){
          playerMix.add(color);
    }

    public int getRandom() {
        return (int) (0 + Math.floor((Math.random() * 3)));
    }

    public List<Color> getColorMix() {
        return colorMix;
    }

    public List<Color> getPlayerMix() {
        return playerMix;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }
}

