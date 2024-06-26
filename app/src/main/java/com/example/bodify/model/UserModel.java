package com.example.bodify.model;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Exclude;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserModel {
    private String userId;
    private String username;
    private String email;
    private String phoneNumber;
    private String profilePictureUrl;
    private String fullName;
    private String gymName;
    private double height;
    private double weight;
    private String fitnessGoal;
    private String location;
    private String gymType;
    private String role;
    private String bio;
    private String resumeUrl;
    private PreferencesModel preferences;
    private String membershipStatus;
    private Timestamp lastLoginTime;
    private String workingStatus;
    private Date dateOfBirth;
    private Date dateOfCreation;
    private String gender;
    private String medicalCondition;
    private Map<String, String> socialMediaLinks;

    // Empty constructor needed for Firestore serialization
    public UserModel() {
        // Default constructor required for calls to DataSnapshot.getValue(UserModel.class)
    }

    // Constructor with parameters
    public UserModel(String username, String email, String phoneNumber, String profilePictureUrl,
                     String fullName, String gymName, double height, double weight, String fitnessGoal,
                     String location, String gymType, String role, String bio, String resumeUrl,
                     PreferencesModel preferences, String membershipStatus, Timestamp lastLoginTime,
                     String workingStatus, Date dateOfBirth, Date dateOfCreation, String gender,
                     String medicalCondition, Map<String, String> socialMediaLinks) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePictureUrl = profilePictureUrl;
        this.fullName = fullName;
        this.gymName = gymName;
        this.height = height;
        this.weight = weight;
        this.fitnessGoal = fitnessGoal;
        this.location = location;
        this.gymType = gymType;
        this.role = role;
        this.bio = bio;
        this.resumeUrl = resumeUrl;
        this.preferences = preferences;
        this.membershipStatus = membershipStatus;
        this.lastLoginTime = lastLoginTime;
        this.workingStatus = workingStatus;
        this.dateOfBirth = dateOfBirth;
        this.dateOfCreation = dateOfCreation;
        this.gender = gender;
        this.medicalCondition = medicalCondition;
        this.socialMediaLinks = socialMediaLinks;
    }

    // Getters and setters for all attributes

    // Getters and Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGymType() {
        return gymType;
    }

    public void setGymType(String gymType) {
        this.gymType = gymType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public PreferencesModel getPreferences() {
        return preferences;
    }

    public void setPreferencesModel(PreferencesModel preferences) {
        this.preferences = preferences;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public Map<String, String> getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(Map<String, String> socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    // Firestore serialization method (toMap)
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("email", email);
        map.put("phoneNumber", phoneNumber);
        map.put("profilePictureUrl", profilePictureUrl);
        map.put("fullName", fullName);
        map.put("gymName", gymName);
        map.put("height", height);
        map.put("weight", weight);
        map.put("fitnessGoal", fitnessGoal);
        map.put("location", location);
        map.put("gymType", gymType);
        map.put("role", role);
        map.put("bio", bio);
        map.put("resumeUrl", resumeUrl);
        // Add other attributes similarly

        // Convert preferences to a map if it's an object
        if (preferences != null) {
            map.put("preferences", PreferencesModel.toMap());
        }

        map.put("membershipStatus", membershipStatus);
        map.put("lastLoginTime", lastLoginTime);
        map.put("workingStatus", workingStatus);
        map.put("dateOfBirth", dateOfBirth);
        map.put("dateOfCreation", dateOfCreation);
        map.put("gender", gender);
        map.put("medicalCondition", medicalCondition);
        map.put("socialMediaLinks", socialMediaLinks);

        return map;
    }


}