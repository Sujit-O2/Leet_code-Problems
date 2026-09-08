class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int a = 0; a < drones.length; a++) {
            int[] drone = drones[a];

            int distance = Math.abs(drone[0] - target[0])
                         + Math.abs(drone[1] - target[1]);

            if (distance <= drone[2]) {
                if (distance < minDistance) {
                    minDistance = distance;
                    min = a;
                }
            }
        }

        return min;
    }
}