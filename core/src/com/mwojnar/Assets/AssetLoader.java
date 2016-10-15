package com.mwojnar.Assets;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.mwojnar.Game.SpookyGameJamGame;
import com.playgon.GameEngine.BackgroundTemplate;
import com.playgon.GameEngine.Entity;
import com.playgon.GameEngine.MaskSurface;
import com.playgon.GameEngine.MusicTemplate;
import com.playgon.GameEngine.Sound;
import com.playgon.GameEngine.SoundGroup;
import com.playgon.GameEngine.Sprite;
import com.playgon.Helpers.MusicHandler;
import com.playgon.Utils.Pair;

public class AssetLoader {

	public static boolean loaded = false;
	public static AssetManager assetManager;
	private static TextureAtlas atlas;
	public static Texture wojworksTexture;
	//public static TextureRegion reaperTexture;
	//public static Sprite spriteReaper;
	//public static TextureRegion grassTexture;
	//public static BackgroundTemplate grassBackground;
	//public static Sound sndCornSlice;
	//public static SoundGroup ;
	//public static MusicTemplate mainMusic;
	public static MusicHandler musicHandler;
	public static List<Class<? extends Entity>> classList = new ArrayList<Class<? extends Entity>>();
	public static List<Pair<String, Sprite>> spriteList = new ArrayList<Pair<String, Sprite>>();
	public static List<Pair<String, BackgroundTemplate>> backgroundList = new ArrayList<Pair<String, BackgroundTemplate>>();
	public static List<Pair<String, MusicTemplate>> musicList = new ArrayList<Pair<String, MusicTemplate>>();
	public static BitmapFont debugFont = new BitmapFont(true), titleFont = new BitmapFont(true);
	public static Color greenTextColor = new Color(52.0f / 255.0f, 217.0f / 255.0f, 34.0f / 255.0f, 1.0f),
			blueTextColor = new Color(77.0f / 255.0f, 207.0f / 255.0f, 228.0f / 255.0f, 1.0f);
	public static float musicVolume = 0.5f, soundVolume = 1.0f;
	//public static float vlmCornSlice = 1.0f;
	
	public static void load() {
		
		dispose();
		
		loaded = false;
		
		assetManager = new AssetManager();
		
		musicHandler = new MusicHandler();
		
		wojworksTexture = new Texture(Gdx.files.internal("data/Images/spr_wojworks.png"));
		
		assetManager.load("data/Images/SpookyGameJamTextures.pack", TextureAtlas.class);
		//atlas = new TextureAtlas(Gdx.files.internal("data/Images/DribbleTextures.pack"));
		
		Preferences preferences = Gdx.app.getPreferences("SpookyGameJam Prefs");
		musicVolume = preferences.getFloat("musicVolume", 1.0f);
		soundVolume = preferences.getFloat("soundVolume", 0.5f);
		
		loadSoundsManager();
		
		debugFont.setUseIntegerPositions(false);
		titleFont.setUseIntegerPositions(false);
		
	}
	
	public static void postload() {
		
		atlas = assetManager.get("data/Images/SpookyGameJamTextures.pack", TextureAtlas.class);
		
		loadMusic();
		loadSounds();
		loadTextures();
		loadSprites();
		loadMisc();
		
	}
	
	private static void loadMisc() {
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("data/Fonts/CountryGold.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		parameter.size = 36;
		parameter.flip = true;
		parameter.color = Color.BLACK;
		debugFont = generator.generateFont(parameter);
		generator.dispose();
		
		generator = new FreeTypeFontGenerator(Gdx.files.internal("data/Fonts/CountryGold.ttf"));
		parameter = new FreeTypeFontParameter();
		parameter.size = 144;
		parameter.flip = true;
		parameter.color = Color.BLACK;
		titleFont = generator.generateFont(parameter);
		generator.dispose();
		
	}
	
	private static void loadSoundsManager() {
		
		//assetManager.load("data/Sounds/snd_corn_slice.mp3", com.badlogic.gdx.audio.Sound.class);
		
	}
	
	private static void loadSounds() {
		
		//sndCornSlice = SpookyGameJamGame.createSound(assetManager.get("data/Sounds/snd_corn_slice.mp3", com.badlogic.gdx.audio.Sound.class));
		
	}
	
	private static void loadMusic() {
		
		//mainMusic = new MusicTemplate(Gdx.files.internal("data/Music/HM_-_Back_Mountain.mp3"));
		//mainMusic.setLooping(true);
		//musicHandler.addMusic(mainMusic);
		
	}
	
	public static void setMusicVolume(float musicVolume) {
		
		AssetLoader.musicVolume = musicVolume;
		//musicPaintForest.setVolume(musicVolume);
		
	}
	
	public static void dispose() {}
	
	private static void loadTextures() {
		
		//reaperTexture = atlas.findRegion("spr_reaper_strip4");
		
	}
	
	private static void loadSprites() {
		
		//spriteReaper = new Sprite(reaperTexture, 4);
		
	}
	
}