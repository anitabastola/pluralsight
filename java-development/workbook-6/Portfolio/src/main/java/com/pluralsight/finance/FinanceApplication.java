package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("My Portfolio", "Anita");

        BankAccount bankAccount = new BankAccount("Anita", "789", "5000");
        portfolio.add(bankAccount);

        House myHouse = new House("My sweet house", "159", 500);
        portfolio.add(myHouse);

        Gold myGold = new Gold(40);
        portfolio.add(myGold);

        CreditCard creditCard = new CreditCard("Anita", "258", 946);
        portfolio.add(creditCard);

        Valuable mostValuable = portfolio.getMostValuable();
        
    }
}
