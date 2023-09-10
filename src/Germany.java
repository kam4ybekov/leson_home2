public class Germany extends Cars implements Printable {

    private int mileage;

    public Germany(String firma, String model, int mileage) {
        super(firma, model);
        mileage = mileage;
    }

    @Override
    public void print() {
        System.out.println("страна " + getCountry());
        System.out.println("модель " + getModel());
        System.out.println("пробег " + mileage + " km");

    }
}
