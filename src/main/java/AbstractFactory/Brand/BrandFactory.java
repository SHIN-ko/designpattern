package AbstractFactory.Brand;

import AbstractFactory.Abstract.BikeFactory;
import AbstractFactory.Abstract.Body;
import AbstractFactory.Abstract.Wheel;

public class BrandFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new BrandBody();
    }

    @Override
    public Wheel createWheel() {
        return new BrandWheel();
    }
}
