package com.company;

public class Towers {

    public int numDisks;
    public int [] tower;
    public int counter;

    public Towers (int num){
        numDisks = num;
        tower = new int[num];
        for(int i = 0; i < tower.length; i++) {
            tower[i] = 1;
        }
        counter = 0;
    }

    public void solve () {
        for (int i = 1; i <= numDisks; i++) {
            moveDisks(i);
        }
    }

    public void moveDisks (int disksOnTower) {
        if (disksOnTower > 0) {
            counter++;
            System.out.print("(" + counter + ") Move a disk from Tower " + tower[disksOnTower - 1] + " to Tower ");
            tower[disksOnTower - 1] = (tower[disksOnTower - 1] + (numDisks % 2 == disksOnTower % 2 ? -1 : 1) + 3) % 3;
            if(tower[disksOnTower - 1] == 0) {
                tower[disksOnTower - 1] = 3;
            }
            System.out.println(tower[disksOnTower - 1]);
            for (int i = 1; i < disksOnTower; i++) {
                moveDisks(i);
            }
        }
    }
}