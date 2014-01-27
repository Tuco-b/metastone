package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class FenCreeper extends MinionCard {

	public FenCreeper() {
		super("Fen Creeper", Rarity.COMMON, HeroClass.ANY, 5);
	}

	@Override
	public Minion summon() {
		return createMinion(3, 6, GameTag.TAUNT);
	}

}