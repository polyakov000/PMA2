abstract class Smartphone {
    protected String model;
    protected String os;
    protected int storageGB;

    public abstract void displaySpecs();

    @Override
    public String toString() {
        return "Модель: " + model + ", ОС: " + os + ", Память: " + storageGB + "GB";
    }
}