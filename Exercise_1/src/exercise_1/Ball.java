package exercise_1;
public abstract class Ball implements Tossable
{
    private String brand_name;
    public Ball(String name)
    {
        brand_name = name;
    }
    public String get_brand_name()
    {
        return brand_name;
    }
    @Override
    public boolean toss()
    {
        return false;
    }
    public abstract boolean bounce();
    
    public abstract void details();
}
