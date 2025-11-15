package actions;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.helpers.GetAllInBattleInstances;
import com.megacrit.cardcrawl.localization.UIStrings;

import java.util.UUID;

public class Action_example

        extends AbstractGameAction {
    UUID uuid;
    private static final UIStrings uiStrings = CardCrawlGame.languagePack.getUIString("UI_example");
    public static final String[] TEXT = uiStrings.TEXT;
    private AbstractCard card = null;

    public Action_example(AbstractCard card) {
        this.card = card;
    }

    public Action_example(UUID targetUUID, int amount) {
        this.uuid = targetUUID;
        this.amount = amount;
        this.duration = Settings.ACTION_DUR_XFAST;
    }


    public void update() {
        if (this.card == null) {
            for (AbstractCard c : GetAllInBattleInstances.get(this.uuid)) {
                c.baseMagicNumber += this.amount;
            }
        } else {
            this.card.baseMagicNumber = 0;
        }

        this.isDone = true;
    }
}
