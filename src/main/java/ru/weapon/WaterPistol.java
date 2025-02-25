package ru.weapon;

import ru.orgis.Weapon;

public class WaterPistol extends Weapon {

    @Override
    public void shot() {
        super.shot();
        System.out.println(getClass().getSimpleName());
    }

}
