package ua.pp.voronin.serhii.tommy;

// Змінити клас так, щоб його можна було використовувати у якості винятка
public class SaferException extends Exception{

    public SaferException(String errorMessage) {
        super(errorMessage);
    }


}
