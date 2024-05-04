package fr.hytorke.betterendgame;

import fr.hytorke.betterendgame.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndGame implements ModInitializer {
	public static final String MOD_ID = "betterendgame";
    public static final Logger LOGGER = LoggerFactory.getLogger("betterendgame");

	@Override
	public void onInitialize() {
		ModRegistries.registerMod();
		LOGGER.info("Loading BetterEndGame !");
	}
}