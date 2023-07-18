public class Sum {

    int totalSum;
    public Sum() {
    totalSum=0;
    }
    public int summation(){
        for(int loopCounter=0; loopCounter<=10;loopCounter++ )
            totalSum=totalSum+loopCounter;

        return totalSum;
    }
}
