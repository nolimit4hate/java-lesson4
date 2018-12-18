package com.company;

public class HeroAgilityUnit extends HeroUnit {
    /**
     * Agility hero is one of the hero type
     *
     * @heroAgility improve some standard abilities(hero damage, hero speed)
     */

    private int heroAgility;

    public HeroAgilityUnit(String nameHeroAgilityUnit, int heroAgility) {
        super(nameHeroAgilityUnit);
        this.heroAgility = heroAgility;

        /**
         * some random logic that improve hero ability by heroAgility
         * unit hp improve by heroSpeed / 2
         * unit damage improve by heroAgility / 3
         */
        this.setUnitSpeed(this.getUnitSpeed() + (int) (this.heroAgility / 2));
        this.setUnitDamage(this.getUnitDamage() + (int) (this.heroAgility / 3));
        this.setHeroSpell();
    }

    public HeroAgilityUnit(String nameHeroAgilityUnit) {
        // default heroAgility is 50
        this(nameHeroAgilityUnit, 50);

    }

    public HeroAgilityUnit() {
        this("DefaultHeroAgillity");
    }

    public int getHeroAgility() {
        return heroAgility;
    }

    public void setHeroAgility(int heroAgility) {
        this.heroAgility = heroAgility;
    }

    @Override
    public void setHeroSpell() {
        this.setSpellName(SpellName.FIREFLY);
    }

    @Override
    public String toString() {
        return super.toStringZero() +
                ", Agility is " + this.heroAgility +
                '}';
    }
}
