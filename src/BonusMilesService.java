public class BonusMilesService {
    public int calculate(int cost) {

        int bonusMiles = 20;
        int totalBonus = cost / bonusMiles;

        return totalBonus;
    }
}
