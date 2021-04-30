package com.example.sirsuhail;

public class items {
    private String message;
    private boolean isSeder;
    private boolean isFirstMEssage;
    private String senderName;
    private String dayandTime;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSeder() {
        return isSeder;
    }

    public void setSeder(boolean seder) {
        isSeder = seder;
    }

    public boolean isFirstMEssage() {
        return isFirstMEssage;
    }

    public void setFirstMEssage(boolean firstMEssage) {
        isFirstMEssage = firstMEssage;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getDayandTime() {
        return dayandTime;
    }

    public void setDayandTime(String dayandTime) {
        this.dayandTime = dayandTime;
    }

    public items( boolean isSeder, boolean isFirstMEssage, String message,String senderName, String dayandTime) {
        this.message = message;
        this.isSeder = isSeder;
        this.isFirstMEssage = isFirstMEssage;
        this.senderName = senderName;
        this.dayandTime = dayandTime;
    }
}
