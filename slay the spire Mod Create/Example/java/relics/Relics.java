package relics;
import basemod.abstracts.CustomRelic;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.relics.AbstractRelic;

public class *{RelicsID}* extends CustomRelic {
    public static final String ID = "*{RelicsID}*";
    private static final String IMG = "img/relics/*{RelicsImg}*";
    private static final String IMG_OTL = "img/relics/outline/*{RelicsOutImg}*";

    public *{RelicsID}*() {
        super(ID, ImageMaster.loadImage(IMG), ImageMaster.loadImage(IMG_OTL), RelicTier.*{RelicsTier}*, AbstractRelic.LandingSound.*{RelicsLandingSound}*);
    }

    @Override
    public String getUpdatedDescription() {
        return this.DESCRIPTIONS[0].replaceAll("%d", String.valueOf(this.counter));
    }

    @Override
    public AbstractRelic makeCopy() {
        return new *{RelicsID}*();
    }

}
