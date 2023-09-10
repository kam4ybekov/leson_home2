public class Main {
    public static void main(String[] args) {
        Printable germanyCar = createObject("Германия", "Porche 911", 2022);
        Printable japanCar = createObject("Япония", "Toyota Camry", 2023);
        Printable americaCar = createObject("Америка", "Cadilac Escaleid", 25000);

        Printable[] cars = {germanyCar, japanCar, americaCar};

        for (Printable car : cars) {
            car.print();
            System.out.println();
        }
    }
    public static Printable createObject(String country, String model, int yearOrPrice) {
        switch (country) {
            case "Германия":
                return new Germany(country, model, 0);
            case "Япония":
                return new Japan(country, model, "Седан");
            case "Америка":
                return new America(country, model, yearOrPrice);
            default:
                throw new IllegalArgumentException("Неизвестная страна: " + country);
        }
    }
}


