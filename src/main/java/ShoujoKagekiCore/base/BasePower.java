package ShoujoKagekiCore.base;


import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.powers.AbstractPower;


public abstract class BasePower extends AbstractPower {
    public AbstractCreature source = null;
    public boolean exhaustShineCardOnPlay = false; // TODO

    @Override
    public void onRemove() {
    }


    public void triggerOnTakeFromBagToHand(AbstractCard card) {

    }

    public void triggerOnTakeFromBag(AbstractCard card) {

    }

    public void triggerOnPutIntoBag(AbstractCard card) {

    }

    public void triggerOnBagClear() {

    }

    public void onCreatureApplyPower(AbstractPower power, AbstractCreature target, AbstractCreature source) {

    }

    public void onStrengthIncrease(int after) {

    }

    public void onAttackAfter(DamageInfo info, int damageAmount, AbstractCreature target) {
    }
}
