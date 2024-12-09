package com.abdurraheem.utils;

import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user for a string input with a given prompt.
     * @param prompt The message to display to the user.
     * @return The user's input as a String.
     */
    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Prompts the user for a string input without a prompt.
     * @return The user's input as a String.
     */
    public static String PromptForString() {
        return scanner.nextLine();
    }

    /**
     * Prompts the user for a yes/no input.
     * @param prompt The message to display to the user.
     * @return true for Yes, false for No.
     */
    public static boolean PromptForYesNo(String prompt) {
        System.out.print(prompt + " (Y for Yes, N for No)? ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("YES");
    }

    /**
     * Prompts the user for a short input.
     * @param prompt The message to display to the user.
     * @return The user's input as a short.
     */
    public static short PromptForShort(String prompt) {
        return promptForNumber(prompt, Short::parseShort, "Invalid short value. Please try again.");
    }

    /**
     * Prompts the user for an integer input.
     * @param prompt The message to display to the user.
     * @return The user's input as an int.
     */
    public static int PromptForInt(String prompt) {
        return promptForNumber(prompt, Integer::parseInt, "Invalid integer value. Please try again.");
    }

    /**
     * Prompts the user for a double input.
     * @param prompt The message to display to the user.
     * @return The user's input as a double.
     */
    public static double PromptForDouble(String prompt) {
        return promptForNumber(prompt, Double::parseDouble, "Invalid double value. Please try again.");
    }

    /**
     * Prompts the user for a byte input.
     * @param prompt The message to display to the user.
     * @return The user's input as a byte.
     */
    public static byte PromptForByte(String prompt) {
        return promptForNumber(prompt, Byte::parseByte, "Invalid byte value. Please try again.");
    }

    /**
     * Prompts the user for a float input.
     * @param prompt The message to display to the user.
     * @return The user's input as a float.
     */
    public static float PromptForFloat(String prompt) {
        return promptForNumber(prompt, Float::parseFloat, "Invalid float value. Please try again.");
    }

    /**
     * Prompts the user for a password input, hiding the input in the console.
     * @param prompt The message to display to the user.
     * @return The user's input as a String.
     */
    public static String PromptForPassword(String prompt) {
        java.io.Console systemConsole = System.console();
        if (systemConsole == null) {
            return PromptForString(prompt);
        }
        System.out.print(prompt);
        char[] passwordChars = systemConsole.readPassword();
        return new String(passwordChars);
    }

    // Private helper method to handle number input with error handling
    private static <T> T promptForNumber(String prompt, java.util.function.Function<String, T> parser, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine();
            try {
                return parser.apply(value);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
}