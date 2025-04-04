class SumsungFactory extends SmartphoneFactory {
    @Override
    public Smartphone createSmartphone(String model, int storageGB) {
        return new Sumsung(model, storageGB);
    }
}