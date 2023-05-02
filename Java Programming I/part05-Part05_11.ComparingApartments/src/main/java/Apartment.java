
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int thisTotalArea, comparedTotalArea;
        thisTotalArea = this.rooms * this.squares;
        comparedTotalArea = compared.rooms() * compared.squares();

        return thisTotalArea > comparedTotalArea;
    }

    public int priceDifference(Apartment compared) {
        int thisTotalPrice, comparedTotalPrice, priceDiff = 0;
        thisTotalPrice = this.princePerSquare * this.squares;
        comparedTotalPrice = compared.princePerSquare() * compared.squares();

        priceDiff = thisTotalPrice - comparedTotalPrice;

        if (priceDiff < 0) {
            priceDiff = priceDiff * -1;
        }

        return priceDiff;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisTotalPrice, comparedTotalPrice;
        thisTotalPrice = this.princePerSquare * this.squares;
        comparedTotalPrice = compared.princePerSquare() * compared.squares();

        return thisTotalPrice > comparedTotalPrice;
    }

    public int rooms() {
        return this.rooms;
    }

    public int squares() {
        return this.squares;
    }

    public int princePerSquare() {
        return this.princePerSquare;
    }

}
