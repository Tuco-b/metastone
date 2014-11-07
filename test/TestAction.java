import net.pferdimanzug.hearthstone.analyzer.game.actions.GameAction;

public abstract class TestAction extends GameAction {

	@Override
	public String getPromptText() {
		return "[Test Action]";
	}

	@Override
	public boolean isSameActionGroup(GameAction anotherAction) {
		return false;
	}

}