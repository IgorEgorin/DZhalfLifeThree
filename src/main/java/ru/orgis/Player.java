package ru.orgis;

import ru.weapon.*;

public class Player {

    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[] {

                new Pistol(),
                new Rifle(),
                new Rpg(),
                new Slingshot(),
                new WaterPistol(),

        };

    }
    public int getSlotsCount(){
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot){

        if (slot == -1) {
            System.out.println("Quit a program");
        } else if (getSlotsCount() <= slot){
            System.out.println("Index out of limit");
        } else if (getSlotsCount() > slot) {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }

}
