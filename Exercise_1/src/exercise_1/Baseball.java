package exercise_1;
public class Baseball extends Ball
{
    public Baseball(String name)
    {
        super(name);
    }
    @Override
    public boolean toss()
    {
        return false;
    }
    @Override
    public boolean bounce()
    {
        return true;
    }
    
    @Override
    public void details()
    {
        System.out.println("The name of brand: " + this.get_brand_name() + ".");
        
        if (this.bounce() == true)
        {
            System.out.println("Bouncalbe.");
        }
        else 
        {
            System.out.println("Not bouncalbe.");
        }
        if (this.toss() == true)
        {
            System.out.println("Tossalbe.");
        }
        else 
        {
            System.out.println("Not tossalbe.");
        }
        System.out.println();
        System.out.println();
    }
    
}
