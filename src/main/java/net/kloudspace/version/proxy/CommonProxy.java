package net.kloudspace.version.proxy;

import net.kloudspace.version.VersionEvents;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy {
	
	@EventHandler
	public void pre(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		eventListener();
		registerHandler();
	}
	
	@EventHandler
	public void post(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverAboutToStart(FMLServerAboutToStartEvent event) {
		
	}
	
	@EventHandler
	public void serverStart(FMLServerStartedEvent event) {
		
	}
	
	@EventHandler
	public void serverStopping(FMLServerStoppingEvent event) {
		
	}
	
	@EventHandler
	public void serverStoped(FMLServerStoppedEvent event) {
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
	protected void eventListener() {
		
		System.out.println("Register Events");
		
		FMLCommonHandler.instance().bus().register(new VersionEvents());
	}
	
	public ModelBiped getArmorModel(int id) {
		return null;
	}
	
	public int addArmor(String armorName) {
		return 0;
	}
	
	public EntityPlayer findPlayer(String playerName) {
		return null;
	}
	
	public void registerHandler() {
		
	}

}
