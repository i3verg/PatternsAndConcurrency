package org.train.templatemthod;

public class TemplateMethodTestDrive {
    public static void main(String[] args) {
       /* Tea tea = new Tea();
        Coffee coffee = new Coffee();*/

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();

        /*tea.prepareRecipe();
        coffee.prepareRecipe();*/
    }
}
