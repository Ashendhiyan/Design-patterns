package lk.ijse.behavioural.strategy;

public class SubstractOperation implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
