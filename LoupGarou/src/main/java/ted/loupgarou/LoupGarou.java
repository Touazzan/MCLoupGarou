package ted.loupgarou;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("loupgarou")
public class LoupGarou {

	public static LoupGarou instance;
	public static final String modid="loupgarou";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public LoupGarou() {
		
		instance = this;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("Ouai les kheys, je suis le common");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		logger.info("Ouai les kheys, je suis le client");
	}
}
