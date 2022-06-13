package ua.pp.voronin.serhii.tommy;

public class ExceptionMaker {

    public static void main(String[] args) {
        new ExceptionMaker().isThereTwo(getData());
    }

    public boolean isThereTwo(Object[] objectsArray) {
        for (Object someObject : objectsArray) {
            // Додати код, що перехоплює вийняток NullPointerException та повертає SaferException
            if (someObject.equals(2)) {
                return true;
            }
        }
        return false;
    }

    public static Object[] getData() {
        return new Object[] { new Object(), null, "test data", 2 };
    }
}
