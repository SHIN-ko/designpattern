package Adapter;

public class AdaterImpl implements Adapter{

    @Override
    public Float twiceOf(Float f) {
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("halfOf Called");
        return (float)Math.half(f.doubleValue());
    }
}
