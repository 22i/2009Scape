package plugin.interaction.object;

import core.cache.def.impl.ObjectDefinition;
import core.game.interaction.OptionHandler;
import core.game.node.Node;
import core.game.node.entity.player.Player;
import core.plugin.InitializablePlugin;
import core.plugin.Plugin;

/**
 * Represents the plugin to handle gnome tree teleporting.
 * @author 'Vexia
 * @version 1.0
 */
@InitializablePlugin
public final class GnomeSpiritTreePlugin extends OptionHandler {

	@Override
	public Plugin<Object> newInstance(Object arg) throws Throwable {
		ObjectDefinition.forId(1317).getConfigurations().put("option:talk-to", this);
		ObjectDefinition.forId(1317).getConfigurations().put("option:teleport", this);
		ObjectDefinition.forId(1293).getConfigurations().put("option:talk-to", this);
		ObjectDefinition.forId(1293).getConfigurations().put("option:teleport", this);
		ObjectDefinition.forId(1294).getConfigurations().put("option:talk-to", this);
		ObjectDefinition.forId(1294).getConfigurations().put("option:teleport", this);
		return this;
	}

	@Override
	public boolean handle(Player player, Node node, String option) {
		switch (option) {
		case "talk-to":
			player.getDialogueInterpreter().open(1317);
			return true;
		case "teleport":
			player.getDialogueInterpreter().open(1317);
			return true;
		}
		return true;
	}

}
