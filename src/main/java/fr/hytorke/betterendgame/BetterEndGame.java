package fr.hytorke.betterendgame;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndGame implements ModInitializer {
	public static final String MOD_ID = "betterendgame"
    public static final Logger LOGGER = LoggerFactory.getLogger("betterendgame");

	@Override
	public void onInitialize() {

		LOGGER.info("Loading BetterEndGame !");
	}
}