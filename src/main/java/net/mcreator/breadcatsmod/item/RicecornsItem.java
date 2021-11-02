
package net.mcreator.breadcatsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.breadcatsmod.BreadcatsModModElements;

@BreadcatsModModElements.ModElement.Tag
public class RicecornsItem extends BreadcatsModModElements.ModElement {
	@ObjectHolder("breadcats_mod:ricecorns")
	public static final Item block = null;
	public RicecornsItem(BreadcatsModModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(2.3000000000000003f).build()));
			setRegistryName("ricecorns");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 4;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
