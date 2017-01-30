package com.Mrbysco.MIAB.init;

import net.minecraftforge.common.config.Configuration;

public class MIABConfigGen {
	public static void configOptions(Configuration config) {
		config.load();
		// Mature Sounds
		MIABConfig.MatureSounds = config.get("Mature Sounds", "MatureSounds", false).getBoolean(false);
		// Drop chance
		MIABConfig.DropChance = config.get("Special Drop Chance", "DropChance", 0.8).getDouble(0.8);
		
		config.save();
		config.load();
	}
}