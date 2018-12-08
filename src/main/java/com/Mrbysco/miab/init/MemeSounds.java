package com.Mrbysco.miab.init;

import com.Mrbysco.miab.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class MemeSounds {
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
	public static SoundEvent ppap_applepen;
	public static SoundEvent ppap_pineapplepen;
	public static SoundEvent ppap_ahapplepen;
	public static SoundEvent ppap_ahpineapplepen;
	public static SoundEvent ppap_ppap;
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
	public static SoundEvent robbie_sax2;
	public static SoundEvent robbie_hit;
	public static SoundEvent robbie_death;
	public static SoundEvent dad_summon;
	public static SoundEvent dad_passive;
	public static SoundEvent dad_hit;
	public static SoundEvent dad_death;
	public static SoundEvent leather_belt;
	public static SoundEvent cry;
	public static SoundEvent dankey_summon;
	public static SoundEvent dankey_passive;
	public static SoundEvent dankey_hit;
	public static SoundEvent dankey_death;
	public static SoundEvent sanic_slow;
	public static SoundEvent nigel_blagh;
	public static SoundEvent meme_music;
	public static SoundEvent meme_music2;
	public static SoundEvent meme_music3;
	public static SoundEvent meme_music4;
	public static SoundEvent skywalker_sand;
	public static SoundEvent pills;
	public static SoundEvent shaq_summon;
	public static SoundEvent shaq_hit;
	public static SoundEvent shaq_passive;
	public static SoundEvent shaq_death;
	public static SoundEvent big_boi;
	public static SoundEvent hotdog_tune;
	public static SoundEvent hotdog_full;
	public static SoundEvent heman_spawn;
	public static SoundEvent heman_hit;
	public static SoundEvent heman_passive;
	public static SoundEvent heman_death;
	public static SoundEvent knuckles_passive;
	public static SoundEvent knuckles_hurt;
	public static SoundEvent knuckles_death;
	public static SoundEvent rofl_spawn;
	public static SoundEvent rofl_passive;
	public static SoundEvent rofl_hurt;
	public static SoundEvent rofl_death;
	public static SoundEvent gnome_spawn;
	public static SoundEvent gnome_passive;
	public static SoundEvent gnome_hurt;
	public static SoundEvent gnome_death;
	public static SoundEvent phil_lottadamage;
	public static SoundEvent phil_passive;
	public static SoundEvent phil_hurt;
	public static SoundEvent phil_death;
	
	//start of main MEME sounds
	public static SoundEvent ninethousand;
	public static SoundEvent barrelroll;
	public static SoundEvent biwinning;
	public static SoundEvent boomheadshot;
	public static SoundEvent callinthenext;
	public static SoundEvent cantbelieve;
	public static SoundEvent charliebitme;
	public static SoundEvent chocolate;
	public static SoundEvent congratz;
	public static SoundEvent dedidadedwam;
	public static SoundEvent deeznuts;
	public static SoundEvent doit;
	public static SoundEvent dontletyourdreamsbedreams;
	public static SoundEvent doot;
	public static SoundEvent gaben;
	public static SoundEvent getitoxyclean;
	public static SoundEvent getnoscoped;
	public static SoundEvent gotchab;
	public static SoundEvent hagay;
	public static SoundEvent k;
	public static SoundEvent leroyjenkins;
	public static SoundEvent momscar;
	public static SoundEvent morningscrub;
	public static SoundEvent nice;
	public static SoundEvent nicememe;
	public static SoundEvent noot;
	public static SoundEvent nothisispatrick;
	public static SoundEvent nothisispatrick2;
	public static SoundEvent noticeme;
	public static SoundEvent ohlongjohnson;
	public static SoundEvent oldspicepower;
	public static SoundEvent oxyclean;
	public static SoundEvent rightinthe;
	public static SoundEvent sandwich;
	public static SoundEvent smokeweed;
	public static SoundEvent snooppengas;
	public static SoundEvent somebodystopme;
	public static SoundEvent sparta;
	public static SoundEvent spongebobsound;
	public static SoundEvent triple;
	public static SoundEvent trololo;
	public static SoundEvent victoryscreech;
	public static SoundEvent wasted;
	public static SoundEvent whiten;
	public static SoundEvent wololo;
	public static SoundEvent wombocombo;
	public static SoundEvent wow;
	public static SoundEvent wrong;
	public static SoundEvent wrongnumber;
	public static SoundEvent thuglife;
	public static SoundEvent boing;
	public static SoundEvent clippy_mineshaft;
	public static SoundEvent clippy_cave;
	public static SoundEvent clippy_night;
	public static SoundEvent clippy_health;
	public static SoundEvent clippy_death;
	public static SoundEvent clippy_hurt;
	public static SoundEvent clippy_passive;
	public static SoundEvent clippy_forest;
	
	
	
	public static void registerSounds() 
	{
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
		ppap_applepen = registerSound("ppap.applepen");
		ppap_pineapplepen = registerSound("ppap.pineapplepen");
		ppap_ahapplepen = registerSound("ppap.ahapplepen");
		ppap_ahpineapplepen = registerSound("ppap.ahpineapplepen");
		ppap_ppap = registerSound("ppap.ppap");
		keyboard_mechanical = registerSound("keyboardmechanical");
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
		robbie_sax2 = registerSound("robbie.sax2");
		robbie_hit = registerSound("robbie.hit");
		robbie_death = registerSound("robbie.death");
		dad_summon = registerSound("dad.summon");
		dad_passive = registerSound("dad.passive");
		dad_hit = registerSound("dad.hit");
		dad_death = registerSound("dad.death");
		leather_belt = registerSound("leather.belt");
		cry = registerSound("fa.cry");
		dankey_summon = registerSound("dankey.summon");
		dankey_passive = registerSound("dankey.passive");
		dankey_hit = registerSound("dankey.hit");
		dankey_death = registerSound("dankey.death");
		sanic_slow = registerSound("sanic.slow");
		nigel_blagh = registerSound("nigel.blagh");
		meme_music = registerSound("meme.record1");
		meme_music2 = registerSound("meme.record2");
		meme_music3 = registerSound("meme.record3");
		meme_music4 = registerSound("meme.record4");
		skywalker_sand = registerSound("skywalker.sand");
		pills = registerSound("pills.here");
		shaq_summon = registerSound("shaq.summon");
		shaq_hit = registerSound("shaq.hit");
		shaq_passive = registerSound("shaq.passive");
		shaq_death = registerSound("shaq.death");
		big_boi = registerSound("meme.bigboi");
		hotdog_tune = registerSound("hotdog.tune");
		hotdog_full = registerSound("hotdog.full");
		heman_spawn = registerSound("heman.summon");
		heman_hit = registerSound("heman.hit");
		heman_passive = registerSound("heman.passive");
		heman_death = registerSound("heman.death");
		//start of main MEME registering
		ninethousand = registerSound("9000");
		barrelroll = registerSound("barrelroll");
		biwinning = registerSound("bi.winning");
		boomheadshot = registerSound("boomheadshot");
		callinthenext = registerSound("callinthenext");
		cantbelieve = registerSound("cantbelieve");
		charliebitme = registerSound("charliebitme");
		chocolate = registerSound("chocolate");
		congratz = registerSound("congratz");
		dedidadedwam = registerSound("dedidadedwam");
		deeznuts = registerSound("deeznuts");
		doit = registerSound("doit");
		dontletyourdreamsbedreams = registerSound("dontletyourdreamsbedreams");
		doot = registerSound("dootdoot");
		gaben = registerSound("gaben");
		getitoxyclean = registerSound("getitoxyclean");
		getnoscoped = registerSound("getnoscoped");
		gotchab = registerSound("gotchab");
		hagay = registerSound("hahappy");
		k = registerSound("k");
		leroyjenkins = registerSound("leroyjenkins");
		momscar = registerSound("momscar");
		morningscrub = registerSound("morningscrub");
		nice = registerSound("nice");
		nicememe = registerSound("nicememe");
		noot = registerSound("noot");
		nothisispatrick = registerSound("nothisispatrick");
		nothisispatrick2 = registerSound("nothisispatrick2");
		noticeme = registerSound("noticeme");
		ohlongjohnson = registerSound("ohlongjohnson");
		oldspicepower = registerSound("oldspicepower");
		oxyclean = registerSound("oxyclean");
		rightinthe = registerSound("rightinthe");
		sandwich = registerSound("sandwich");
		smokeweed = registerSound("smokew");
		snooppengas = registerSound("snooppen");
		somebodystopme = registerSound("somebodystopme");
		sparta = registerSound("sparta");
		spongebobsound = registerSound("spongebobsound");
		triple = registerSound("triple");
		trololo = registerSound("trololo");
		victoryscreech = registerSound("victoryscreech");
		wasted = registerSound("wasted");
		whiten = registerSound("whiten");
		wololo = registerSound("wololo");
		wombocombo = registerSound("wombocombo");
		wow = registerSound("wow");
		wrong = registerSound("wrong");
		wrongnumber = registerSound("wrongnumber");
		thuglife = registerSound("thug.life");
		boing = registerSound("clippy.jump");
		clippy_mineshaft = registerSound("clippy.mineshaft");
		clippy_cave = registerSound("clippy.cave");
		clippy_night = registerSound("clippy.night");
		clippy_health = registerSound("clippy.health");
		clippy_death = registerSound("clippy.death");
		clippy_hurt = registerSound("clippy.hurt");
		clippy_passive = registerSound("clippy.passive");
		clippy_forest = registerSound("clippy.forest");
		knuckles_passive = registerSound("knuckles.passive");
		knuckles_hurt = registerSound("knuckles.hurt");
		knuckles_death = registerSound("knuckles.death");
		rofl_spawn = registerSound("rofl.summon");
		rofl_passive = registerSound("rofl.passive");
		rofl_hurt = registerSound("rofl.hurt");
		rofl_death = registerSound("rofl.death");
		gnome_spawn = registerSound("gnome.summon");
		gnome_passive = registerSound("gnome.passive");
		gnome_hurt = registerSound("gnome.hurt");
		gnome_death = registerSound("gnome.death");
		phil_lottadamage = registerSound("phil.lottadamage");
		phil_passive = registerSound("phil.passive");
		phil_hurt = registerSound("phil.hurt");
		phil_death = registerSound("phil.death");
	}
	
	private static SoundEvent registerSound(String soundName)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, soundName);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(location);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}