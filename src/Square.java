import Contracts.CalculationContract;

public class Square implements CalculationContract {

    int sideLength;

    public void setSideLength(int length) {
        this.sideLength = length;
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
