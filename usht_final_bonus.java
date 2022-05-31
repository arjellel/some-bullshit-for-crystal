// You are asked to write a discount system for a beauty saloon, which provides services and sells beauty
// products. It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver
// members receive a discount of 20%, 15%, and 10%, respectively, for all services provided. Customers
// without membership receive no discount. All members receives a flat 10% discount on products
// purchased (this might change in future). Your system shall consist of three classes: Customer, Discount
// and Visit, as shown in the class diagram. It shall compute the total bill if a customer purchases $x of
// products and $y of services, for a visit. Also write a test program to exercise all the classes.

class Costumer{
    private String name;
    private boolean member;
    private String memberType;

    public Costumer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }
    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    public String toString(){
        return "Costumer[name="+getName()+",member="+isMember()+",memberType="+getMemberType()+"]";
    }

}

class Visit{
    private Costumer costumer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    DiscountRate discountRate = new DiscountRate();

    public Visit(Costumer costumer, Date date){
        this.costumer = costumer;
        this.date = date;
    }
    public String getName(){
        return costumer.getName();
    }
    public double getServiceExpense(){
        return serviceExpense;
    }
    public void setServiceExpense(double serviceExpense ){
        
        if(costumer.isMember()) serviceExpense = serviceExpense * (1-discountRate.getServiceDiscountRate(costumer.getMemberType()));
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public void setProductExpense(double productExpense ){
        if(costumer.isMember()) productExpense = productExpense * (1-discountRate.getProductDiscountRate(costumer.getMemberType()));
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return getServiceExpense()+getProductExpense();
    }
    public String toString(){
        return "Visit[costumer="+costumer+",date="+date+",serviceExpense="+getServiceExpense()+",productExpense="+getProductExpense()+"]";
    }
}
class DiscountRate{
    static double serviceDiscountPremium=0.2;
    static double serviceDiscountGold=0.15;
    static double serviceDiscountSilver=0.1;
    static double prudctDiscountPremium=0.1;
    static double prudctDiscountGold=0.1;
    static double prudctDiscountSilver=0.1;

    public double getServiceDiscountRate(String type){
        if(type.equals("premium")){
            return serviceDiscountPremium;
        }else if(type.equals("gold")){
            return serviceDiscountGold;
        }else if(type.equals("silver")){
            return serviceDiscountSilver;
        }else {
            return 0.0;
        }
        
    }
    public double getProductDiscountRate(String type){
        if(type.equals("premium")){
            return prudctDiscountPremium;
        }else if(type.equals("gold")){
            return prudctDiscountGold;
        }else if(type.equals("silver")){
            return prudctDiscountSilver;
        }else {
            return 0.0;
        }
        
    }
}



public class final_usht {
    
    public static void main(String[] arr){
        Costumer c = new Costumer("arjel fasliu");
        c.setMember(true);
        c.setMemberType("premium");
        System.out.println(c);
        Visit v = new Visit(c, new Date());
        v.setServiceExpense(100);
        v.setProductExpense(100);
        System.out.println(v);
    }
}
