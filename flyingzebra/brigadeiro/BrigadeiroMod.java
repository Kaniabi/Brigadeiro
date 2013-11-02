package flyingzebra.brigadeiro;
 
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=BrigadeiroInfo.ID, name=BrigadeiroInfo.NAME, version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class BrigadeiroMod {
 
    	private final static Item brigadeiroItem = new ItemBrigadeiro(1977);

    	// The instance of your mod that Forge uses.
        @Instance("flyingzebra.brigadeiro")
        public static BrigadeiroMod instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(
        	clientSide=BrigadeiroInfo.CLIENTPROXY + "ClientProxy",
        	serverSide=BrigadeiroInfo.COMMONPROXY + "CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                LanguageRegistry.addName(brigadeiroItem, "Brigadeiro");
                
                
                ItemStack brigadeiroStack = new ItemStack(this.brigadeiroItem, 1);

                ItemStack seedStack = new ItemStack(Item.seeds, 1);
                ItemStack woodStack = new ItemStack(Block.wood, 1);

                GameRegistry.addRecipe(
                	brigadeiroStack,
                	"   ",
                	" S ",
                	" W ",
                	'S', seedStack,
                	'W', woodStack
                );
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}