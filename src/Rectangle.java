import Contracts.CalculationContract;

public class Rectangle implements CalculationContract {

    int sideALength;

    int sideBLength;

    public void setSideALength(int length) {
        this.sideALength = length;
    }

    public void setSideBLength(int length) {
        this.sideBLength = length;
    }

    @Override
    public int circuit() {

        return Math.multiplyExact(this.sideALength, 2) + Math.multiplyExact(this.sideBLength, 2);

    }

    @Override
    public int field() {

        return Math.multiplyExact(this.sideALength, this.sideBLength);

    }

    public int capacity(int height) {

        return this.sideALength * this.sideBLength * height;

    }

    public int area(int height) {

        int firstSegment = 2 * this.sideALength * this.sideBLength;
        int secondSegment = 2 * this.sideALength * height;
        int thirdSegment = 2* this.sideBLength * height;

        return firstSegment + secondSegment + thirdSegment;

    }
}
