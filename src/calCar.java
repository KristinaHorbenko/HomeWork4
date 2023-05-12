public class calCar {
    double  calNeededForNkm (int consumption, double distance) {
        return consumption * distance/100;
    }
    double calRemainder (double remainder,  double neededForNkm) {
        return remainder - neededForNkm;

    }
    double getFuel(int volume, double remainderAfterNkn) {

        return volume - remainderAfterNkn;
    }

    double calPrice(double priceA95, double neededForNkm) {
        return (neededForNkm + neededForNkm + neededForNkm) * priceA95;


    }

}



