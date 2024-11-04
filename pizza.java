

public class pizza  {
    private int price;
    private boolean veg;

    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int backPacking=20;

    public int pizzaBasePrice;
    
    public boolean isExtraCheeseAdded=false;
    public boolean isExtraToppingsAdded=false;
    public boolean isBackPacking=false;
    public pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        pizzaBasePrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price+=extraToppingsPrice;

    }
    
    public void addBackPacking(){
        isBackPacking=true;
        this.price+=backPacking;

    }
    
    public void getBill(){
        String bill="";
        if(isExtraCheeseAdded){
            bill="Extra Cheese Added :"+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill="Extra Toppings Added :"+extraToppingsPrice+"\n";
        }
        if(isBackPacking){
            bill="Back Packing :"+backPacking+"\n";
        }
        bill +="bill :"+this.price+"\n";
        System.out.println(bill);
    }
    public static void main(String args[]){
        pizza order=new pizza(true);
        order.addBackPacking();
        order.getBill();
    }
}
