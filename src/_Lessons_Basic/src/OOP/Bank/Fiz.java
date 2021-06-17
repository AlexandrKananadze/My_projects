package OOP.Bank;

public class Fiz extends Client {

Fiz(){}

Fiz(int sum){
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
        super.setSum(super.getSum()-operationSum);
    }


    @Override
    public void pologit(int operationSum) {
        if(operationSum<0){
            throw new NonPositiveArgumentExeption(operationSum);
        }
        if( operationSum>super.getSum()){
            throw new RangeArgumetExeption(operationSum);
        }
       super.setSum(super.getSum()+operationSum);
    }

    @Override
    public void obnulit(int operationSum) {
        if(operationSum<0){
            throw new NonPositiveArgumentExeption(operationSum);
        }
        if( operationSum>super.getSum()){
            throw new RangeArgumetExeption(operationSum);
                }
        if (operationSum==super.getSum()){
        super.setSum(0);}

}
}

