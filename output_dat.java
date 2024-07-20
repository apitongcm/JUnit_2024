
//Recapped for my knowledge in JAVA syntax
//OOP is used for repetitive task 
//DRY - Dont Repeat yourself


public class output_dat { 

    final int y = 10;
    int x = 5; 
    

    public static void main(String[] args){
        //System.out.println("Hello World");
        output_dat my_obj1 = new output_dat();
        output_dat my_obj2 = new output_dat();

        
        //y is declare the attribute as final: (cannot override existing values)
        //my_obj2.y = 25;

        System.out.println(my_obj1.x);
        System.out.println(my_obj2.x);

    }

}