package ua.goit.practice.firstpractice.StabilityPeriod;

public class StabilityPeriod {
    private static double[] gdp2015USA = {17964.0, 17965, 2, 17964, 1, 179670, 0, 17967, 5, 17968, 1,
            17969.0, 17969, 5, 17968, 9, 17967, 2, 17965, 9, 17966, 8};

    public static double countPeriod(double[] gdp) {
        double min = gdp[0];
        double max = gdp[0];
        int period = 1;
        int maxPeriod = 1;
        boolean exit = false;

            for (int i = 1; i < gdp.length; i++){
                if(Math.abs((gdp[i] - gdp[i - 1])) <= 1) {
                    period++;
                    min = Math.min(gdp[i], min);
                    max = Math.max(gdp[i], max);
                } else {
                    if (exit) return maxPeriod;
                    if (i == gdp.length - 1) exit = true;
                    period = 1;
                    max = gdp[i];
                    min = gdp[i];
                   while (Math.abs(gdp[i - 1] - max) <= 1 && i > 0 && Math.abs(gdp[i - 1] - min) <= 1) {
                        max = Math.max(gdp[i - 1], max);
                        min = Math.min(gdp[i - 1], min);
                        i--;
                    }
                }
                if (period > maxPeriod) maxPeriod = period;
                i++;
            }
        return maxPeriod;
    }

    public static void main(String[] args) {
        System.out.println("Maximum period of stability in USA 2015 is " + countPeriod(gdp2015USA));
    }
}
