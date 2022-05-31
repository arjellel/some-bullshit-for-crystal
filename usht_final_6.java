// Write a class called Author (as shown in the class diagram) is designed to model a book's author. It
// contains:
class Author{
    // •Three private instance variables: name (String), email (String), and gender (char of either 'm' or 'f');
    private  String name;
    private  String email;
    private  char gender;
    // •One constructor to initialize the name, email and gender with the given values;
    // public Author (String name, String email, char gender) {......}
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // (There is no default constructor for Author, as there are no defaults for name, email and gender.)

    // •public getters/setters: getName(), getEmail(), setEmail(), and getGender();
    // •(There are no setters for name and gender, as these attributes cannot be changed.)
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // •A toString() method that returns "Author[name=?,email=?,gender=?]", e.g., "Author[name=Tan Ah
    // Teck,email=ahTeck@somewhere.com,gender=m]".
    public String toString(){
        return  "Author[name="+getName()+",email="+getEmail()+",gender="+getGender()+"]";
    }
}


//  Write also a class called Book is designed (as shown in the class diagram) to model a book written by one author.
class Book{
    //It contains:
    // •Four private instance variables: name (String), author (of the class Author you have just created,
    // assume that a book has one and only one author), price (double), and qty (int);
    private  String name;
    private  Author author;
    private  double price;
    private  int qty;
    // •Two constructors:
    // public Book (String name, Author author, double price) { ...... }
    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;

    }
    // public Book (String name, Author author, double price, int qty) { ...... }
    public Book (String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    // •public methods getName(), getAuthor(), getPrice(), getQty(), setPrice(), setQty().
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPrice(int qty){
        this.qty = qty;
    }
    // •A toString() that returns "Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?". You
    // should reuse Author’s toString().
    public String toString(){
        return   "Book[name="+getName()+","+author+",price="+getPrice()+",qty="+getQty()+"]";
    }
}
