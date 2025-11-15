package potion;

import basemod.ReflectionHacks;
import basemod.abstracts.CustomPotion;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.helpers.PowerTip;
import com.megacrit.cardcrawl.localization.PotionStrings;
import com.megacrit.cardcrawl.potions.AbstractPotion;
import com.megacrit.cardcrawl.powers.BufferPower;

public class *{PotionID}* extends CustomPotion {
    public static final String ID = "*{PotionID}*";
    private static final PotionStrings potionStrings = CardCrawlGame.languagePack.getPotionString(ID);

    public *{PotionID}*() {
        super(potionStrings.NAME, ID, PotionRarity.*{PotionRarity}*, PotionSize.*{PotionSize}*, PotionColor.*{PotionColor}*);
        this.potency = getPotency();
        this.description = potionStrings.DESCRIPTIONS[0] + this.potency;
        ReflectionHacks.setPrivate(this, AbstractPotion.class, "containerImg", new Texture("img/potion/*{PotionImg}*.png"));
        ReflectionHacks.setPrivate(this, AbstractPotion.class, "outlineImg", new Texture("img/potion/*{PotionOutImg}*.png"));
        ReflectionHacks.setPrivate(this, AbstractPotion.class, "liquidImg", null);
        ReflectionHacks.setPrivate(this, AbstractPotion.class, "hybridImg", null);
        ReflectionHacks.setPrivate(this, AbstractPotion.class, "spotsImg", null);
        this.isThrown = *{PotionisThrown}*;
        this.targetRequired = *{PotiontargetRequired}*;
        this.tips.add(new PowerTip(this.name, this.description));
    }

    public void use(AbstractCreature target) {
    }

    public AbstractPotion makeCopy() {
        return new *{PotionID}*();
    }
    public int getPotency(int potency) {
        return *{PotionPotency}*;
    }
}

