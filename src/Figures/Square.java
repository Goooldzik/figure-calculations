package Figures;

import Contracts.CalculationContract;
import Exceptions.GreatherThanZeroException;
import Validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class Square extends Validator implements CalculationContract {

    int sideLength;

    List<Integer> lengthsToValidate = new ArrayList<>();

    public void setSideLength(int sideLength) throws GreatherThanZeroException {
        this.lengthsToValidate.add(sideLength);

        validateLengthsWithException(this.lengthsToValidate);

        this.sideLength = sideLength;
    }

    public int circuit() {
        return Math.multiplyExact(this.sideLength, 4);
    }

    public int field() {
        return (int) Math.pow(this.sideLength, 2);
    }

    public int capacity() {
        return (int) Math.pow(this.sideLength, 3);
    }

    public int area() {
        return Math.multiplyExact(
                6, (int) Math.pow(sideLength, 2)
        );
    }

}
