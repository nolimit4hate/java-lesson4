package com.company;

public class Main {

    public static void main(String[] args) {
//test Roshan

        RoshanUnit newRoshan1 = new RoshanUnit();
        System.out.println(newRoshan1.toString());

//test Creep

        CreepUnit newCreep1 = new CreepUnit();
        System.out.println(newCreep1.toString());
        ;

//test HeroAgility
        // create spell caster what output casted spell
        Caster newCaster = new DefaultSpellCaster();

        HeroAgilityUnit newHeroAgility = new HeroAgilityUnit();
        System.out.println(newHeroAgility.toString());
        System.out.println(newCaster.castSpell(newHeroAgility));

//test HeroStrength
        HeroStrengthUnit newHeroStrength = new HeroStrengthUnit();
        System.out.println(newHeroStrength.toString());
        System.out.println(newCaster.castSpell(newHeroAgility));
//test HeroSpellCast on Creep
        newCaster.spellCastChangeUnit(newHeroAgility, newCreep1);
        System.out.println(newHeroAgility.toString());
        System.out.println(newCreep1.toString());
        newCaster.spellCastChangeUnit(newHeroAgility, newCreep1);
    }
}
