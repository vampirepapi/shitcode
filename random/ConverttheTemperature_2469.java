package random;

public class ConverttheTemperature_2469 {
    public static double[] convertTemperature(double celsius) {
        double fahrenheit = 1.80 * celsius + 32;
        double kelvin = 273.15 + celsius;
        return new double[] { kelvin, fahrenheit };
    }

    public static void main(String[] args) {
        double celsius = 36.50;
        double[] convertTemperature = convertTemperature(celsius);
        for (double d : convertTemperature) {
            System.out.println(d);
        }
    }
}