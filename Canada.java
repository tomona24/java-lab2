package lab2;

public class Canada {
    private Province[] provinces;

    public Canada() {
        this.provinces = new Province[]{
                new Province("Alberta", "Edmonton", 4067175),
                new Province("British Columbia", "Victoria", 4648055),
                new Province("Manitoba", "Winnipeg", 1278365),
                new Province("New Brunswick", "Fredericton", 747101),
                new Province("Newfoundland and Labrador", "St. John's", 519716),
                new Province("Nova Scotia", "Halifax", 971395),
                new Province("Ontario", "Toronto", 13448494),
                new Province("Prince Edward Island", "Charlottetown", 142907),
                new Province("Quebec", "Quebec City", 8164361),
                new Province("Saskatchewan","Regina",1098352)
        };
    }

    //     methods
    public void displayAllProvinces() {
        for (Province item : this.provinces) {
            System.out.println(item.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int count = 0;
        for (Province item : this.provinces) {
            if (item.getPopulation() >= min * 1_000_000 && item.getPopulation() <= max * 1_000_000) {
                count++;
            }
        }
        return count;
    }
}
