package OOP.Bank;

import java.util.Optional;

public class Urliza  extends Client {
    private int addSum;

    Urliza(){}
    Urliza(int sum){
        super(sum);
    }

    @Override
    public void snyat(int operationSum) {
        if(operationSum<0){
            throw new NonPositiveArgumentExeption(operationSum);
        }
        if( operationSum>super.getSum()){
            throw new RangeArgumetExeption(operationSum);
        }
        super.setSum((int) ((super.getSum()-operationSum)*0.99));



    }

    @Override
    public void pologit(int operationSum) {
        if(operationSum<0){
            throw new NonPositiveArgumentExeption(operationSum);
        }

      addSum=addSum+operationSum;
       int res= addSum/30000;
        if(res>0) {
            super.setSum((int) (super.getSum() + operationSum) +(res*1000));
        }

    }

    @Override
    public void obnulit(int sum) {

    }
}
