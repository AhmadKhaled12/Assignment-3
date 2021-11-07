package ex_1;
public class Mammal implements Animal
{
    private String Mammel_name;
    private String fav_food;
    private int no_of_legs;
    public Mammal(String name)
    {
        Mammel_name = name;
    }
    
    public void set_no_of_legs(int n)
    {
        no_of_legs = n;
    }
    
    public int get_no_of_legs()
    {
        return this.no_of_legs;
    }
    
    public void set_fav_food(String fav)
    {
        fav_food = fav;
    }
    
    public String get_fav_food()
    {
        return this.fav_food;
    }
    
    @Override
    public boolean eat()
    {
        return true;
    }
    
    @Override
    public boolean travel()
    {
        return true; 
    }
    
    public void dispaly()
    {
        System.out.println("Mammel name: " + this.Mammel_name + ".");
        System.out.println("Favourite food " + this.get_fav_food() + ".");
        System.out.println("Number of legs: " + this.get_no_of_legs() + ".");
        
        if (this.eat() == true)
        {
            System.out.println(this.Mammel_name + " can eat.");
        }
        else
        {
            System.out.println(this.Mammel_name + " can't eat.");
        }
        
        if (this.travel() == true)
        {
            System.out.println(this.Mammel_name + " can travel.");
        }
        else
        {
            System.out.println(this.Mammel_name + " can't travel.");
        }
    }
}
