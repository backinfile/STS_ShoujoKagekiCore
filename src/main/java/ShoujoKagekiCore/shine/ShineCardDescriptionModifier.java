package ShoujoKagekiCore.shine;

import ShoujoKagekiCore.CoreModPath;
import ShoujoKagekiCore.Log;
import ShoujoKagekiCore.base.BasePower;
import basemod.abstracts.AbstractCardModifier;
import com.badlogic.gdx.graphics.Color;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.UIStrings;


public class ShineCardDescriptionModifier extends AbstractCardModifier {

    public static UIStrings uiStrings = CardCrawlGame.languagePack.getUIString(CoreModPath.makeID("DisposableKeyword"));


    public static final String ID = CoreModPath.makeID(ShineCardDescriptionModifier.class.getSimpleName());

    @Override
    public String identifier(AbstractCard card) {
        return ID;
    }

    @Override
    public String modifyDescription(String rawDescription, AbstractCard card) {
        if (rawDescription.endsWith(uiStrings.TEXT[3])) {
            return uiStrings.TEXT[0] + rawDescription + uiStrings.TEXT[1];
        }
        return uiStrings.TEXT[0] + rawDescription + uiStrings.TEXT[2] + uiStrings.TEXT[1];
    }

    @Override
    public Color getGlow(AbstractCard card) {
        if (DisposableVariable.getValue(card) == 1) {
            return Color.FIREBRICK.cpy();
        }
        AbstractPlayer player = AbstractDungeon.player;
        if (player != null && player.powers.stream().anyMatch(p -> p instanceof BasePower && ((BasePower) p).exhaustShineCardOnPlay)) {
            return Color.FIREBRICK.cpy();
        }
        return super.getGlow(card);
    }

    @Override
    public AbstractCardModifier makeCopy() {
        return new ShineCardDescriptionModifier();
    }
}
