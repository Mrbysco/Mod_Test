package com.Mrbysco.MIAB.init;

import com.Mrbysco.MIAB.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MiabSoundEvents {
	
	public static SoundEvent meme_soundMature;
	public static SoundEvent meme_sound;
	public static SoundEvent cena_spawn;
	public static SoundEvent cena_sound;
	public static SoundEvent bill_spawn;
	public static SoundEvent bill_sound;
	public static SoundEvent bill_hit;
	public static SoundEvent bill_death;
	public static SoundEvent trump_spawn;
	public static SoundEvent trump_sound;
	public static SoundEvent trump_hit;
	public static SoundEvent trump_death;
	public static SoundEvent ception_spawn;
	public static SoundEvent khil_spawn;
	public static SoundEvent khil_sound;
	public static SoundEvent khil_death;
	public static SoundEvent ppap_spawn;
	public static SoundEvent ppap_sound;
	public static SoundEvent ppap_death;
	public static SoundEvent ppap_havepen;
	public static SoundEvent ppap_havepineapple;
	public static SoundEvent ppap_haveapple;
	public static SoundEvent keyboard_mechanical;
	public static SoundEvent moonman_summon;
	public static SoundEvent moonman_hit;
	public static SoundEvent moonman_passive;
	public static SoundEvent moonman_death;
	public static SoundEvent boi_summon;
	public static SoundEvent boi_passive;
	public static SoundEvent boi_death;
	public static SoundEvent shrek_summon;
	public static SoundEvent shrek_passive;
	public static SoundEvent shrek_hit;
	public static SoundEvent shrek_death;
	public static SoundEvent shrek_onion;
	public static SoundEvent robbie_summon;
	public static SoundEvent robbie_passive;
	public static SoundEvent robbie_sax;
	public static SoundEvent robbie_hit;
	public static SoundEvent robbie_death;
	public static SoundEvent dad_summon;
	public static SoundEvent dad_passive;
	public static SoundEvent dad_hit;
	public static SoundEvent dad_death;
	
	public static void registerSounds() {
		meme_soundMature = registerSound("meme.soundMature");
		meme_sound = registerSound("meme.sound");
		cena_spawn = registerSound("cena.spawn");
		cena_sound = registerSound("cena.sound");
		bill_spawn = registerSound("bill.spawn");
		bill_sound = registerSound("bill.sound");
		bill_hit = registerSound("bill.hit");
		bill_death = registerSound("bill.death");
		trump_spawn = registerSound("trump.spawn");
		trump_sound = registerSound("trump.sound");
		trump_hit = registerSound("trump.hit");
		trump_death = registerSound("trump.death");
		ception_spawn = registerSound("ception.spawn");
		khil_spawn = registerSound("khil.spawn");
		khil_sound = registerSound("khil.sound");
		khil_death = registerSound("khil.death");
		ppap_spawn = registerSound("ppap.spawn");
		ppap_sound = registerSound("ppap.sound");
		ppap_death = registerSound("ppap.death");
		ppap_havepen = registerSound("ppap.havepen");
		ppap_havepineapple = registerSound("ppap.havepineapple");
		ppap_haveapple = registerSound("ppap.haveapple");
		keyboard_mechanical = registerSound("meme.keyboardmechanical");
		moonman_summon = registerSound("moonman.spawn");
		moonman_hit = registerSound("moonman.hit");
		moonman_passive = registerSound("moonman.passive");
		moonman_death = registerSound("moonman.death");
		boi_summon = registerSound("boi.spawn");
		boi_passive = registerSound("boi.passive");
		boi_death = registerSound("boi.death");
		shrek_summon = registerSound("shrek.spawn");
		shrek_passive = registerSound("shrek.passive");
		shrek_hit = registerSound("shrek.hit");
		shrek_death = registerSound("shrek.death");
		shrek_onion = registerSound("shrek.onion");
		robbie_summon = registerSound("robbie.summon");
		robbie_passive = registerSound("robbie.passive");
		robbie_sax = registerSound("robbie.sax");
		robbie_hit = registerSound("robbie.hit");
		robbie_death = registerSound("robbie.death");
		dad_summon = registerSound("dad.summon");
		dad_passive = registerSound("dad.passive");
		dad_hit = registerSound("dad.hit");
		dad_death = registerSound("dad.death");
	}
	
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID + ":" + soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}
