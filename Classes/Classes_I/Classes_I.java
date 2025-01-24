package Second_Evaluation.Classes.Classes_I;

public class Classes_I {
    //Attributes
        private double price;
        private int amount;
        private String name;
    //Constructors
        public Classes_I(double price, int amount, String name) {
            this.price = price;
            this.amount = amount;
            this.name = name;
        }

    //Getters and setters
        public double getPrice(){
            return this.price;
        }
        public int getAmount(){
        return this.amount;
        }
        public String getName(){
        return this.name;
        }
        public boolean equals(Classes_I p) {
            if (p.getAmount() == this.amount && p.getName() == this.name && p.getPrice() == this.price) {
                return true;
            } else {
                return false;
            }
        }

    //Methods
        public void printProduct(){
            System.out.println(this.name +", price " +this.price +", amount " +this.amount );
        }
}
