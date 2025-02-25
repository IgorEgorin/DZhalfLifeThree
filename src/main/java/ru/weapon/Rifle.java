package ru.weapon;

import ru.orgis.Weapon;

public class Rifle extends Weapon {

    @Override
    public void shot() {
        super.shot();
        System.out.println(getClass().getSimpleName());
    }

}
