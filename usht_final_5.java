class Employee {
    static int id = 0;
    static String firstName = ""; 
    static String lastName = ""; 
    static int salery = 0;
    public Employee(int id, String firstName, String lastName, int salery){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salery = salery;
    }
    public static int getID(){
        return id;            
    }
    public static String getFirstName(){
        return firstName;            
    }
    public static String getLastName(){
        return lastName;            
    }
    public static String getName(){
        return firstName+" "+lastName;            
    }
    public static int getSalery(){
        return salery;          
    }
    public static int setSalery(int newSalery){
        salery = newSalery;
        return salery;          
    }
    public static int getAnnualSalary(){            
        return salery*12;          
    }
    public static int raiseSalery(int percent){  
        salery =  (int)(salery*((100+(float)percent)/100)); 
        return salery;          
    }
    public String toString(){  
        
        return " ";          
    }

}
