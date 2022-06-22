package org.train.templatemthod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase(Locale.ROOT).startsWith("y")){
            return  true;
        } else {
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk ans sugar with your coffee (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
