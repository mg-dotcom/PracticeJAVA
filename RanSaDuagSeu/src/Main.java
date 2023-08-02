public class Main {
    public static void main(String[] args) {

       Sinka sinka1 = new Sinka("Lays",30.0,"Chips");
       Sinka sinka2 = new Sinka("Chocco Pie",15.0,"Dessert");
       Sinka sinka3 = new Sinka("Mix Fruit Juice",14.50,"Juice");
       Sinka sinka4 = new Sinka("Muffin",10.0,"Dessert");
       //Not yet add
       Sinka sinka5 = new Sinka("Sing Water",7.0,"Water");

       Ranka ranka1 = new Ranka("MGRanka",5);

       ranka1.addSinka(sinka1);
       ranka1.addSinka(sinka2);
       ranka1.addSinka(sinka3);
       ranka1.addSinka(sinka4);

       System.out.println();

       ranka1.showAllSinka();
       System.out.println();
       System.out.println("Total: "+ranka1.totalPrice()+"฿");

       System.out.println();
       ranka1.findCategory("Dessert");
       ranka1.findCategory("Instant Noodles");

       System.out.println();
       ranka1.removeSinka("Lays");
       ranka1.removeSinka("Muffin");
       System.out.println();
       ranka1.showAllSinka();

       System.out.println();
       System.out.println("Total: "+ranka1.totalPrice()+"฿");
    }
}