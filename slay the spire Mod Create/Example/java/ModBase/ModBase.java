 package ModBase;

 import basemod.BaseMod;
 import basemod.eventUtil.AddEventParams;
 import basemod.eventUtil.EventUtils;
 import basemod.interfaces.*;
 import com.badlogic.gdx.Gdx;
 import com.badlogic.gdx.graphics.Color;
 import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
 import com.megacrit.cardcrawl.cards.AbstractCard;
 import com.megacrit.cardcrawl.characters.AbstractPlayer;
 import com.megacrit.cardcrawl.core.AbstractCreature;
 import com.megacrit.cardcrawl.core.Settings;
 import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
 import com.megacrit.cardcrawl.helpers.CardHelper;
 import com.megacrit.cardcrawl.localization.*;
 import com.megacrit.cardcrawl.powers.AbstractPower;
 import com.megacrit.cardcrawl.relics.AbstractRelic;
 import com.megacrit.cardcrawl.rooms.AbstractRoom;
 import com.megacrit.cardcrawl.vfx.cardManip.ShowCardAndAddToDrawPileEffect;


 import cards.*;
 import characters.*;
 import events.*;
 import potion.*;
 import relics.*;

 import pathes.AbstractCardEnum;
 import pathes.ThemodClassEnum;

 import java.nio.charset.StandardCharsets;
 import java.util.ArrayList;
 import java.util.Iterator;

 @SpireInitializer
 public class *{ModID}* implements RelicGetSubscriber, PostPowerApplySubscriber, PostExhaustSubscriber, PostBattleSubscriber, PostDungeonInitializeSubscriber, EditCharactersSubscriber, PostInitializeSubscriber, EditRelicsSubscriber, EditCardsSubscriber, EditStringsSubscriber, OnCardUseSubscriber, EditKeywordsSubscriber, OnPowersModifiedSubscriber, PostDrawSubscriber, PostEnergyRechargeSubscriber {
   //卡面上能量图标
   public static final String CARD_ENERGY_ORB = "img/UI/*{EnergyOrb}*";
   //攻击、技能、能力牌的背景图片(512)
   private static final String ATTACK_CC = "img/512/*{atk}*";
   private static final String SKILL_CC = "img/512/*{skl}*";
   private static final String POWER_CC = "img/512/*{pow}*";
   private static final String ENERGY_ORB_CC = "img/512/*{orb}*";
   //攻击、技能、能力牌的背景图片(1024)
   private static final String ATTACK_CC_PORTRAIT = "img/1024/*{atk2}*";
   private static final String SKILL_CC_PORTRAIT = "img/1024/*{skl2}*";
   private static final String POWER_CC_PORTRAIT = "img/1024/*{pow2}*";
   private static final String ENERGY_ORB_CC_PORTRAIT = "img/1024/*{orb2}*";
//牌组信息中按钮的颜色
   public static final Color SILVER = CardHelper.getColor(*{CardColor}*);
   private ArrayList<AbstractCard> cardsToAdd = new ArrayList<>();
   public static ArrayList<AbstractCard> recyclecards = new ArrayList<>();

   public *{ModID}*() {
     //构造方法，初始化各种参数
     BaseMod.subscribe(this);
     BaseMod.addColor(AbstractCardEnum.*{ModID}*_COLOR, SILVER, SILVER, SILVER, SILVER, SILVER, SILVER, SILVER, ATTACK_CC, SKILL_CC, POWER_CC, ENERGY_ORB_CC, ATTACK_CC_PORTRAIT, SKILL_CC_PORTRAIT,POWER_CC_PORTRAIT, ENERGY_ORB_CC_PORTRAIT, CARD_ENERGY_ORB);
   }

   @Override
   public void receiveEditCharacters() {
     */ModBase_TheCharacterAdd/*
     */ModBase_ThePotionAdd/*
   }
   //初始化整个MOD,一定不能删
   public static void initialize() {
         new *{ModID}*();
     }

   @Override
   public void receiveEditCards() {
     //将卡牌批量添加
     loadCardsToAdd();
     Iterator<AbstractCard> var1 = this.cardsToAdd.iterator();
     while (var1.hasNext()) {
       AbstractCard card = var1.next();
       BaseMod.addCard(card);
     }
   }

   @Override
   public void receivePostExhaust(AbstractCard c) {}

   @Override
   public void receivePostPowerApplySubscriber(AbstractPower pow, AbstractCreature target, AbstractCreature owner) {

   }


   @Override
   public void receivePowersModified() {}


   @Override
   public void receivePostDungeonInitialize() {}


   @Override
   public void receivePostDraw(AbstractCard arg0) {}

   private static String loadJson(String jsonPath) {
     return Gdx.files.internal(jsonPath).readString(String.valueOf(StandardCharsets.UTF_8));
   }


   @Override
   public void receiveEditKeywords() {

   }

   @Override
   public void receiveEditStrings() {
     //读取遗物，卡牌，能力，药水，事件的JSON文本

     String relic="", card="", power="", potion="", event="", character="";
     if (Settings.language == Settings.GameLanguage.ZHS) {
         card = "localization/TheMod_*{ModID}*_cards-zh.json";
         relic = "localization/TheMod_*{ModID}*_relics-zh.json";
         power = "localization/TheMod_*{ModID}*_powers-zh.json";
         potion = "localization/TheMod_*{ModID}*_potion-zh.json";
         event = "localization/TheMod_*{ModID}*_events-zh.json";
         character = "localization/TheMod_*{ModID}*_characters-zh.json";
     } else {
         //其他语言配置的JSON
     }

     String relicStrings = Gdx.files.internal(relic).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(RelicStrings.class, relicStrings);
     String cardStrings = Gdx.files.internal(card).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(CardStrings.class, cardStrings);
     String powerStrings = Gdx.files.internal(power).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(PowerStrings.class, powerStrings);
     String characterStrings = Gdx.files.internal(character).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(CharacterStrings.class, characterStrings);
     String potionStrings = Gdx.files.internal(potion).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(PotionStrings.class, potionStrings);
     String eventStrings = Gdx.files.internal(event).readString(String.valueOf(StandardCharsets.UTF_8));
     BaseMod.loadCustomStrings(EventStrings.class, eventStrings);
   }

   private void loadCardsToAdd() {
     //将自定义的卡牌添加到这里
     this.cardsToAdd.clear();
*/ModBase_CardAdd/*
     //将自定义的事件添加到这里
*/ModBase_EventAdd/*
   }
   //添加遗物
   @Override
   public void receiveEditRelics() {
       //将自定义的遗物添加到这里
       */ModBase_RelicAdd/*
   }

   @Override
   public void receiveRelicGet(AbstractRelic relic) {
   }

   @Override
   public void receiveCardUsed(AbstractCard abstractCard) {

   }

   @Override
   public void receivePostBattle(AbstractRoom r) {

   }

   @Override
   public void receivePostInitialize() {

   }

   @Override
   public void receivePostEnergyRecharge() {
     Iterator<AbstractCard> var1 = recyclecards.iterator();

     while (var1.hasNext()) {
       AbstractCard c = var1.next();
       AbstractCard card = c.makeStatEquivalentCopy();
       AbstractDungeon.effectList.add(new ShowCardAndAddToDrawPileEffect(card, Settings.WIDTH / 2.0F, Settings.HEIGHT / 2.0F, false, true, true));
     }
     recyclecards.clear();
   }

   class Keywords {
     Keyword[] keywords;
   }
 }

