class Iphone extends Smartphone {
    public Iphone(String model, int storageGB) {
        this.model = model;
        this.os = "iOS";
        this.storageGB = storageGB;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Характеристики Apple iPhone:");
        System.out.println(this);
    }
}