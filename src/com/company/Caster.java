package com.company;

public interface Caster {
    String castSpell(HeroUnit heroUnit);
    int changeManaSpell(HeroUnit heroUnit);
    int changeHPSpell(BaseUnit baseUnit);
    int changeStatus(CreepUnit creepUnit);
}
