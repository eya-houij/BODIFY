package com.example.bodify.model;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

public class PreferencesModel {
    private static String language;
    private static String theme;

    // Constructor (optional, if needed)
    public PreferencesModel(String language, String theme) {
        PreferencesModel.language = language;
        PreferencesModel.theme = theme;
    }

    public PreferencesModel() {

    }


    // Getter and setter for language
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        PreferencesModel.language = language;
    }

    // Getter and setter for theme
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        PreferencesModel.theme = theme;
    }

    // Method to convert Preferences to a Map
    public static Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("language", language);
        map.put("theme", theme);
        // Add additional preferences as needed

        return map;
    }

    @NonNull
    @Override
    public String toString() {
        return "Preferences{" +
                "language='" + language + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }

}
