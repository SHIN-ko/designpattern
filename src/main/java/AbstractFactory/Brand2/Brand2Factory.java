package AbstractFactory.Brand2;

import AbstractFactory.Abstract.BikeFactory;
import AbstractFactory.Abstract.Body;
import AbstractFactory.Abstract.Wheel;

public class Brand2Factory implements BikeFactory {
    @Override
    public Body createBody() {
        return new Brand2Body();
    }

    @Override
    public Wheel createWheel() {
        return new Brand2Wheel();
    }
}
