public class Product {

    int totalProduct;
    public Product(){
        totalProduct=1;
    }

    public int productCalculator(){
        for(int loopCounter=1;loopCounter<=10 ;loopCounter++)
            totalProduct=totalProduct*loopCounter;

        return totalProduct;
    }

}
