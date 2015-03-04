package net.kloudspace.version.proxy;

import net.kloudspace.version.Version;
import net.kloudspace.version.VersionChecker;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void post(FMLPostInitializationEvent event) {
		
		System.out.println("On Client Side");
		
		super.post(event);
		
		Version.versionChecker = new VersionChecker();
		Thread versionCheckThread = new Thread(Version.versionChecker, "Version Checker");
		versionCheckThread.start();
		
	}

}
