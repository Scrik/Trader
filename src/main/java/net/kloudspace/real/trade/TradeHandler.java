package net.kloudspace.real.trade;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import shukaro.artifice.ArtificeItems;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class TradeHandler implements IVillageTradeHandler{
	

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		int flint = 4 + random.nextInt(6);
		int glasspane = 3 + random.nextInt(7);
		int coal = 16 + random.nextInt(8);
		int iron = 7 + random.nextInt(3);
		int diamond = 3 + random.nextInt(1);
		
		switch(villager.getProfession()) {
		case 6: // FARMER
			recipeList.add(new MerchantRecipe(new ItemStack(Items.wheat, 18 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.potato, 15 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.carrot, 15 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 8 + random.nextInt(5)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.melon_block, 7 + random.nextInt(5)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin, 1,0), new ItemStack(Items.bread, 2 + random.nextInt(2))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.pumpkin_pie, 1 + random.nextInt(2))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.apple, 1 + random.nextInt(4))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.cookie, 1 + random.nextInt(5))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2,1), new ItemStack(Items.cake, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.string, 15 + random.nextInt(5)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.coal,16 + random.nextInt(8)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.fish,6), new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.cooked_fished,6)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),1),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.fishing_rod,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(Item.getItemFromBlock(Blocks.wool),16 + random.nextInt(6), 0), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2,1), new ItemStack(Items.shears)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1)), new ItemStack(Item.getItemFromBlock(Blocks.wool),1 + random.nextInt(17),0 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.string,15 + random.nextInt(5)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2,0), new ItemStack(Items.arrow,8 + random.nextInt(4))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2,1), new ItemStack(ArtificeItems.itemCoin,0+  random.nextInt(4),0), new ItemStack(Items.bow,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Item.getItemFromBlock(Blocks.gravel), flint), new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.flint, flint)));
			
			break;
		case 7: // LIBRARIAN
			int k;
			Enchantment ench = Enchantment.enchantmentsBookList[random.nextInt(Enchantment.enchantmentsBookList.length)];
			int i1 = MathHelper.getRandomIntegerInRange(random, ench.getMinLevel(), ench.getMaxLevel());
			ItemStack itemstack = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(ench, i1));
			k = 2 + random.nextInt(5 + i1 * 10) + 3 * i1;
			
			recipeList.add(new MerchantRecipe(new ItemStack(Items.paper, 24 + random.nextInt(12)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.book,8 + random.nextInt(2)), new ItemStack(ArtificeItems.itemCoin,1,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.written_book, 1 + random.nextInt(1)), new ItemStack(ArtificeItems.itemCoin,1,1)));
//			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(63),0), Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(Enchantment.enchantmentsList[x], 1 + random.nextInt(18)))));

			recipeList.add(new MerchantRecipe(new ItemStack(Items.book), new ItemStack(ArtificeItems.itemCoin, k/4,1), itemstack));

			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(2), 1), new ItemStack(Items.compass,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(4)),new ItemStack(Blocks.bookshelf,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(2),1), new ItemStack(Items.clock,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,glasspane,0), new ItemStack(Blocks.glass_pane,glasspane, random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),2), new ItemStack(Items.name_tag,1,0)));
			break;
		case 8: // PRIEST
			recipeList.add(new MerchantRecipe(new ItemStack(Items.rotten_flesh, 36 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.gold_ingot, 8 + random.nextInt(2)), new ItemStack(ArtificeItems.itemCoin,1,3)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.redstone, 1 + random.nextInt(3))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,1), new ItemStack(Items.dye,1 + random.nextInt(1),4)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,7 + random.nextInt(4)), new ItemStack(Items.ender_eye,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1), 1), new ItemStack(Items.ender_eye,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,2), new ItemStack(Items.ender_eye,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,0), new ItemStack(Items.glowstone_dust,1 + random.nextInt(2))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,3 + random.nextInt(7),0), new ItemStack(Items.experience_bottle,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),1), new ItemStack(Items.experience_bottle,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1, 2), new ItemStack(Items.experience_bottle,1)));
			break;
		case 9: // BLACKSMITH
			recipeList.add(new MerchantRecipe(new ItemStack(Items.coal,coal), new ItemStack(ArtificeItems.itemCoin,coal/6,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.iron_ingot,iron), new ItemStack(ArtificeItems.itemCoin,iron* 2,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, diamond), new ItemStack(ArtificeItems.itemCoin,diamond * 2,2)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,1), new ItemStack(Items.iron_helmet)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2 + random.nextInt(1),1), new ItemStack(Items.iron_chestplate)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,7 + random.nextInt(1)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.diamond_chestplate,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),1), new ItemStack(Items.chainmail_boots)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2 + random.nextInt(1),1), new ItemStack(Items.chainmail_chestplate)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),1), new ItemStack(Items.chainmail_helmet)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2 + random.nextInt(1),1), new ItemStack(Items.chainmail_leggings)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1 + random.nextInt(1),1), new ItemStack(Items.iron_axe)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,9 + random.nextInt(1)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.iron_sword,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,12 + random.nextInt(3)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.diamond_sword,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,9 + random.nextInt(3)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.diamond_axe,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,5 + random.nextInt(2)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.iron_shovel,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,9 + random.nextInt(2)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.iron_pickaxe,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,12 + random.nextInt(3)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.diamond_pickaxe,1,0), 5 + random.nextInt(15))));
			break;
		case 10: // BUTCHER
			recipeList.add(new MerchantRecipe(new ItemStack(Items.porkchop,14 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.chicken,14 + random.nextInt(4)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.coal,16 + random.nextInt(8)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,1), new ItemStack(Items.cooked_porkchop, 4 + random.nextInt(4))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,1,1), new ItemStack(Items.cooked_chicken, 6 + random.nextInt(2))));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.leather,9 + random.nextInt(3)), new ItemStack(ArtificeItems.itemCoin,1,0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,2 + random.nextInt(2),0), new ItemStack(Items.leather_leggings,1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,7 + random.nextInt(5)),EnchantmentHelper.addRandomEnchantment(random, new ItemStack(Items.leather_chestplate,1,0), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(new ItemStack(ArtificeItems.itemCoin,8 + random.nextInt(2),0), new ItemStack(Items.saddle,1)));
			break;
		default:
			break;

		}	
	}

}