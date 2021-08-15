package noobanidus.mods.falling;

import net.minecraft.block.FallingBlock;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("falling")
public class Falling {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "falling";

  public Falling() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
  }
}
