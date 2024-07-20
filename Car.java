interface Vehicle 
{
    public void vehicleMessage();
    public void vehicleColor();
}


public class Car {
    
    public void vehicleMessage()
    {
        System.out.println("This is the vehicle message");
    }

    public void vehicleColor()
    {
        System.out.println("This is the vehicle color");
    }

}



class Program {
    public static void main (String[] args)
    {
        Car newCar = new Car();
        newCar.vehicleMessage();
        newCar.vehicleColor();
    }


}

