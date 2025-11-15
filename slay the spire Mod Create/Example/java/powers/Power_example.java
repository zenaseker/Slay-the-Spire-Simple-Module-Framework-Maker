package powers;

import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.localization.PowerStrings;
import com.megacrit.cardcrawl.powers.AbstractPower;

public class Power_example extends AbstractPower {
    public static final String POWER_ID = "Power_example";
    private static final PowerStrings powerStrings = CardCrawlGame.languagePack.getPowerStrings("Power_example");
    public static final String NAME = powerStrings.NAME;
    public static final String[] DESCRIPTIONS = powerStrings.DESCRIPTIONS;

    public void updateDescription() {
        this.description = DESCRIPTIONS[0] + this.amount + DESCRIPTIONS[1];
    }

    public Power_example(AbstractCreature owner, int amount) {
        this.name = NAME;
        this.ID = "Power_example";
        this.owner = owner;
        this.amount = amount;
        this.img = ImageMaster.loadImage("img/powers/Power_example.png");
        updateDescription();

        this.type = PowerType.BUFF;
    }


    public void reducePower(int reduceAmount) {
        updateDescription();
    }

    public void stackPower(int stackAmount) {
        this.amount += stackAmount;
        this.fontScale = 8.0F;
        updateDescription();
    }
}
