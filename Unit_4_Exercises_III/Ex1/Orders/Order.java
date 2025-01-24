package Second_Evaluation.Unit_4_Exercises_III.Ex1.Orders;

import Second_Evaluation.Unit_4_Exercises_III.Ex1.Items.Item;

public class Order {
    private Client client;
    private int orderNumber;
    private Item item;

    public Order(Client client, int orderNumber, Item item){
        this.client=client;
        this.orderNumber=orderNumber;
        this.item=item;
    }


    public void show(){
        System.out.print("Order[ "+ this.client.toString()+" order number: "+this.orderNumber+"]");
        this.item.show();
    }
}
