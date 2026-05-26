class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        // Sort descending by units per box
        for (int i = 0; i < boxTypes.length; i++) {
            for (int j = i + 1; j < boxTypes.length; j++) {

                if (boxTypes[i][1] < boxTypes[j][1]) {
                    int[] temp = boxTypes[i];
                    boxTypes[i] = boxTypes[j];
                    boxTypes[j] = temp;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {

            int boxes = Math.min(boxTypes[i][0], truckSize);

            sum += boxes * boxTypes[i][1];

            truckSize -= boxes;
        }

        return sum;
    }
}