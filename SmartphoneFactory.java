abstract class SmartphoneFactory {
    public abstract Smartphone createSmartphone(String model, int storageGB);

    public void orderSmartphone(String model, int storageGB) {
        Smartphone phone = createSmartphone(model, storageGB);
        System.out.println("\n--- Создаем новый смартфон ---");
        phone.displaySpecs();
        System.out.println("--- Смартфон готов ---\n");
    }
}