public class Smartwatch {
    private   int RAM;
    private  int storage;
    private  int weight;
    private double price;

    public Smartwatch(Builder builder){
        this.RAM= builder.RAM;
        this.storage=builder.storage;
        this.weight=builder.weight;
        this.price= builder.price;

    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "RAM=" + RAM +"MB"+
                ", storage=" + storage +"GB"+
                ", weight=" + weight +"grams"+
                ", price=" + price +
                '}';
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    static class Builder{

        private   int RAM;
        private int storage;
        private  int weight;
        private double price;

        public Smartwatch build(){
            Smartwatch smartwatch=new Smartwatch(this);
            return smartwatch;
        }

        public int getStorage() {
            return storage;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



        public int getRAM() {
            return RAM;
        }

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public Builder(int RAM, int storage){
            this.RAM=RAM;
            this.storage=storage;

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "RAM=" + RAM +"MB"+
                    ", storage=" + storage +"GB"+
                    ", weight=" + weight +"grams"+
                    ", price=" + price +
                    '}';
        }
    }
}
