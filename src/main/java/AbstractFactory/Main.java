package AbstractFactory;

import AbstractFactory.Abstract.BikeFactory;
import AbstractFactory.Abstract.Body;
import AbstractFactory.Abstract.Wheel;
import AbstractFactory.Brand.BrandFactory;
import AbstractFactory.Brand2.Brand2Factory;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new BrandFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        BikeFactory factory2 = new Brand2Factory();
        Body body2 = factory2.createBody();
        Wheel wheel2 = factory2.createWheel();

        System.out.println(body2.getClass());
        System.out.println(wheel2.getClass());
    }
}
