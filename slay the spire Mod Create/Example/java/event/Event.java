package events;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.events.AbstractEvent;
import com.megacrit.cardcrawl.events.AbstractImageEvent;
import com.megacrit.cardcrawl.localization.EventStrings;
import com.megacrit.cardcrawl.vfx.RainingGoldEffect;
import com.megacrit.cardcrawl.vfx.UpgradeShineEffect;
import com.megacrit.cardcrawl.vfx.cardManip.ShowCardBrieflyEffect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class *{EventID}* extends AbstractImageEvent {
    public static final String ID = "*{EventID}*";
    private static final EventStrings eventStrings = CardCrawlGame.languagePack.getEventString(ID);
    public static final String NAME = eventStrings.NAME;
    public static final String[] DESCRIPTIONS = eventStrings.DESCRIPTIONS;
    public static final String[] OPTIONS = eventStrings.OPTIONS;
    private int screenNum = 0;
    private int button1 = *{StartOption1}*;
    private int button2 = *{StartOption2}*;
    private int button3 = *{StartOption3}*;

    public *{EventID}*() {
        super(NAME, DESCRIPTIONS[0], "img/events/*{EventImg}*");
            */Event_Addoptions/*
    }

    protected void buttonEffect(int buttonPressed) {
       switch(buttonPressed){
         case 0:
            GoOption(button1);
            break;
         case 1:
            GoOption(button2);
            break;
         case 2:
            GoOption(button3);
            break;
      }
    }

   protected void GoOption(int option){
       switch(option){
         case -1:
            break;
*/Event_options/*
      }
   }

*/Event_voids/*

    public void logMetric(String result) {
        AbstractEvent.logMetric("*{EventID}*", result);
    }
}
