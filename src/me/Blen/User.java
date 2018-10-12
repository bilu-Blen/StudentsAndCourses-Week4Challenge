package me.Blen;

public class User {
    private String userChoice;
    private String userThirdChoice;

    public String getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public String greeting(){
        return "Hello!";
    }
    //this is the method that asks the user to make his third choice either to add or look at the list after using the program once

    public String thirdChoice(){
        return "Would you like to add or take a look at lists?";
    }

    public String getUserThirdChoice() {
        return userThirdChoice;
    }

    public void setUserThirdChoice(String userThirdChoice) {
        this.userThirdChoice = userThirdChoice;
    }

}
