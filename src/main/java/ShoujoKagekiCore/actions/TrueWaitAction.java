package ShoujoKagekiCore.actions;

import com.megacrit.cardcrawl.actions.AbstractGameAction;

public class TrueWaitAction extends AbstractGameAction {
    public TrueWaitAction(float setDur) {
        this.duration = setDur;
        this.actionType = ActionType.WAIT;
    }

    public void update() {
        this.tickDuration();
    }
}
