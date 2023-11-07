package Figures;

import Contracts.CalculationContract;
import Exceptions.GreatherThanZeroException;
import Validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Validator implements CalculationContract {

    int sideALength;

    int sideBLength;

    int height;

    List<Integer> lengthsToValidate = new ArrayList<>();

    public void setSidesLength(int aLength, int bLength) throws GreatherThanZeroException {
        this.setSidesLength(aLength, bLength, 1);
    }

    public void setSidesLength(int aLength, int bLength, int height) throws GreatherThanZeroException {

        this.lengthsToValidate.add(aLength);
        this.lengthsToValidate.add(bLength);
        this.lengthsToValidate.add(height);

       validateLengthsWithException(this.lengthsToValidate);

        this.sideALength = aLength;
        this.sideBLength = bLength;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int circuit() {
        return Math.multiplyExact(this.sideALength, 2) + Math.multiplyExact(this.sideBLength, 2);
    }

    @Override
    public int field() {
        return Math.multiplyExact(this.sideALength, this.sideBLength);
    }

    public int capacity() {
        return this.sideALength * this.sideBLength * this.height;
    }

    public int area() {
        int firstSegment = 2 * this.sideALength * this.sideBLength;
        int secondSegment = 2 * this.sideALength * this.height;
        int thirdSegment = 2* this.sideBLength * this.height;

        return firstSegment + secondSegment + thirdSegment;
    }
}
