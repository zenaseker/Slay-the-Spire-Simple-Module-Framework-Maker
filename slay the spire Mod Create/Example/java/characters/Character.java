package characters;

import basemod.abstracts.CustomPlayer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.EnergyManager;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.events.beyond.SpireHeart;
import com.megacrit.cardcrawl.helpers.CardHelper;
import com.megacrit.cardcrawl.helpers.FontHelper;
import com.megacrit.cardcrawl.localization.CharacterStrings;
import com.megacrit.cardcrawl.screens.CharSelectInfo;
import com.megacrit.cardcrawl.unlock.UnlockTracker;
import pathes.ThemodClassEnum;
import pathes.AbstractCardEnum;
import cards.*;
import relics.*;

import java.util.ArrayList;

public class *{CharacterID}* extends CustomPlayer {
    //角色的文本信息
    public static CharacterStrings characterStrings = CardCrawlGame.languagePack.getCharacterString("*{CharacterID}*");
    //以下图片依次作用为[篝火休息处的角色背影2，篝火休息处的角色背影1，角色死亡后倒下的图片，角色平常站立时的图片]
    private static final String SHOULDER_2 = "img/char/*{Img4}*";
    private static final String SHOULDER_1 = "img/char/*{Img3}*";
    private static final String CORPSE = "img/char/*{Img2}*";
    private static final String STAND = "img/char/*{Img1}*";
    //能量图片（11张），能量特效，特效旋转参数（不懂）
    private static final String[] ORB_TEXTURES = new String[] { */Character_EnergyImgs/* };
    private static final String ORB_VFX = "img/UI/EPanel/*{energyVFX}*";
    private static final float[] LAYER_SPEED = new float[] { -40.0F, -32.0F, 20.0F, -20.0F, 0.0F, -10.0F, -8.0F, 5.0F, -5.0F, 0.0F };
    //初始能量，初始生命，最大生命，初始金币,初始的充能球栏位（机器人）,每回合抽牌数
    private static final int ENERGY_PER_TURN = *{StartEnergy}*;
    private static final int STARTING_HP = *{StartHp}*;
    private static final int MAX_HP = *{StartMaxHp}*;
    private static final int STARTING_GOLD = *{StartGold}*;
    private static final int HAND_SIZE = *{StartBall}*;
    private static final int DrawByT = *{CurrentHp}*;
    //返回一个颜色，关于卡牌移动拖尾颜色
    public static final Color SILVER = CardHelper.getColor(*{Color}*);

    public *{CharacterID}*(String name) {
        //构造方法，初始化参数
        super(name, ThemodClassEnum.*{ModID}*_CLASS, ORB_TEXTURES, ORB_VFX, LAYER_SPEED, (String)null, (String)null);
        this.dialogX = this.drawX + 0.0F * Settings.scale;
        this.dialogY = this.drawY + 220.0F * Settings.scale;
        initializeClass(STAND, SHOULDER_2, SHOULDER_1, CORPSE,
                         getLoadout(),
                         0.0F, 5.0F, 240.0F, 300.0F,
                         new EnergyManager(ENERGY_PER_TURN));
    }

    @Override
    public ArrayList<String> getStartingDeck() {
        //添加初始卡组
        ArrayList<String> retVal = new ArrayList<>();
        */Character_StartCardAdd/*
        return retVal;
    }

    @Override
    public ArrayList<String> getStartingRelics() {
        //添加初始遗物
        ArrayList<String> retVal = new ArrayList<>();
        */Character_StartRelicsAdd/*
        return retVal;
    }

    @Override
    public CharSelectInfo getLoadout() {
        //选英雄界面的文字描述
        String title=characterStrings.NAMES[0];
        String flavor=characterStrings.TEXT[0];

        return new CharSelectInfo(title, flavor, STARTING_HP, MAX_HP,HAND_SIZE , STARTING_GOLD, DrawByT, this, getStartingRelics(), getStartingDeck(), false);
    }


    @Override
    public String getTitle(PlayerClass playerClass) {
        return characterStrings.NAMES[0];
    }

    @Override

    public AbstractCard.CardColor getCardColor() {
        //选择卡牌颜色
        return AbstractCardEnum.*{ModID}*_COLOR;
    }

    @Override
    public Color getCardRenderColor() {
        return SILVER;
    }

    @Override
    public AbstractCard getStartCardForEvent() {
        return null;
    }

    @Override
    public Color getCardTrailColor() {
        return SILVER;
    }

    @Override
    public int getAscensionMaxHPLoss() {
        return DrawByT;
    }

    @Override
    public BitmapFont getEnergyNumFont() {
        return FontHelper.energyNumFontBlue;
    }

    @Override
    public void doCharSelectScreenSelectEffect() {

    }
    public void updateOrb(int orbCount) {
        this.energyOrb.updateOrb(orbCount);
    }
    @Override
    public String getCustomModeCharacterButtonSoundKey() {
        return null;
    }

    @Override
    public String getLocalizedCharacterName() {
        return characterStrings.NAMES[0];
    }

    @Override
    public AbstractPlayer newInstance() {
        return new *{CharacterID}*(this.name);
    }

    @Override
    public String getSpireHeartText() {
        return characterStrings.TEXT[1];
    }

    @Override
    public Color getSlashAttackColor() {
        return SILVER;
    }

    @Override
    public AbstractGameAction.AttackEffect[] getSpireHeartSlashEffect() {
        return new AbstractGameAction.AttackEffect[]{AbstractGameAction.AttackEffect.SLASH_HEAVY, AbstractGameAction.AttackEffect.FIRE, AbstractGameAction.AttackEffect.SLASH_DIAGONAL, AbstractGameAction.AttackEffect.SLASH_HEAVY, AbstractGameAction.AttackEffect.FIRE, AbstractGameAction.AttackEffect.SLASH_DIAGONAL};
    }

    @Override
    public String getVampireText() {
        return null;
    }
    public void applyEndOfTurnTriggers() {
        super.applyEndOfTurnTriggers();
    }
}
