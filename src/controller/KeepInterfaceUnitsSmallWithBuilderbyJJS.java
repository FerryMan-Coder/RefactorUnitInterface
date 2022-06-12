package controller;

import model.User;

/**
 * @author Jan-Jaap Spies
 * doel aantonen hoe een klasse met een constructor met veel parameters kan worden vereenvoudigd middels
 * het builder pattern.
 * Opvallend is dat IntelliJ beweert dat "Private field 'id' is assigned but never accessed", maar als deze
 * wordt verwijderd gaat piepen.
 */

public class KeepInterfaceUnitsSmallWithBuilderbyJJS {
    public static void main(String[] args) {
        User user = new User.UserBuilder(2).firstName("Pete").surName("Nooitgedacht").role("Admin").build();
    }
}
