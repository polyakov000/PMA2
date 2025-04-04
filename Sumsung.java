class Sumsung extends Smartphone {
    public Sumsung(String model, int storageGB) {
        this.model = model;
        this.os = "Android";
        this.storageGB = storageGB;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Характеристики Samsung Galaxy:");
        System.out.println(this);
    }
}