public class MoneyCalculator {

    int initialAmount;
  public   MoneyCalculator(){
      initialAmount=1000;
  }

    public double firstYear(){
        double result;
        result = initialAmount*1*0.05;
        result=result+initialAmount;

        return result;
    }
    public double secondYear(){
        double result;
        result = initialAmount*2*0.05;
        result=result+initialAmount;
        return result;
    }
    public double thirdtYear(){
        double result;
        result = initialAmount*3*0.05;
        result=result+initialAmount;

        return result;
    }

}
