package flyingzebra.brigadeiro;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBrigadeiro extends ItemFood {

	public ItemBrigadeiro(int id) {
		super(id, 6, 0.6F, false);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("brigadeiro");
		setTextureName(BrigadeiroInfo.ID + ":brigadeiro");
	}
}
