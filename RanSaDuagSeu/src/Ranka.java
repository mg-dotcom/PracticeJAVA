import java.text.DecimalFormat;

public class Ranka {
    private Sinka[] sinkas;
    private String name;
    private int sinkaCount;

    public Ranka(String name, int maxSinka) {
        this.name = name;
        this.sinkas = new Sinka[maxSinka];
        this.sinkaCount = 0;
    }

    public Sinka[] getSinkas() {
        return sinkas;
    }

    public void setSinkas(Sinka[] sinkas) {
        this.sinkas = sinkas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSinka(Sinka sinka){
        if(sinkaCount < sinkas.length){
            this.sinkas[sinkaCount] = sinka;
            sinkaCount++;
            System.out.println("Adding '"+sinka.getName()+"' sinka successed!");
        } else {
            System.out.println("Failed -- Ranka is full.");
        }
    }

    public int totalJamnuan(){
        return sinkaCount;
    }

    public String totalPrice(){
        double total = 0;
        for(int i = 0; i < sinkaCount; i++){
            total = total + sinkas[i].getPrice();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedNumber = decimalFormat.format(total);
        return formattedNumber;
    }

    public void findCategory(String category){
        boolean foundCTG = false;
        for(int i = 0; i < sinkaCount; i++){
            if(category.equals(sinkas[i].getCategory())) {
                foundCTG = true;
                System.out.println("\'" + category + "\'"+" - "+ sinkas[i].getName());
            }
        }
        if (!foundCTG) {
            System.out.println("Sorry, We don't have this in category.");
        }
    }

    public void showAllSinka(){
        for(int i = 0; i < sinkas.length; i++) {
            if(sinkas[i] != null){
                System.out.printf((i+1) + ". " + sinkas[i].getName()
                        + '\n' + "Category: " + sinkas[i].getCategory()
                        + '\n'+ "Price: %.2f฿",sinkas[i].getPrice());
                System.out.printf('\n'+"-------------------------------"+'\n');
            } else {
                System.out.println("You can add " + (sinkas.length-sinkaCount) + " more !");
                System.out.println("-------------------------------");
            }
        }
    }

    public void removeSinka(String nameSinka){
        boolean foundSinka = false;
        for(int i = 0; i < sinkaCount; i++){
            if(nameSinka.equals(sinkas[i].getName())){
                foundSinka = true;
                for(int j = i; j < sinkaCount-1; j++){
                    sinkas[j] = sinkas[j+1];
                }
                sinkas[sinkaCount -1] = null;
                sinkaCount--;
                System.out.println("This sinka has been remove");
            }
        } if (!foundSinka) {
            System.out.println("Sorry, We don't have this sinka.");
        }
    }


}
