class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int maxHealth = health;
        int bandageTime = bandage[0], healPerSecond = bandage[1], extraHeal = bandage[2];

        int previousAttackTime = 0;
        int continuousHealTime = 0;

        for (int[] attack : attacks) {
            int attackTime = attack[0], damage = attack[1];
            int recoveryTime = attackTime - previousAttackTime - 1;

            if (recoveryTime > 0) {
                int fullCycles = recoveryTime / bandageTime;
                int remainingTime = recoveryTime % bandageTime;

                int totalHeal = (fullCycles * (bandageTime * healPerSecond + extraHeal)) 
                    + (remainingTime * healPerSecond);

                currentHealth = Math.min(maxHealth, currentHealth + totalHeal);
            }

            currentHealth -= damage;
            if (currentHealth <= 0) return -1;

            previousAttackTime = attackTime;
        }

        return currentHealth;
    }
}
