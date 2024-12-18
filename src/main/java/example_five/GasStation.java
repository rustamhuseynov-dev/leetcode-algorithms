package example_five;


public class GasStation {
    public static void main(String[] args) {
        int[] gas = new int[]{2,3,4}; //hər stansiyanın təklif etdiyi qaz miqdarı
        int[] cost = new int[]{3,4,3};//hər stansiyadan növbəti stansiyaya keçmək üçün lazım olan qaz miqdarı
        int result = calculate(gas,cost);
        System.out.println(result);
    }

    private static int calculate(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                startStation = i + 1;
                currentGas = 0;
            }
        }

        return totalGas >= totalCost ? startStation : -1;
    }


}
