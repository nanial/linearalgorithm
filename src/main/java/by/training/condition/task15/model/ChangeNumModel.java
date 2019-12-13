package by.training.condition.task15.model;

public class ChangeNumModel {

    public float getHalfSum(float x, float y){

        return  (x + y) / 2;
    }
    public float getDoubleMultypl(float x, float y){

        return x * y * 2;
    }
    public float[] changeNumbers(float x, float y){

        float[] arr = new float[2];

        if(x < y){
            arr[0] = getHalfSum(x, y);
            arr[1] = getDoubleMultypl(x, y);
        }
        else {
            arr[0] = getDoubleMultypl(x, y);
            arr[1] = getHalfSum(x, y);
        }
        return arr;
    }
}
