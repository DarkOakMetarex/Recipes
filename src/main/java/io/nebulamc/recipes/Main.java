package io.nebulamc.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("Initializing Plugin.");
        printSexyASCIIArt();
        System.out.println("Version: " + this.getDescription().getVersion());
        System.out.println("Website: " + this.getDescription().getWebsite());
        System.out.println("Initializing Recipes...");
        recipes();
        onePointSeventeenRecipes();
        System.out.println("Initializing Nerfed Recipes...");
        nerfRecipes();
        System.out.println("Plugin startup completed.");
    }

    @Override
    public void onDisable() {
        System.err.println("Initializing Shutdown.");
        printSexyASCIIArt();
        System.err.println("Shutdown Complete.");
    }

    public void recipes(){
        // Custom Bell Recipe
        final ShapedRecipe bell = new ShapedRecipe(new NamespacedKey(this, "custom_bell"), new ItemStack(Material.BELL, 1));
        bell.shape("SSS", " G ", "GNG");
        bell.setIngredient('S', Material.STICK);
        bell.setIngredient('G', Material.GOLD_INGOT);
        bell.setIngredient('N', Material.GOLD_NUGGET);
        Bukkit.addRecipe(bell);

        // Custom Web Recipe
        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "custom_web"), new ItemStack(Material.COBWEB, 5));
        web.shape("S S", " S ", "S S");
        web.setIngredient('S', Material.STRING);
        Bukkit.addRecipe(web);

        //Custom Quartz Item Recipe
        final ShapelessRecipe quartz = new ShapelessRecipe(new NamespacedKey(this, "custom_nether_quartz"), new ItemStack(Material.QUARTZ, 4));
        quartz.addIngredient(1, Material.QUARTZ_BLOCK);
        Bukkit.addRecipe(quartz);

        //Custom Packed Ice
        final ShapedRecipe packedIce = new ShapedRecipe(new NamespacedKey(this, "custom_packedice"), new ItemStack(Material.PACKED_ICE, 4));
        packedIce.shape("III", "III", "III");
        packedIce.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedIce);

        //Custom Blue Ice
        final ShapedRecipe blueice = new ShapedRecipe(new NamespacedKey(this, "custom_blueice"), new ItemStack(Material.BLUE_ICE, 4));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);

        //Custom Slimeball
        final ShapelessRecipe slimeball = new ShapelessRecipe(new NamespacedKey(this, "custom_slimeball"), new ItemStack(Material.SLIME_BALL, 1));
        slimeball.addIngredient(1, Material.GREEN_DYE);
        slimeball.addIngredient(1, Material.SNOWBALL);
        Bukkit.addRecipe(slimeball);

        //Custom Prismarine Shard
        final ShapelessRecipe prismarineshard = new ShapelessRecipe(new NamespacedKey(this, "custom_prismarineshard"), new ItemStack(Material.PRISMARINE_SHARD, 3));
        prismarineshard.addIngredient(1, Material.SAND);
        prismarineshard.addIngredient(1, Material.DIRT);
        prismarineshard.addIngredient(1, Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);

        //Custom Prismarine Crystals
        final ShapelessRecipe prismarinecrystals = new ShapelessRecipe(new NamespacedKey(this, "custom_prismarinecrystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 3));
        prismarinecrystals.addIngredient(1, Material.PRISMARINE_SHARD);
        prismarinecrystals.addIngredient(1, Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarinecrystals);

        //Custom Lily Pad - Acacia Leaves
        final ShapedRecipe lilypad = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad1"), new ItemStack(Material.LILY_PAD, 3));
        lilypad.shape("   ", "   ", "LLL");
        lilypad.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(lilypad);

        //Custom Lily Pad - Birch Leaves
        final ShapedRecipe lilypad2 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad2"), new ItemStack(Material.LILY_PAD, 3));
        lilypad2.shape("   ", "   ", "LLL");
        lilypad2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(lilypad2);

        //Custom Lily Pad - Dark Oak Leaves
        final ShapedRecipe lilypad3 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad3"), new ItemStack(Material.LILY_PAD, 3));
        lilypad3.shape("   ", "   ", "LLL");
        lilypad3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(lilypad3);

        //Custom Lily Pad - Jungle Leaves
        final ShapedRecipe lilypad4 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad4"), new ItemStack(Material.LILY_PAD, 3));
        lilypad4.shape("   ", "   ", "LLL");
        lilypad4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(lilypad4);

        //Custom Lily Pad - Oak Leaves
        final ShapedRecipe lilypad5 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad5"), new ItemStack(Material.LILY_PAD, 3));
        lilypad5.shape("   ", "   ", "LLL");
        lilypad5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(lilypad5);

        //Custom Lily Pad - Spruce Leaves
        final ShapedRecipe lilypad6 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad6"), new ItemStack(Material.LILY_PAD, 3));
        lilypad6.shape("   ", "   ", "LLL");
        lilypad6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(lilypad6);

        //Custom Glowstone Dust
        final ShapedRecipe glowstoneDust = new ShapedRecipe(new NamespacedKey(this, "custom_glowstoneDust"), new ItemStack(Material.GLOWSTONE_DUST, 8));
        glowstoneDust.shape("RRR", "RBR", "RRR");
        glowstoneDust.setIngredient('R', Material.REDSTONE);
        glowstoneDust.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(glowstoneDust);

        //Custom Heart of Sea
        final ShapedRecipe HeartOfSea = new ShapedRecipe(new NamespacedKey(this, "custom_HeartOfSea"), new ItemStack(Material.HEART_OF_THE_SEA, 1));
        HeartOfSea.shape("DPQ", "PSP", "QPD");
        HeartOfSea.setIngredient('D', Material.DIAMOND_BLOCK);
        HeartOfSea.setIngredient('Q', Material.QUARTZ_BLOCK);
        HeartOfSea.setIngredient('P', Material.PRISMARINE);
        HeartOfSea.setIngredient('S', Material.SLIME_BALL);
        Bukkit.addRecipe(HeartOfSea);

        //Custom Nether Wart
        final ShapedRecipe netherWart = new ShapedRecipe(new NamespacedKey(this, "custom_netherWart"), new ItemStack(Material.NETHER_WART, 8));
        netherWart.shape("RRR", "RBR", "RRR");
        netherWart.setIngredient('R', Material.REDSTONE_BLOCK);
        netherWart.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(netherWart);

        //Custom String
        final ShapelessRecipe string = new ShapelessRecipe(new NamespacedKey(this, "custom_string"), new ItemStack(Material.STRING, 4));
        string.addIngredient(1, Material.WHITE_WOOL);
        Bukkit.addRecipe(string);

        //Custom Soulsand
        final ShapedRecipe soulsand = new ShapedRecipe(new NamespacedKey(this, "custom_soulsand"), new ItemStack(Material.SOUL_SAND, 12));
        soulsand.shape("RBR", "BPB", "RBR");
        soulsand.setIngredient('R', Material.ROTTEN_FLESH);
        soulsand.setIngredient('B', Material.BONE);
        soulsand.setIngredient('P', Material.BLAZE_POWDER);
        Bukkit.addRecipe(soulsand);

        //Custom Black Dye
        final ShapelessRecipe blackdye1 = new ShapelessRecipe(new NamespacedKey(this, "custom_blackdye_1"), new ItemStack(Material.INK_SAC, 1));
        blackdye1.addIngredient(1, Material.COAL);
        Bukkit.addRecipe(blackdye1);

        //Custom Black Dye #2
        final ShapelessRecipe blackdye2 = new ShapelessRecipe(new NamespacedKey(this, "custom_blackdye_2"), new ItemStack(Material.INK_SAC, 1));
        blackdye2.addIngredient(1, Material.CHARCOAL);
        Bukkit.addRecipe(blackdye2);

        //Custom Sponge
        final ShapedRecipe sponge = new ShapedRecipe(new NamespacedKey(this, "custom_sponge"), new ItemStack(Material.WET_SPONGE, 8));
        sponge.shape("WWW", "WBW", "WWW");
        sponge.setIngredient('W', Material.YELLOW_WOOL);
        sponge.setIngredient('B', Material.WATER_BUCKET);
        Bukkit.addRecipe(sponge);

        //Custom Blackstone
        final ShapedRecipe blackstone = new ShapedRecipe(new NamespacedKey(this, "custom_blackstone"), new ItemStack(Material.BLACKSTONE, 8));
        blackstone.shape("SSS", "SDS", "SSS");
        blackstone.setIngredient('S', Material.STONE);
        blackstone.setIngredient('D', Material.BLACK_DYE);
        Bukkit.addRecipe(blackstone);

        //Custom Chiseled Polished Blackstone
        final ShapedRecipe chiseledBlackstone = new ShapedRecipe(new NamespacedKey(this, "custom_chiseled_blackstone"), new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE, 4));
        chiseledBlackstone.shape(" BB", " BB", "   ");
        chiseledBlackstone.setIngredient('B', Material.POLISHED_BLACKSTONE_BRICKS);
        Bukkit.addRecipe(chiseledBlackstone);

        //Netherrack
        final ShapedRecipe netherrack = new ShapedRecipe(new NamespacedKey(this, "custom_netherrack"), new ItemStack(Material.NETHERRACK, 8));
        netherrack.shape("SSS", "SDS", "SSS");
        netherrack.setIngredient('S', Material.STONE);
        netherrack.setIngredient('D', Material.RED_DYE);
        Bukkit.addRecipe(netherrack);

        //Endstone
        final ShapedRecipe endstone = new ShapedRecipe(new NamespacedKey(this, "custom_endstone"), new ItemStack(Material.END_STONE, 8));
        endstone.shape("CCC", "CDC", "CCC");
        endstone.setIngredient('C', Material.COBBLESTONE);
        endstone.setIngredient('D', Material.WHITE_DYE);
        Bukkit.addRecipe(endstone);

        //Crimson Nylium
        final ShapelessRecipe crimsonNylium = new ShapelessRecipe(new NamespacedKey(this, "custom_crimson_nylium"), new ItemStack(Material.CRIMSON_NYLIUM, 1));
        crimsonNylium.addIngredient(1, Material.MYCELIUM);
        crimsonNylium.addIngredient(1, Material.NETHER_WART);
        crimsonNylium.addIngredient(1, Material.NETHERRACK);
        Bukkit.addRecipe(crimsonNylium);

        //Warped Nylium
        final ShapelessRecipe warpedNylium = new ShapelessRecipe(new NamespacedKey(this, "custom_warped_nylium"), new ItemStack(Material.WARPED_NYLIUM, 1));
        warpedNylium.addIngredient(1, Material.MYCELIUM);
        warpedNylium.addIngredient(1, Material.NETHER_WART);
        warpedNylium.addIngredient(1, Material.SOUL_SAND);
        Bukkit.addRecipe(warpedNylium);
        
        //Dead Bush
        final ShapedRecipe deadBush = new ShapedRecipe(new NamespacedKey(this, "custom_dead_bush"), new ItemStack(Material.DEAD_BUSH, 4));
        deadBush.shape("   ", " S ", " S ");
        deadBush.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(deadBush);

        //Gunpoweder
        final ShapedRecipe gunPowder = new ShapedRecipe(new NamespacedKey(this, "custom_gunpowder"), new ItemStack(Material.GUNPOWDER, 4));
        gunPowder.shape("GGG", "GCG", "GGG");
        gunPowder.setIngredient('G', Material.GLOWSTONE_DUST);
        gunPowder.setIngredient('C', Material.COAL);
        Bukkit.addRecipe(gunPowder);

        //Amethyst Shard
        final ShapelessRecipe amethystShard = new ShapelessRecipe(new NamespacedKey(this, "custom_amethyst_shard"), new ItemStack(Material.AMETHYST_SHARD, 4));
        amethystShard.addIngredient(1, Material.AMETHYST_BLOCK);
        Bukkit.addRecipe(amethystShard);

        //Phantom Membrane
        final ShapelessRecipe phantomMembrane = new ShapelessRecipe(new NamespacedKey(this, "custom_phantom_membrane"), new ItemStack(Material.PHANTOM_MEMBRANE, 1));
        phantomMembrane.addIngredient(1, Material.HONEYCOMB);
        phantomMembrane.addIngredient(1, Material.QUARTZ);
        Bukkit.addRecipe(phantomMembrane);

        //Chorus Flower
        final ShapelessRecipe chorusFlower = new ShapelessRecipe(new NamespacedKey(this, "custom_chorus_flower"), new ItemStack(Material.CHORUS_FLOWER, 3));
        chorusFlower.addIngredient(1, Material.PHANTOM_MEMBRANE);
        chorusFlower.addIngredient(1, Material.ENDER_EYE);
        chorusFlower.addIngredient(1, Material.AMETHYST_SHARD);
        Bukkit.addRecipe(chorusFlower);


        /*=================
         * CARPET COLORS
         ==================*/

        // BLACK CARPET
        final ShapelessRecipe blackCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_black_carpet"), new ItemStack(Material.BLACK_CARPET, 3));
        blackCarpet.addIngredient(1, Material.BLACK_CARPET);
        Bukkit.addRecipe(blackCarpet);

        //Blue Carpet
        final ShapelessRecipe blueCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_blue_carpet"), new ItemStack(Material.BLUE_CARPET, 3));
        blueCarpet.addIngredient(1, Material.BLUE_CARPET);
        Bukkit.addRecipe(blueCarpet);

        //Brown Carpet
        final ShapelessRecipe brownCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_brown_carpet"), new ItemStack(Material.BROWN_CARPET, 3));
        brownCarpet.addIngredient(1, Material.BROWN_CARPET);
        Bukkit.addRecipe(brownCarpet);

        //Cyan Carpet
        final ShapelessRecipe cyanCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_cyan_carpet"), new ItemStack(Material.CYAN_CARPET, 3));
        cyanCarpet.addIngredient(1, Material.CYAN_CARPET);
        Bukkit.addRecipe(cyanCarpet);

        //Gray carpet
        final ShapelessRecipe grayCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_gray_carpet"), new ItemStack(Material.GRAY_CARPET, 3));
        grayCarpet.addIngredient(1, Material.GRAY_CARPET);
        Bukkit.addRecipe(grayCarpet);

        //Green Carpet
        final ShapelessRecipe greenCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_green_carpet"), new ItemStack(Material.GREEN_CARPET, 3));
        greenCarpet.addIngredient(1, Material.GREEN_CARPET);
        Bukkit.addRecipe(greenCarpet);

        //lightblue carpet
        final ShapelessRecipe lightBlueCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_light_blue_carpet"), new ItemStack(Material.LIGHT_BLUE_CARPET, 3));
        lightBlueCarpet.addIngredient(1, Material.LIGHT_BLUE_CARPET);
        Bukkit.addRecipe(lightBlueCarpet);

        //LIGHT GRAY carpet
        final ShapelessRecipe lightGrayCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_light_gray_carpet"), new ItemStack(Material.LIGHT_GRAY_CARPET, 3));
        lightGrayCarpet.addIngredient(1, Material.LIGHT_GRAY_CARPET);
        Bukkit.addRecipe(lightGrayCarpet);

        //LIME carpet
        final ShapelessRecipe limeCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_lime_carpet"), new ItemStack(Material.LIME_CARPET, 3));
        limeCarpet.addIngredient(1, Material.LIME_CARPET);
        Bukkit.addRecipe(limeCarpet);

        //Magenta Carpet
        final ShapelessRecipe magentaCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_magenta_carpet"), new ItemStack(Material.MAGENTA_CARPET, 3));
        magentaCarpet.addIngredient(1, Material.MAGENTA_CARPET);
        Bukkit.addRecipe(magentaCarpet);

        //Pink Carpet
        final ShapelessRecipe pinkCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_pink_carpet"), new ItemStack(Material.PINK_CARPET, 3));
        pinkCarpet.addIngredient(1, Material.PINK_CARPET);
        Bukkit.addRecipe(pinkCarpet);

        //Purple Carpet
        final ShapelessRecipe purpleCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_purple_carpet"), new ItemStack(Material.PURPLE_CARPET, 3));
        purpleCarpet.addIngredient(1, Material.PURPLE_CARPET);
        Bukkit.addRecipe(purpleCarpet);

        //Red Carpet
        final ShapelessRecipe redCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_red_carpet"), new ItemStack(Material.RED_CARPET, 3));
        redCarpet.addIngredient(1, Material.RED_CARPET);
        Bukkit.addRecipe(redCarpet);

        //White Carpet
        final ShapelessRecipe whiteCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_white_carpet"), new ItemStack(Material.WHITE_CARPET, 3));
        whiteCarpet.addIngredient(1, Material.WHITE_CARPET);
        Bukkit.addRecipe(whiteCarpet);

        //Yellow Carpet
        final ShapelessRecipe yellowCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_yellow_carpet"), new ItemStack(Material.YELLOW_CARPET, 3));
        yellowCarpet.addIngredient(1, Material.YELLOW_CARPET);
        Bukkit.addRecipe(yellowCarpet);

        //Orange Carpet
        final ShapelessRecipe orangeCarpet = new ShapelessRecipe(new NamespacedKey(this, "custom_orange_carpet"), new ItemStack(Material.ORANGE_CARPET, 3));
        orangeCarpet.addIngredient(1, Material.ORANGE_CARPET);
        Bukkit.addRecipe(orangeCarpet);

        //Custom Blaze Rods
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.BLAZE_ROD, 1), Material.IRON_BARS));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_blazerods"), new ItemStack(Material.BLAZE_ROD, 1), Material.IRON_BARS, 0, 60));

        //Custom Green Dye
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye"), new ItemStack(Material.GREEN_DYE, 1), Material.OAK_LEAVES, 0, 60));

        //Custom Green Dye #1
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_1"), new ItemStack(Material.GREEN_DYE, 1), Material.ACACIA_LEAVES, 0, 60));

        //Custom Green Dye #2
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_2"), new ItemStack(Material.GREEN_DYE, 1), Material.SPRUCE_LEAVES, 0, 60));

        //Custom Green Dye #3
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_3"), new ItemStack(Material.GREEN_DYE, 1), Material.BIRCH_LEAVES, 0, 60));

        //Custom Green Dye #4
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_4"), new ItemStack(Material.GREEN_DYE, 1), Material.JUNGLE_LEAVES, 0, 60));

        //Custom Green Dye #5
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_5"), new ItemStack(Material.GREEN_DYE, 1), Material.DARK_OAK_LEAVES, 0, 60));

        //Custom Green Dye #6
        this.getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "custom_green_dye_6"), new ItemStack(Material.GREEN_DYE, 1), Material.AZALEA_LEAVES, 0, 60));


    }

    public void onePointSeventeenRecipes(){

        /*
        =============================
        FURNACE/BLAST FURNACE RECIPES
        =============================
         */
        // DeepSlate
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_deepslate"), new ItemStack(Material.DEEPSLATE, 1), Material.BLACKSTONE, 0, 40));

        //Amethyst Block
        final ShapedRecipe amethyst = new ShapedRecipe(new NamespacedKey(this, "custom_amethyst"), new ItemStack(Material.AMETHYST_BLOCK, 1));
        amethyst.shape(" D ", "DQD", " D ");
        amethyst.setIngredient('Q', Material.QUARTZ_BLOCK);
        amethyst.setIngredient('D', Material.PURPLE_DYE);
        Bukkit.addRecipe(amethyst);

        //Glow Berries
        final ShapedRecipe glowBerry = new ShapedRecipe(new NamespacedKey(this, "custom_glow_berry"), new ItemStack(Material.GLOW_BERRIES, 1));
        glowBerry.shape(" D ", "DBD", " D ");
        glowBerry.setIngredient('B', Material.SWEET_BERRIES);
        glowBerry.setIngredient('D', Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(glowBerry);
        
        //Honey Bottles
        final ShapelessRecipe honeyBottle = new ShapelessRecipe(new NamespacedKey(this, "custom_honey_bottle"), new ItemStack(Material.HONEY_BOTTLE, 4));
        honeyBottle.addIngredient(4, Material.GLASS_BOTTLE);
        honeyBottle.addIngredient(1, Material.HONEY_BLOCK);
        Bukkit.addRecipe(honeyBottle);
        
        //Tube Coral Block
        final ShapedRecipe tubeCoralBlock = new ShapedRecipe(new NamespacedKey(this, "custom_tube_coral_block"), new ItemStack(Material.TUBE_CORAL_BLOCK, 1));
        tubeCoralBlock.shape(" TT", " TT", "   ");
        tubeCoralBlock.setIngredient('T', Material.TUBE_CORAL);
        Bukkit.addRecipe(tubeCoralBlock);
        
        //Brain Coral Block
        final ShapedRecipe brainCoralBlock = new ShapedRecipe(new NamespacedKey(this, "custom_brain_coral_block"), new ItemStack(Material.BRAIN_CORAL_BLOCK, 1));
        brainCoralBlock.shape(" BB", " BB", "   ");
        brainCoralBlock.setIngredient('B', Material.BRAIN_CORAL);
        Bukkit.addRecipe(brainCoralBlock);
        
        //Bubble Coral Block
        final ShapedRecipe bubbleCoralBlock = new ShapedRecipe(new NamespacedKey(this, "custom_bubble_coral_block"), new ItemStack(Material.BUBBLE_CORAL_BLOCK, 1));
        bubbleCoralBlock.shape(" BB", " BB", "   ");
        bubbleCoralBlock.setIngredient('B', Material.BUBBLE_CORAL);
        Bukkit.addRecipe(bubbleCoralBlock);
        
        //Fire Coral Block
        final ShapedRecipe fireCoralBlock = new ShapedRecipe(new NamespacedKey(this, "custom_fire_coral_block"), new ItemStack(Material.FIRE_CORAL_BLOCK, 1));
        fireCoralBlock.shape(" FF", " FF", "   ");
        fireCoralBlock.setIngredient('F', Material.FIRE_CORAL);
        Bukkit.addRecipe(fireCoralBlock);
        
        //Horn Coral Block
        final ShapedRecipe hornCoralBlock = new ShapedRecipe(new NamespacedKey(this, "custom_horn_coral_block"), new ItemStack(Material.HORN_CORAL_BLOCK, 1));
        hornCoralBlock.shape(" HH", " HH", "   ");
        hornCoralBlock.setIngredient('H', Material.HORN_CORAL);
        Bukkit.addRecipe(hornCoralBlock);

        //Glowing Ink Sacs
        final ShapedRecipe glowInkSac = new ShapedRecipe(new NamespacedKey(this, "custom_glow_ink_sac"), new ItemStack(Material.GLOW_INK_SAC, 1));
        glowInkSac.shape(" D ", "DSD", " D ");
        glowInkSac.setIngredient('S', Material.INK_SAC);
        glowInkSac.setIngredient('D', Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(glowInkSac);

        //Ink Sac
        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "custom_ink_sac"), new ItemStack(Material.INK_SAC, 2));
        inkSac.addIngredient(1, Material.BLACK_DYE);
        inkSac.addIngredient(1, Material.LEATHER);
        Bukkit.addRecipe(inkSac);

        //Pointed Dripstone
        final ShapedRecipe pointedDripstone = new ShapedRecipe(new NamespacedKey(this, "custom_pointed_dripstone"), new ItemStack(Material.POINTED_DRIPSTONE, 1));
        pointedDripstone.shape("D D", " D ", " D ");
        pointedDripstone.setIngredient('D', Material.DRIPSTONE_BLOCK);
        Bukkit.addRecipe(pointedDripstone);

        //Dripstone
        final ShapelessRecipe dripStone = new ShapelessRecipe(new NamespacedKey(this, "custom_dripstone"), new ItemStack(Material.DRIPSTONE_BLOCK, 4));
        dripStone.addIngredient(1, Material.COBBLESTONE);
        dripStone.addIngredient(1, Material.ANDESITE);
        dripStone.addIngredient(1, Material.GRANITE);
        dripStone.addIngredient(1, Material.DIORITE);
        Bukkit.addRecipe(dripStone);

        //Small Dripleaf
        final ShapedRecipe smlDripleaf = new ShapedRecipe(new NamespacedKey(this, "custom_small_dripleaf"), new ItemStack(Material.SMALL_DRIPLEAF, 1));
        smlDripleaf.shape(" L ", "KGK", " W ");
        smlDripleaf.setIngredient('L', Material.LILY_PAD);
        smlDripleaf.setIngredient('K', Material.KELP);
        smlDripleaf.setIngredient('G', Material.SEAGRASS);
        smlDripleaf.setIngredient('W', Material.WARPED_ROOTS);
        Bukkit.addRecipe(smlDripleaf);

        //Big Dripleaf
        final ShapedRecipe bigDripleaf = new ShapedRecipe(new NamespacedKey(this, "custom_big_dripleaf"), new ItemStack(Material.BIG_DRIPLEAF, 1));
        bigDripleaf.shape(" L ", "KVK", " W ");
        bigDripleaf.setIngredient('L', Material.LILY_PAD);
        bigDripleaf.setIngredient('K', Material.KELP);
        bigDripleaf.setIngredient('V', Material.VINE);
        bigDripleaf.setIngredient('W', Material.WARPED_ROOTS);
        Bukkit.addRecipe(bigDripleaf);

        //Azalea
        final ShapelessRecipe azalea1 = new ShapelessRecipe(new NamespacedKey(this, "custom_azalea_1"), new ItemStack(Material.AZALEA, 1));
        azalea1.addIngredient(1, Material.GRASS);
        azalea1.addIngredient(1, Material.OAK_LEAVES);
        Bukkit.addRecipe(azalea1);

        final ShapelessRecipe azalea2 = new ShapelessRecipe(new NamespacedKey(this, "custom_azalea_2"), new ItemStack(Material.AZALEA, 1));
        azalea2.addIngredient(1, Material.GRASS);
        azalea2.addIngredient(1, Material.BIRCH_LEAVES);
        Bukkit.addRecipe(azalea2);

        //Azalea Leaves
        final ShapelessRecipe azaleaLeaves = new ShapelessRecipe(new NamespacedKey(this, "custom_azalea_leaves"), new ItemStack(Material.AZALEA_LEAVES, 1));
        azaleaLeaves.addIngredient(1, Material.VINE);
        azaleaLeaves.addIngredient(1, Material.OAK_LEAVES);
        Bukkit.addRecipe(azaleaLeaves);

        //Flowering Azalea
        final ShapelessRecipe floweringAzalea = new ShapelessRecipe(new NamespacedKey(this, "custom_flowering_azalea"), new ItemStack(Material.FLOWERING_AZALEA, 1));
        floweringAzalea.addIngredient(1, Material.AZALEA);
        floweringAzalea.addIngredient(1, Material.DANDELION);
        Bukkit.addRecipe(floweringAzalea);

        //Flowering Azalea Leaves
        final ShapelessRecipe floweringAzaleaLeaves = new ShapelessRecipe(new NamespacedKey(this, "custom_flowering_azalea_Leaves"), new ItemStack(Material.FLOWERING_AZALEA_LEAVES, 1));
        floweringAzaleaLeaves.addIngredient(1, Material.AZALEA_LEAVES);
        floweringAzaleaLeaves.addIngredient(1, Material.DANDELION);
        Bukkit.addRecipe(floweringAzaleaLeaves);

        //MOSS BLOCK
        final ShapedRecipe mossBlock = new ShapedRecipe(new NamespacedKey(this, "custom_moss_block"), new ItemStack(Material.MOSS_BLOCK, 1));
        mossBlock.shape(" G ", "SCS", " G ");
        mossBlock.setIngredient('G', Material.GRASS);
        mossBlock.setIngredient('S', Material.WHEAT_SEEDS);
        mossBlock.setIngredient('C', Material.MOSSY_COBBLESTONE);
        Bukkit.addRecipe(mossBlock);

        //Glow Lichen
        final ShapelessRecipe glowLichen = new ShapelessRecipe(new NamespacedKey(this, "custom_glow_lichen"), new ItemStack(Material.GLOW_LICHEN, 1));
        glowLichen.addIngredient(1, Material.VINE);
        glowLichen.addIngredient(1, Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(glowLichen);
        
        //Spore Blossom
        final ShapedRecipe sporeBlossom = new ShapedRecipe(new NamespacedKey(this, "custom_spore_blossom"), new ItemStack(Material.SPORE_BLOSSOM, 1));
        sporeBlossom.shape(" V ", "LFL", " V ");
        sporeBlossom.setIngredient('F', Material.FLOWERING_AZALEA);
        sporeBlossom.setIngredient('L', Material.FLOWERING_AZALEA_LEAVES);
        sporeBlossom.setIngredient('V', Material.VEIN);
        Bukkit.addRecipe(sporeBlossom);
        
        //Rooted Dirt
        final ShapelessRecipe rootedDirt = new ShapelessRecipe(new NamespacedKey(this, "custom_rooted_dirt"), new ItemStack(Material.ROOTED_DIRT, 1));
        rootedDirt.addIngredient(1, Material.DIRT);
        rootedDirt.addIngredient(1, Material.HANGING_ROOTS);
        Bukkit.addRecipe(rootedDirt);

        //Calcite
        final ShapedRecipe calcite = new ShapedRecipe(new NamespacedKey(this, "custom_calcite"), new ItemStack(Material.CALCITE, 2));
        calcite.shape("   ", " DW", " WD");
        calcite.setIngredient('D', Material.DIORITE);
        calcite.setIngredient('W', Material.WHITE_DYE);
        Bukkit.addRecipe(calcite);

        //Tuff
        final ShapedRecipe tuff = new ShapedRecipe(new NamespacedKey(this, "custom_tuff"), new ItemStack(Material.TUFF, 2));
        tuff.shape("   ", " AG", " GA");
        tuff.setIngredient('A', Material.ANDESITE);
        tuff.setIngredient('G', Material.GRAY_DYE);
        Bukkit.addRecipe(tuff);
    }
    }


    public void nerfRecipes(){
        // Gold Ore -> Becomes Gold Ore = Nullify
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.GOLD_ORE, 1), Material.GOLD_ORE));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_gold_ore_nerf"), new ItemStack(Material.GOLD_ORE, 1), Material.GOLD_ORE, 0, 60));

        // Raw Gold Ore -> Gold Nugget
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.GOLD_NUGGET, 3), Material.RAW_GOLD));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_gold_nugget"), new ItemStack(Material.GOLD_NUGGET, 3), Material.RAW_GOLD, 3, 30));

        // Raw Gold Block -> Gold Ingot
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 3), Material.RAW_GOLD_BLOCK));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_gold_ingot"), new ItemStack(Material.GOLD_INGOT, 3), Material.RAW_GOLD_BLOCK, 5, 30));
        
        // Raw Iron Block -> Iron Ingot
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 9), Material.RAW_IRON_BLOCK));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_iron_ingot"), new ItemStack(Material.IRON_INGOT, 9), Material.RAW_IRON_BLOCK, 15, 30));
        
        // Raw Copper Block -> Copper Ingot
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.COPPER_INGOT, 9), Material.RAW_COPPER_BLOCK));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this, "custom_Copper_ingot"), new ItemStack(Material.COPPER_INGOT, 9), Material.RAW_COPPER_BLOCK, 15, 30));
    }

    private void printSexyASCIIArt(){
        System.out.println("§5███    ██ ███████ ██████  ██    ██ ██       █████      ");
        System.out.println("§5████   ██ ██      ██   ██ ██    ██ ██      ██   ██     ");
        System.out.println("§5██ ██  ██ █████   ██████  ██    ██ ██      ███████     ");
        System.out.println("§5██  ██ ██ ██      ██   ██ ██    ██ ██      ██   ██     ");
        System.out.println("§5██   ████ ███████ ██████   ██████  ███████ ██   ██     ");
        System.out.println("                                                       ");
        System.out.println("§a    ██████  ███████  ██████ ██ ██████  ███████ ███████ ");
        System.out.println("§a    ██   ██ ██      ██      ██ ██   ██ ██      ██      ");
        System.out.println("§a    ██████  █████   ██      ██ ██████  █████   ███████ ");
        System.out.println("§a    ██   ██ ██      ██      ██ ██      ██           ██ ");
        System.out.println("§a    ██   ██ ███████  ██████ ██ ██      ███████ ███████ ");
        System.out.println("§b                            by 0xBit for EarthPol");
    }
}
