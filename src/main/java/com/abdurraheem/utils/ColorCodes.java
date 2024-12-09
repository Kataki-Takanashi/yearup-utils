package com.abdurraheem.utils;

/**
 * A utility class that provides ANSI color codes for console output.
 * This class cannot be instantiated.
 */
public class ColorCodes {

    // Private constructor to prevent instantiation
    private ColorCodes() {}

    /**
     * Enum representing ANSI color codes for text colors and background colors.
     */
    public enum Color {
        // Text colors
        RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m"),
        GRAY("\u001B[90m"),
        SILVER("\u001B[37m"),

        // Background colors
        BLACK_BACKGROUND("\u001B[40m"),
        RED_BACKGROUND("\u001B[41m"),
        GREEN_BACKGROUND("\u001B[42m"),
        YELLOW_BACKGROUND("\u001B[43m"),
        BLUE_BACKGROUND("\u001B[44m"),
        PURPLE_BACKGROUND("\u001B[45m"),
        CYAN_BACKGROUND("\u001B[46m"),
        WHITE_BACKGROUND("\u001B[47m");

        private final String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        @Override
        public String toString() {
            return this.code;
        }
    }

    /**
     * Applies the specified text color to the given text.
     * @param color The text color to apply.
     * @param text The text to color.
     * @return The colored text.
     */
    public static String applyColor(Color color, String text) {
        return color.getCode() + text + Color.RESET.getCode();
    }

    /**
     * Applies the specified text and background colors to the given text.
     * @param textColor The text color to apply.
     * @param backgroundColor The background color to apply.
     * @param text The text to color.
     * @return The colored text.
     */
    public static String applyColor(Color textColor, Color backgroundColor, String text) {
        if (textColor == backgroundColor) {
            throw new IllegalArgumentException("Text and background colors cannot be the same.");
        }
        return textColor.getCode() + backgroundColor.getCode() + text + Color.RESET.getCode();
    }
}