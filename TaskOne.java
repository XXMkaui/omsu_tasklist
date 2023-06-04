interface IConverter {
    double getConvValue(double value);
}

class CelsiusConverter implements IConverter {
    @Override
    public double getConvValue(double value) {
        return value;
    }
}

class KelvinConverter implements IConverter {
    @Override
    public double getConvValue(double value) {
        return value + 273.15;
    }
}

class FahrenheitConverter implements IConverter {
    @Override
    public double getConvValue(double value) {
        return 1.8 * value + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        double temperature = 50;
        System.out.println(new CelsiusConverter().getConvValue(temperature));
        System.out.println(new KelvinConverter().getConvValue(temperature));
        System.out.println(new FahrenheitConverter().getConvValue(temperature));
    }
}