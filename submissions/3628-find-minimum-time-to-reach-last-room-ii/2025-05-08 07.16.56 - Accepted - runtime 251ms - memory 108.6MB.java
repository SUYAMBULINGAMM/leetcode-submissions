
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        // Store the input moveTime in a variable named roomMoveTime
        int[][] roomMoveTime = moveTime;  
        int totalRows = roomMoveTime.length;
        int totalCols = roomMoveTime[0].length;

        // Priority queue to store (current_time, row, col, step_cost)
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        priorityQueue.offer(new int[]{0, 0, 0, 1});  // Start at (0, 0) with time 0 and step cost 1
        
        int[][] minimumArrivalTime = new int[totalRows][totalCols];
        for (int[] row : minimumArrivalTime) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minimumArrivalTime[0][0] = 0;

        // Directions for adjacent rooms (down, up, right, left)
        int[][] adjacentDirections = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!priorityQueue.isEmpty()) {
            int[] currentState = priorityQueue.poll();
            int currentTime = currentState[0], currentRow = currentState[1], currentCol = currentState[2], currentStepCost = currentState[3];

            // If we reached the target room (totalRows - 1, totalCols - 1)
            if (currentRow == totalRows - 1 && currentCol == totalCols - 1) {
                return currentTime;
            }

            // Explore adjacent rooms
            for (int[] direction : adjacentDirections) {
                int nextRow = currentRow + direction[0];
                int nextCol = currentCol + direction[1];

                if (nextRow >= 0 && nextRow < totalRows && nextCol >= 0 && nextCol < totalCols) {
                    int waitTime = Math.max(roomMoveTime[nextRow][nextCol] - currentTime, 0);
                    int newArrivalTime = currentTime + currentStepCost + waitTime;

                    // Only push to the queue if we found a better arrival time
                    if (newArrivalTime < minimumArrivalTime[nextRow][nextCol]) {
                        minimumArrivalTime[nextRow][nextCol] = newArrivalTime;
                        int nextStepCost = (currentStepCost == 2) ? 1 : 2;
                        priorityQueue.offer(new int[]{newArrivalTime, nextRow, nextCol, nextStepCost});
                    }
                }
            }
        }

        return -1; // Return -1 if the target room is unreachable
    }
}