package com.company;

public class BaseUnit {
    /**
     * @param UNIT_MAGIC_NUMBER is special number. Unit hit point, mana point, speed, damage
     * depends of this special number
     * @param unitName is name of unit
     * @param unitType is type of unit. unitType is ENUM.
     * @param unitHP is hit Point of unit
     * @param unitMana is mana point of unit
     * @param unitSpeed is speed of unit
     * @param unitDamage is damage of unit
     */
    private int UNIT_MAGIC_NUMBER;
    private String unitName;
    private UnitType unitType;
    private int unitHP;
    private int unitMana;
    private int unitSpeed;
    private int unitDamage;

    public BaseUnit(String unitName, UnitType unitType, int UNIT_MAGIC_NUMBER) {
        this.unitName = unitName;
        this.unitType = unitType;
        this.UNIT_MAGIC_NUMBER = UNIT_MAGIC_NUMBER;
        this.unitHP = this.UNIT_MAGIC_NUMBER * 5;
        this.unitMana = this.UNIT_MAGIC_NUMBER * 2;
        this.unitSpeed = this.UNIT_MAGIC_NUMBER * 3;
        this.unitDamage = (int) (this.UNIT_MAGIC_NUMBER / 2);
    }

    public BaseUnit(String unitName, UnitType unitType) {
        /**
         * Default UNIT_MAGIC_NUMBER is 100
         */
        this(unitName, unitType, 100);
    }

    public BaseUnit() {
        this("DefaultUnitName", UnitType.HERO);
    }

    /**
     * @return typically string without ending this string character '}'
     */

    public String toStringZero() {
        return this.getClass().getName() + '{' +
                "UNIT_MAGIC_NUMBER=" + UNIT_MAGIC_NUMBER +
                ", unitName='" + unitName + '\'' +
                ", unitType=" + unitType +
                ", unitHP=" + unitHP +
                ", unitMana=" + unitMana +
                ", unitSpeed=" + unitSpeed +
                ",\n unitDamage=" + unitDamage;
    }

    /**
     * @return add to string character '}'
     */
    @Override
    public String toString() {
        return this.toStringZero() + '}';
    }

    public int getUNIT_MAGIC_NUMBER() {
        return UNIT_MAGIC_NUMBER;
    }

    public void setUNIT_MAGIC_NUMBER(int MAGIC_NUMBER) {
        this.UNIT_MAGIC_NUMBER = MAGIC_NUMBER;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public int getUnitHP() {
        return unitHP;
    }

    public void setUnitHP(int unitHP) {
        this.unitHP = unitHP;
    }

    public int getUnitMana() {
        return unitMana;
    }

    public void setUnitMana(int unitMana) {
        this.unitMana = unitMana;
    }

    public int getUnitSpeed() {
        return unitSpeed;
    }

    public void setUnitSpeed(int unitSpeed) {
        this.unitSpeed = unitSpeed;
    }

    public int getUnitDamage() {
        return unitDamage;
    }

    public void setUnitDamage(int unitDamage) {
        this.unitDamage = unitDamage;
    }
}
