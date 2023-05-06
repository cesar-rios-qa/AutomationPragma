package utils;

public enum CapturedMesaages {

    INCORRECT_LOGIN("Epic sadface: Username and password do not match any user in this service"),
    FINISH_ORDER("Thank you for your order!");

    private final String message;



    CapturedMesaages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
