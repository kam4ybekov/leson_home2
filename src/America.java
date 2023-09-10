public class America extends Cars implements Printable{

    private int price;

    public America(String firma, String model, int price) {
        super(firma, model);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("страна " + getCountry());
        System.out.println("модель " + getModel());
        System.out.println("цена " + price);

    }
}
