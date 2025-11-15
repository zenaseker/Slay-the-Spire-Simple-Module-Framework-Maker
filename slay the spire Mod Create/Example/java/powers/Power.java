package powers;

import com.megacrit.cardcrawl.actions.common.RemoveSpecificPowerAction;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.localization.PowerStrings;
import com.megacrit.cardcrawl.powers.AbstractPower;

public class *{PowerID}* extends AbstractPower {
    public static final String Power_ID = "*{PowerID}*";
    private static final PowerStrings powerStrings = CardCrawlGame.languagePack.getPowerStrings(Power_ID);
    public static final String NAME = powerStrings.NAME;
    public static final String[] DESCRIPTIONS = powerStrings.DESCRIPTIONS;

    public void updateDescription() {
        this.description = DESCRIPTIONS[0].replaceAll("%d", String.valueOf(this.amount));
    }

    public *{PowerID}*(AbstractCreature owner, int amount) {
        this.name = NAME;
        this.ID = Power_ID;
        this.owner = owner;
        this.amount = amount;
        this.img = ImageMaster.loadImage("img/powers/*{PowerImg}*");
        updateDescription();

        this.type = PowerType.*{PowerType}*;
    }

*/Power_turnEnd/*
}
