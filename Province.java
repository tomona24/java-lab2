package lab2;

public class Province {
    private String provinceName;  // e.g. “British Columbia”
    private String capital;  // e.g. “Victoria”
    private long population;  // e.g. 2264823

    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final long DEFAULT_POPULATION = 4648055;

    // constructor
    public Province(String provinceName, String capital, long population) {
        if (isValidPopulation(population) && isValidProvince(provinceName)
                && isValidCapitalCity(capital)) {
            setName(provinceName);
            setCapital(capital);
            setPopulation(population);
        } else {
            setDefault();
        }
    }


    // setter
    public void setName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    private void setDefault() {
        this.population = DEFAULT_POPULATION; // 4,648,055
        this.provinceName = DEFAULT_PROVINCE; // “British Columbia”
        this.capital = DEFAULT_CAPITAL; // “Victoria”

    }

    // getter
    public String getProvince() {
        return this.provinceName;
    }

    public String getCapital() {
        return this.capital;
    }

    public long getPopulation() {
        return this.population;
    }


    // Methods
    private boolean isValidPopulation(long population) {
        if (population > 30_000 && population < 15_000_000) {
            return true;
        }
        return false;
    }

    private boolean isValidProvince(String province) {
        String[] provinceList = {
                "Alberta",
                "British Columbia",
                "Manitoba",
                "New Brunswick",
                "Newfoundland and Labrador",
                "Nova Scotia",
                "Ontario",
                "Prince Edward Island",
                "Quebec",
                "Saskatchewan"
        };

        for (int i = 0; i < provinceList.length; i++) {
            if (provinceList[i] == province) {
                return true;
            }
        }
        return false;
    }


    private boolean isValidCapitalCity(String capital) {
        String[] capitalList = {
                "Edmonton",
                "Victoria",
                "Winnipeg",
                "Fredericton",
                "St. John's",
                "Halifax",
                "Toronto",
                "Charlottetown",
                "Quebec City",
                "Regina"
        };

        for (int i = 0; i < capitalList.length; i++) {
            if (capitalList[i] == capital) {
                return true;
            }
        }
        return false;
    }

    public String getDetails() {
        return "The capital of " + getProvince() + " (population. " + getPopulation() + ") is " + getCapital() + ".";
    }
}
