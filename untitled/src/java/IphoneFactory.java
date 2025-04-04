class IphoneFactory extends SmartphoneFactory {
    @Override
    public Smartphone createSmartphone(String model, int storageGB) {
        return new Iphone(model, storageGB);
    }
}