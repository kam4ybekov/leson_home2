public class Japan extends Cars implements Printable{

    private String body;

    public Japan(String firma, String model, String body) {
        super(firma, model);
        this.body = body;
    }

    @Override
    public void print() {
        System.out.println("страна " + getCountry());
        System.out.println("модель " + getModel());
        System.out.println("кузов " + body);
    }
}
