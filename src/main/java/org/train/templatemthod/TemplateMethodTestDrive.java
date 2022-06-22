package org.train.templatemthod;

public class TemplateMethodTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
