package com.example.bodify;
import com.example.bodify.model.PreferencesModel;
import com.example.bodify.model.UserModel;
import com.google.firebase.Timestamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Map;
import java.util.Objects;


public class UserModelTest {

    @Test
    public void testToMapSerialization() {

        // Create a sample UserModel instance
        UserModel user = new UserModel();
        user.setUsername("john_doe");
        user.setEmail("john.doe@example.com");
        user.setPhoneNumber("+1234567890");
        user.setProfilePictureUrl("https://example.com/profile.jpg");
        user.setFullName("John Doe");
        user.setGymName("Fitness Club");
        user.setHeight(180);
        user.setWeight(75.5);
        user.setFitnessGoal("Build muscle");
        user.setLocation("https://maps.google.com/fitnessclub");
        user.setGymType("Gym & Fitness Center");
        user.setRole("Coach");
        user.setBio("Fitness enthusiast and certified trainer");
        user.setResumeUrl("https://example.com/resume.pdf");

        PreferencesModel preferences = new PreferencesModel();
        preferences.setLanguage("English");
        preferences.setTheme("Dark");
        user.setPreferencesModel(preferences);

        user.setMembershipStatus("Active");


        user.setLastLoginTime(Timestamp.now());

        user.setWorkingStatus("Full-time");
        user.setDateOfBirth(new Date());
        user.setDateOfCreation(new Date());
        user.setGender("Male");
        user.setMedicalCondition("None");



        // Convert UserModel to a map
        Map<String, Object> userMap = user.toMap();

        // Assertions to verify the serialized map
        Assertions.assertEquals("john_doe", userMap.get("username"));
        Assertions.assertEquals("john.doe@example.com", userMap.get("email"));
        Assertions.assertEquals("+1234567890", userMap.get("phoneNumber"));
        Assertions.assertEquals("https://example.com/profile.jpg", userMap.get("profilePictureUrl"));
        Assertions.assertEquals("John Doe", userMap.get("fullName"));
        Assertions.assertEquals("Fitness Club", userMap.get("gymName"));
        Assertions.assertEquals(180, userMap.get("height"));
        Assertions.assertEquals(75.5, userMap.get("weight"));
        Assertions.assertEquals("Build muscle", userMap.get("fitnessGoal"));
        Assertions.assertEquals("https://maps.google.com/fitnessclub", userMap.get("location"));
        Assertions.assertEquals("Gym & Fitness Center", userMap.get("gymType"));
        Assertions.assertEquals("Coach", userMap.get("role"));
        Assertions.assertEquals("Fitness enthusiast and certified trainer", userMap.get("bio"));
        Assertions.assertEquals("https://example.com/resume.pdf", userMap.get("resumeUrl"));

        // Assuming userMap is a Map<String, Object> obtained from Firestore

        Object preferencesObj = userMap.get("preferences");
        if (preferencesObj instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> preferencesMap = (Map<String, Object>) preferencesObj;

            // Assertions to verify the content of preferencesMap
            Assertions.assertTrue(preferencesMap.containsKey("language"));
            Assertions.assertTrue(preferencesMap.containsKey("theme"));

            // Assert specific values if needed
            Assertions.assertEquals("English", preferencesMap.get("language"));
            Assertions.assertEquals("Dark", preferencesMap.get("theme"));


        }

        Assertions.assertEquals("Active", userMap.get("membershipStatus"));
        Assertions.assertNotNull(userMap.get("lastLoginTime"));
        Assertions.assertEquals("Full-time", userMap.get("workingStatus"));
        Assertions.assertNotNull(userMap.get("dateOfBirth"));
        Assertions.assertNotNull(userMap.get("dateOfCreation"));
        Assertions.assertEquals("Male", userMap.get("gender"));
        Assertions.assertEquals("None", userMap.get("medicalCondition"));

        // Adjusting assertion for Timestamp example
        Assertions.assertTrue(userMap.get("lastLoginTime") instanceof Timestamp);
        // Or if Timestamp can be converted to a Date for comparison
        Assertions.assertNotNull(((Timestamp) Objects.requireNonNull(userMap.get("lastLoginTime"))).toDate());

        // You can add more assertions based on your actual implementation and requirements
    }
}
