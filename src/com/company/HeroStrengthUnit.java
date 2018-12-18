package com.company;

public class HeroStrengthUnit extends HeroUnit {

    /**
     * Strength hero is one of the hero type
     *
     * @heroStrength improve some standard abilities(hero hit point, hero damage)
     */
    private int heroStrength;

    public HeroStrengthUnit(String nameHeroStrengthUnit, int heroStrength) {
        super(nameHeroStrengthUnit);
        this.heroStrength = heroStrength;

        /**
         * some random logic that improve hero ability by heroStrength
         * unit hp improve by heroStrength * 4
         * unit damage improve by heroStrength / 5
         */

        this.setUnitHP(this.getUnitHP() + this.heroStrength * 4);
        this.setUnitDamage(this.getUnitDamage() + (int) (this.heroStrength / 5));
        // give hero a spell
        this.setHeroSpell();
    }

    public HeroStrengthUnit(String nameHeroStrengthUnit) {
        // default hero strength is 50
        this(nameHeroStrengthUnit, 50);
    }

    HeroStrengthUnit() {
        this("DefaultHeroStrength");
    }

    public int getHeroStrength() {
        return heroStrength;
    }

    public void setHeroStrength(int heroStrength) {
        this.heroStrength = heroStrength;
    }

    @Override
    public void setHeroSpell() {
        this.setSpellName(SpellName.FIREFLY);
    }

    @Override
    public String toString() {
        return super.toStringZero() +
                ", heroStrength=" + this.getHeroStrength() +
                '}';
    }
}
