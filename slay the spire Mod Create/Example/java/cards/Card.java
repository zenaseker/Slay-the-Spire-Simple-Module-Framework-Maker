package cards;
import basemod.abstracts.CustomCard;
import basemod.helpers.BaseModCardTags;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import pathes.AbstractCardEnum;
import pathes.CardTagEnum;

public class *{CardID}* extends CustomCard
    {
        public static final String ID = "*{CardID}*";
        private static final CardStrings cardStrings = CardCrawlGame.languagePack.getCardStrings(ID);
        public static final String IMG_PATH = "img/cards/*{CardImg}*";

        public *{CardID}*() {
            super(ID, cardStrings.NAME, IMG_PATH, *{CardCost}*, cardStrings.DESCRIPTION, CardType.*{CardType}*, AbstractCardEnum.*{ModID}*_COLOR, CardRarity.*{CardRarity}*, CardTarget.*{CardTarget}*);
	this.damage = this.baseDamage = *{CardDamage}*;
	this.block = this.baseBlock = *{CardBlock}*;
	this.magicNumber = this.baseMagicNumber = *{CardMagic}*;
	this.exhaust = *{CardExhaust}*;
	this.selfRetain = *{CardselfRetain}*;
	this.isInnate = *{CardisInnate}*;
	this.isEthereal = *{CardisEthereal}*;
	*/Card_TagsAdd/*
        }

        @Override
        public void use(AbstractPlayer p, AbstractMonster m) {
        }

        @Override
        public AbstractCard makeCopy() {
            return new *{CardID}*();
        }


        @Override
        public void upgrade() {
            if (!this.upgraded) {
                upgradeName();
	upgradeDamage(*{CardUpDamage}*);
	upgradeBlock(*{CardUpBlock}*);
	upgradeMagicNumber(*{CardUpMagic}*);
	updateCost(*{CardUpCost}*);
	this.exhaust = *{CardUpExhaust}*;
	this.selfRetain = *{CardUpselfRetain}*;
	this.isInnate = *{CardUpisInnate}*;
	this.isEthereal = *{CardUpisEthereal}*;
	*/Card_UpgradeDes/*
            }
        }
}
