public class BonusMilesService {
    int calculate(int price) {
        int rubles = 20;
        int miles = price / rubles;

        return (int) miles;


    }
}

