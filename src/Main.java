
public class Main {
    static int volume;
    static int consumption;
    static double remainder;
    static double distance;
    static double neededForNkm;
    static String rounderNeededForNkm;
    static double remainderAfterNkn;
    static String rouderRemainderAfterNkn;
    static double fullTank;
    static String rouderFullTank;
    static calCar service;
    static double cost;
    static String rouderCost;
    final static double priceA95 = 45.74;

    public static void main(String[] args) {
        Car car = new Car();
        car.setVolume(15);
        car.setConsumption(7); // расход
        car.setRemainder(15); //остаток
        car.setDistance(178.5);

        volume = car.getVolume();
        consumption = car.getConsumption();
        remainder = car.getRemainder();
        distance = car.getDistance();

        service = new calCar();
        neededForNkm = service.calNeededForNkm(consumption, distance);
        rounderNeededForNkm = Rounder.roundValue(neededForNkm);
        remainderAfterNkn = service.calRemainder(remainder, neededForNkm);
        rouderRemainderAfterNkn = Rounder.roundValue(remainderAfterNkn);
        fullTank = service.getFuel(volume, remainderAfterNkn);
        rouderFullTank = Rounder.roundValue(fullTank);


        System.out.println("Одеса-Криве Озеро" + '\n' + "Відстань: " + distance + " km" + '\n'+ "Потрібно бензину: " +
                rounderNeededForNkm + '\n' + "Залишилося бензину: " + rouderRemainderAfterNkn + " l" + '\n' + "Залити повний бак: " +
                rouderFullTank + " l");

        Car car1 = new Car();
        car1.setVolume(15);
        car1.setConsumption(7);
        car1.setRemainder(15);
        car1.setDistance(152.8);

        volume = car1.getVolume();
        consumption = car1.getConsumption();
        remainder = car1.getRemainder();
        distance = car1.getDistance();

        service = new calCar();
        neededForNkm = service.calNeededForNkm(consumption, distance);
        rounderNeededForNkm = Rounder.roundValue(neededForNkm);
        remainderAfterNkn = service.calRemainder(remainder, neededForNkm);
        rouderRemainderAfterNkn = Rounder.roundValue(remainderAfterNkn);
        fullTank = service.getFuel(volume, remainderAfterNkn);
        rouderFullTank = Rounder.roundValue(fullTank);

        System.out.println();

        System.out.println("Криве Озеро -  Жашків " + '\n' + "Відстань: " + distance + " km" + '\n'+ "Потрібно бензину: " +
                rounderNeededForNkm + '\n' + "Залишилося бензину: " + rouderRemainderAfterNkn + " l" + '\n' + "Залити повний бак: " +
                rouderFullTank + " l");

        Car car2 = new Car();
        car2.setVolume(15);
        car2.setConsumption(7);
        car2.setRemainder(15);
        car2.setDistance(148.2);

        volume = car2.getVolume();
        consumption = car2.getConsumption();
        remainder = car2.getRemainder();
        distance = car2.getDistance();

        service = new calCar();
        service = new calCar();
        neededForNkm = service.calNeededForNkm(consumption, distance);
        rounderNeededForNkm = Rounder.roundValue(neededForNkm);
        remainderAfterNkn = service.calRemainder(remainder, neededForNkm);
        rouderRemainderAfterNkn = Rounder.roundValue(remainderAfterNkn);
        fullTank = service.getFuel(volume, remainderAfterNkn);
        rouderFullTank = Rounder.roundValue(fullTank);

        System.out.println();

        System.out.println("Жашків - Київ" + '\n' + "Відстань: " + distance + " km" + '\n'+ "Потрібно бензину: " +
                rounderNeededForNkm + '\n' + "Залишилося бензину: " + rouderRemainderAfterNkn + " l" + '\n' + "Залити повний бак: " +
                rouderFullTank + " l");

        cost = service.calPrice(priceA95, neededForNkm);
        rouderCost = Rounder.roundValue(cost);

        System.out.println();

        System.out.println("Вартість маршруту Одеса – Київ: " + rouderCost + " UAN" + '\n' + "Залишок палива у пункті призначення: " +
                rouderRemainderAfterNkn + " l");

    }
}

