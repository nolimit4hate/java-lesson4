package com.company;

public class Main {

    public static void main(String[] args) {

//test SuperUnit

        SuperUnit newUnit1 = new SuperUnit("Hawk", UnitType.CREEP);
        newUnit1.printUnit();

//test Roshan

        RoshanUnit newRoshan1 = new RoshanUnit();
        newRoshan1.printUnit();

//test Creep

        CreepUnit newCreep1 = new CreepUnit();
        newCreep1.printUnit();

//test HeroAgility
        // create spell caster what output casted spell
        Caster newCaster = new DefaultSpellCaster();

        HeroAgilityUnit newHeroAgility = new HeroAgilityUnit();
        newHeroAgility.printUnit();
        System.out.println(newCaster.castSpell(newHeroAgility));

//test HeroStrength
        HeroStrengthUnit newHeroStrength = new HeroStrengthUnit();
        newHeroStrength.printUnit();
        System.out.println(newCaster.castSpell(newHeroAgility));


    }
}
