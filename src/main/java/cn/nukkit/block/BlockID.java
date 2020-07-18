package cn.nukkit.block;

public interface BlockID {
    int AIR = 0;
    int STONE = 1;
    int GRASS = 2;
    int DIRT = 3;
    int COBBLESTONE = 4;
    int COBBLE = 4;
    int PLANK = 5;
    int PLANKS = 5;
    int WOODEN_PLANK = 5;
    int WOODEN_PLANKS = 5;
    int SAPLING = 6;
    int SAPLINGS = 6;
    int BEDROCK = 7;
    int WATER = 8;
    int STILL_WATER = 9;
    int LAVA = 10;
    int STILL_LAVA = 11;
    int SAND = 12;
    int GRAVEL = 13;
    int GOLD_ORE = 14;
    int IRON_ORE = 15;
    int COAL_ORE = 16;
    int LOG = 17;
    int WOOD = 17;
    int TRUNK = 17;
    int LEAVES = 18;
    int LEAVE = 18;
    int SPONGE = 19;
    int GLASS = 20;
    int LAPIS_ORE = 21;
    int LAPIS_BLOCK = 22;
    int DISPENSER = 23;
    int SANDSTONE = 24;
    int NOTEBLOCK = 25;
    int BED_BLOCK = 26;
    int POWERED_RAIL = 27;
    int DETECTOR_RAIL = 28;
    int STICKY_PISTON = 29;
    int COBWEB = 30;
    int TALL_GRASS = 31;
    int BUSH = 32;
    int DEAD_BUSH = 32;
    int PISTON = 33;
    int PISTON_HEAD = 34;
    int WOOL = 35;
    int DANDELION = 37;
    int POPPY = 38;
    int ROSE = 38;
    int FLOWER = 38;
    int RED_FLOWER = 38;
    int BROWN_MUSHROOM = 39;
    int RED_MUSHROOM = 40;
    int GOLD_BLOCK = 41;
    int IRON_BLOCK = 42;
    int DOUBLE_SLAB = 43;
    int DOUBLE_STONE_SLAB = 43;
    int DOUBLE_SLABS = 43;
    int SLAB = 44;
    int STONE_SLAB = 44;
    int SLABS = 44;
    int BRICKS = 45;
    int BRICKS_BLOCK = 45;
    int TNT = 46;
    int BOOKSHELF = 47;
    int MOSS_STONE = 48;
    int MOSSY_STONE = 48;
    int OBSIDIAN = 49;
    int TORCH = 50;
    int FIRE = 51;
    int MONSTER_SPAWNER = 52;
    int WOOD_STAIRS = 53;
    int WOODEN_STAIRS = 53;
    int OAK_WOOD_STAIRS = 53;
    int OAK_WOODEN_STAIRS = 53;
    int CHEST = 54;
    int REDSTONE_WIRE = 55;
    int DIAMOND_ORE = 56;
    int DIAMOND_BLOCK = 57;
    int CRAFTING_TABLE = 58;
    int WORKBENCH = 58;
    int WHEAT_BLOCK = 59;
    int FARMLAND = 60;
    int FURNACE = 61;
    int BURNING_FURNACE = 62;
    int LIT_FURNACE = 62;
    int SIGN_POST = 63;
    int DOOR_BLOCK = 64;
    int WOODEN_DOOR_BLOCK = 64;
    int WOOD_DOOR_BLOCK = 64;
    int LADDER = 65;
    int RAIL = 66;
    int COBBLE_STAIRS = 67;
    int COBBLESTONE_STAIRS = 67;
    int WALL_SIGN = 68;
    int LEVER = 69;
    int STONE_PRESSURE_PLATE = 70;
    int IRON_DOOR_BLOCK = 71;
    int WOODEN_PRESSURE_PLATE = 72;

    int REDSTONE_ORE = 73;
    int GLOWING_REDSTONE_ORE = 74;
    int LIT_REDSTONE_ORE = 74;
    int UNLIT_REDSTONE_TORCH = 75;
    int REDSTONE_TORCH = 76;
    int STONE_BUTTON = 77;
    int SNOW = 78;
    int SNOW_LAYER = 78;
    int ICE = 79;
    int SNOW_BLOCK = 80;
    int CACTUS = 81;
    int CLAY_BLOCK = 82;
    int REEDS = 83;
    int SUGARCANE_BLOCK = 83;
    int JUKEBOX = 84;
    int FENCE = 85;
    int PUMPKIN = 86;
    int NETHERRACK = 87;
    int SOUL_SAND = 88;
    int GLOWSTONE = 89;
    int GLOWSTONE_BLOCK = 89;
    int NETHER_PORTAL = 90;
    int LIT_PUMPKIN = 91;
    int JACK_O_LANTERN = 91;
    int CAKE_BLOCK = 92;
    int UNPOWERED_REPEATER = 93;
    int POWERED_REPEATER = 94;
    int INVISIBLE_BEDROCK = 95;
    int TRAPDOOR = 96;
    int MONSTER_EGG = 97;
    int STONE_BRICKS = 98;
    int STONE_BRICK = 98;
    int BROWN_MUSHROOM_BLOCK = 99;
    int RED_MUSHROOM_BLOCK = 100;
    int IRON_BAR = 101;
    int IRON_BARS = 101;
    int GLASS_PANE = 102;
    int GLASS_PANEL = 102;
    int MELON_BLOCK = 103;
    int PUMPKIN_STEM = 104;
    int MELON_STEM = 105;
    int VINE = 106;
    int VINES = 106;
    int FENCE_GATE = 107;
    int FENCE_GATE_OAK = 107;
    int BRICK_STAIRS = 108;
    int STONE_BRICK_STAIRS = 109;
    int MYCELIUM = 110;
    int WATER_LILY = 111;
    int LILY_PAD = 111;
    int NETHER_BRICKS = 112;
    int NETHER_BRICK_BLOCK = 112;
    int NETHER_BRICK_FENCE = 113;
    int NETHER_BRICKS_STAIRS = 114;
    int NETHER_WART_BLOCK = 115;
    int ENCHANTING_TABLE = 116;
    int ENCHANT_TABLE = 116;
    int ENCHANTMENT_TABLE = 116;
    int BREWING_STAND_BLOCK = 117;
    int BREWING_BLOCK = 117;
    int CAULDRON_BLOCK = 118;
    int END_PORTAL = 119;
    int END_PORTAL_FRAME = 120;
    int END_STONE = 121;
    int DRAGON_EGG = 122;
    int REDSTONE_LAMP = 123;
    int LIT_REDSTONE_LAMP = 124;
    //Note: dropper CAN NOT BE HARVESTED WITH HAND -- canHarvestWithHand method should be overridden FALSE.
    int DROPPER = 125;
    int ACTIVATOR_RAIL = 126;
    int COCOA = 127;
    int COCOA_BLOCK = 127;
    int SANDSTONE_STAIRS = 128;
    int EMERALD_ORE = 129;
    int ENDER_CHEST = 130;
    int TRIPWIRE_HOOK = 131;
    int TRIPWIRE = 132;
    int EMERALD_BLOCK = 133;
    int SPRUCE_WOOD_STAIRS = 134;
    int SPRUCE_WOODEN_STAIRS = 134;
    int BIRCH_WOOD_STAIRS = 135;
    int BIRCH_WOODEN_STAIRS = 135;
    int JUNGLE_WOOD_STAIRS = 136;
    int JUNGLE_WOODEN_STAIRS = 136;

    int BEACON = 138;
    int COBBLE_WALL = 139;
    int STONE_WALL = 139;
    int COBBLESTONE_WALL = 139;
    int FLOWER_POT_BLOCK = 140;
    int CARROT_BLOCK = 141;
    int POTATO_BLOCK = 142;
    int WOODEN_BUTTON = 143;
    int SKULL_BLOCK = 144;
    int ANVIL = 145;
    int TRAPPED_CHEST = 146;
    int LIGHT_WEIGHTED_PRESSURE_PLATE = 147;
    int HEAVY_WEIGHTED_PRESSURE_PLATE = 148;
    int UNPOWERED_COMPARATOR = 149;
    int POWERED_COMPARATOR = 150;
    int DAYLIGHT_DETECTOR = 151;
    int REDSTONE_BLOCK = 152;
    int QUARTZ_ORE = 153;
    int HOPPER_BLOCK = 154;
    int QUARTZ_BLOCK = 155;
    int QUARTZ_STAIRS = 156;
    int DOUBLE_WOOD_SLAB = 157;
    int DOUBLE_WOODEN_SLAB = 157;
    int DOUBLE_WOOD_SLABS = 157;
    int DOUBLE_WOODEN_SLABS = 157;
    int WOOD_SLAB = 158;
    int WOODEN_SLAB = 158;
    int WOOD_SLABS = 158;
    int WOODEN_SLABS = 158;
    int STAINED_TERRACOTTA = 159;
    int STAINED_HARDENED_CLAY = 159;
    int STAINED_GLASS_PANE = 160;
    int LEAVES2 = 161;
    int LEAVE2 = 161;
    int WOOD2 = 162;
    int TRUNK2 = 162;
    int LOG2 = 162;
    int ACACIA_WOOD_STAIRS = 163;
    int ACACIA_WOODEN_STAIRS = 163;
    int DARK_OAK_WOOD_STAIRS = 164;
    int DARK_OAK_WOODEN_STAIRS = 164;
    int SLIME_BLOCK = 165;

    int IRON_TRAPDOOR = 167;
    int PRISMARINE = 168;
    int SEA_LANTERN = 169;
    int HAY_BALE = 170;
    int CARPET = 171;
    int TERRACOTTA = 172;
    int COAL_BLOCK = 173;
    int PACKED_ICE = 174;
    int DOUBLE_PLANT = 175;
    int STANDING_BANNER = 176;
    int WALL_BANNER = 177;
    int DAYLIGHT_DETECTOR_INVERTED = 178;
    int RED_SANDSTONE = 179;
    int RED_SANDSTONE_STAIRS = 180;
    int DOUBLE_RED_SANDSTONE_SLAB = 181;
    int RED_SANDSTONE_SLAB = 182;
    int FENCE_GATE_SPRUCE = 183;
    int FENCE_GATE_BIRCH = 184;
    int FENCE_GATE_JUNGLE = 185;
    int FENCE_GATE_DARK_OAK = 186;
    int FENCE_GATE_ACACIA = 187;

    int SPRUCE_DOOR_BLOCK = 193;
    int BIRCH_DOOR_BLOCK = 194;
    int JUNGLE_DOOR_BLOCK = 195;
    int ACACIA_DOOR_BLOCK = 196;
    int DARK_OAK_DOOR_BLOCK = 197;
    int GRASS_PATH = 198;
    int ITEM_FRAME_BLOCK = 199;
    int CHORUS_FLOWER = 200;
    int PURPUR_BLOCK = 201;

    int PURPUR_STAIRS = 203;
    //int DOUBLE_PURPUR_SLAB = 204;
    int UNDYED_SHULKER_BOX = 205;
    int END_BRICKS = 206;
    //Note: frosted ice CAN NOT BE HARVESTED WITH HAND -- canHarvestWithHand method should be overridden FALSE.
    int ICE_FROSTED = 207;
    int END_ROD = 208;
    int END_GATEWAY = 209;
    //int ALLOW = 210;
    //int DENY = 211;
    //int BORDER = 212;
    int MAGMA = 213;
    int BLOCK_NETHER_WART_BLOCK = 214;
    int RED_NETHER_BRICK = 215;
    int BONE_BLOCK = 216;

    int SHULKER_BOX = 218;
    int PURPLE_GLAZED_TERRACOTTA = 219;
    int WHITE_GLAZED_TERRACOTTA = 220;
    int ORANGE_GLAZED_TERRACOTTA = 221;
    int MAGENTA_GLAZED_TERRACOTTA = 222;
    int LIGHT_BLUE_GLAZED_TERRACOTTA = 223;
    int YELLOW_GLAZED_TERRACOTTA = 224;
    int LIME_GLAZED_TERRACOTTA = 225;
    int PINK_GLAZED_TERRACOTTA = 226;
    int GRAY_GLAZED_TERRACOTTA = 227;
    int SILVER_GLAZED_TERRACOTTA = 228;
    int CYAN_GLAZED_TERRACOTTA = 229;
    
    int BLUE_GLAZED_TERRACOTTA = 231;
    int BROWN_GLAZED_TERRACOTTA = 232;
    int GREEN_GLAZED_TERRACOTTA = 233;
    int RED_GLAZED_TERRACOTTA = 234;
    int BLACK_GLAZED_TERRACOTTA = 235;
    int CONCRETE = 236;
    int CONCRETE_POWDER = 237;

    int CHORUS_PLANT = 240;
    int STAINED_GLASS = 241;
    
    int PODZOL = 243;
    int BEETROOT_BLOCK = 244;
    int STONECUTTER = 245;
    int GLOWING_OBSIDIAN = 246;
    int NETHER_REACTOR = 247; //Should not be removed

    int MOVING_BLOCK = 250;

    int OBSERVER = 251;

    int PRISMARINE_STAIRS = 257;
    int DARK_PRISMARINE_STAIRS = 258;
    int PRISMARINE_BRICKS_STAIRS = 259;
    int STRIPPED_SPRUCE_LOG = 260;
    int STRIPPED_BIRCH_LOG = 261;
    int STRIPPED_JUNGLE_LOG = 262;
    int STRIPPED_ACACIA_LOG = 263;
    int STRIPPED_DARK_OAK_LOG = 264;
    int STRIPPED_OAK_LOG = 265;
    int BLUE_ICE = 266;

    int SEAGRASS = 385;
    int CORAL = 386;
    int CORAL_BLOCK = 387;
    int CORAL_FAN = 388;
    int CORAL_FAN_DEAD = 389;
    int CORAL_FAN_HANG = 390;
    int CORAL_FAN_HANG2 = 391;
    int CORAL_FAN_HANG3 = 392;
    int BLOCK_KELP = 393;
    int DRIED_KELP_BLOCK = 394;
    int ACACIA_BUTTON = 395;
    int BIRCH_BUTTON = 396;
    int DARK_OAK_BUTTON = 397;
    int JUNGLE_BUTTON = 398;
    int SPRUCE_BUTTON = 399;
    int ACACIA_TRAPDOOR = 400;
    int BIRCH_TRAPDOOR = 401;
    int DARK_OAK_TRAPDOOR = 402;
    int JUNGLE_TRAPDOOR = 403;
    int SPRUCE_TRAPDOOR = 404;
    int ACACIA_PRESSURE_PLATE = 405;
    int BIRCH_PRESSURE_PLATE = 406;
    int DARK_OAK_PRESSURE_PLATE = 407;
    int JUNGLE_PRESSURE_PLATE = 408;
    int SPRUCE_PRESSURE_PLATE = 409;
    int CARVED_PUMPKIN = 410;
    int SEA_PICKLE = 411;
    int CONDUIT = 412;

    int TURTLE_EGG = 414;
    int BUBBLE_COLUMN = 415;
    int BARRIER = 416;
    int STONE_SLAB3 = 417;
    int BAMBOO = 418;
    int BAMBOO_SAPLING = 419;
    int SCAFFOLDING = 420;
    int STONE_SLAB4 = 421;
    int DOUBLE_STONE_SLAB3 = 422;
    int DOUBLE_STONE_SLAB4 = 423;
    int GRANITE_STAIRS = 424;
    int DIORITE_STAIRS = 425;
    int ANDESITE_STAIRS = 426;
    int POLISHED_GRANITE_STAIRS = 427;
    int POLISHED_DIORITE_STAIRS = 428;
    int POLISHED_ANDESITE_STAIRS = 429;
    int MOSSY_STONE_BRICK_STAIRS = 430;
    int SMOOTH_RED_SANDSTONE_STAIRS = 431;
    int SMOOTH_SANDSTONE_STAIRS = 432;
    int END_BRICK_STAIRS = 433;
    int MOSSY_COBBLESTONE_STAIRS = 434;
    int NORMAL_STONE_STAIRS = 435;
    int SPRUCE_STANDING_SIGN = 436;
    int SPRUCE_WALL_SIGN = 437;
    int SMOOTH_STONE = 438;
    int RED_NETHER_BRICK_STAIRS = 439;
    int SMOOTH_QUARTZ_STAIRS = 440;
    int BIRCH_STANDING_SIGN = 441;
    int BIRCH_WALL_SIGN = 442;
    int JUNGLE_STANDING_SIGN = 443;
    int JUNGLE_WALL_SIGN = 444;
    int ACACIA_STANDING_SIGN = 445;
    int ACACIA_WALL_SIGN = 446;
    int DARKOAK_STANDING_SIGN = 447;
    int DARK_OAK_STANDING_SIGN = 447;
    int DARKOAK_WALL_SIGN = 448;
    int DARK_OAK_WALL_SIGN = 448;
    int LECTERN = 449;
    int GRINDSTONE = 450;
    int BLAST_FURNACE = 451;
    int STONECUTTER_BLOCK = 452;
    int SMOKER = 453;
    int LIT_SMOKER = 454;
    int CARTOGRAPHY_TABLE = 455;
    int FLETCHING_TABLE = 456;
    int SMITHING_TABLE = 457;
    int BARREL = 458;
    int LOOM = 459;

    int BELL = 461;
    int SWEET_BERRY_BUSH = 462;
    int LANTERN = 463;
    int CAMPFIRE_BLOCK = 464;
    int LAVA_CAULDRON = 465;
    int JIGSAW = 466;
    int WOOD_BARK = 467;
    int COMPOSTER = 468;
    int LIT_BLAST_FURNACE = 469;
    int LIGHT_BLOCK = 470;
    int WITHER_ROSE = 471;
    int STICKYPISTONARMCOLLISION = 472;
    int PISTON_HEAD_STICKY = 472;
    int BEE_NEST = 473;
    int BEEHIVE = 474;
    int HONEY_BLOCK = 475;
    int HONEYCOMB_BLOCK = 476;
    
    //int LODESTONE = 477;
    //int CRIMSON_ROOTS = 478;
    //int WARPED_ROOTS = 479;
    int CRIMSON_STEM = 480;
    int WARPED_STEM = 481;
    int WARPED_WART_BLOCK = 482; 
    int CRIMSON_FUNGUS = 483;
    int WARPED_FUNGUS = 484;
    int SHROOMLIGHT = 485;
    //int WEEPING_VINES = 486;
    int CRIMSON_NYLIUM = 487;
    int WARPED_NYLIUM = 488;
    //int BASALT = 489;
    //int POLISHED_BASALT = 490; 
    int SOUL_SOIL = 491;
    //int SOUL_FIRE = 492;
    //int NETHER_SPROUTS = 493; 
    //int TARGET = 494;
    int STRIPPED_CRIMSON_STEM = 495; 
    int STRIPPED_WARPED_STEM = 496;
    int CRIMSON_PLANKS = 497;
    int WARPED_PLANKS = 498;
    int CRIMSON_DOOR_BLOCK = 499;
    int WARPED_DOOR_BLOCK = 500;
    int CRIMSON_TRAPDOOR = 501; 
    int WARPED_TRAPDOOR = 502;
    // 503
    // 504
    int CRIMSON_STANDING_SIGN = 505;
    int WARPED_STANDING_SIGN = 506;
    int CRIMSON_WALL_SIGN = 507;
    int WARPED_WALL_SIGN = 508;
    int CRIMSON_STAIRS = 509;
    int WARPED_STAIRS = 510;
    int CRIMSON_FENCE = 511;
    int WARPED_FENCE = 512;
    int CRIMSON_FENCE_GATE = 513;
    int WARPED_FENCE_GATE = 514;
    int CRIMSON_BUTTON = 515;
    int WARPED_BUTTON = 516;
    int CRIMSON_PRESSURE_PLATE = 517;
    int WARPED_PRESSURE_PLATE = 518;
    int CRIMSON_SLAB = 519;
    int WARPED_SLAB = 520;
    int CRIMSON_DOUBLE_SLAB = 521;
    int WARPED_DOUBLE_SLAB = 522;
    //int SOUL_TORCH = 523;
    //int SOUL_LANTERN = 524;
    int NETHERITE_BLOCK = 525;
    //int ANCIENT_DERBIS = 526;
    //int RESPAWN_ANCHOR = 527;
    int BLACKSTONE = 528;
    //int POLISHED_BLACKSTONE_BRICKS = 529;
    //int POLISHED_BLACKSTONE_BRICK_STAIRS = 530;
    //int BLACKSTONE_STAIRS = 531;
    //int BLACKSTONE_WALL = 532;
    //int POLISHED_BLACKSTONE_BRICK_WALL = 533;
    //int CHISELED_POLISHED_BLACKSTONE = 534;
    //int CRACKED_POLISHED_BLACKSTONE_BRICKS = 535;
    //int GILDED_BLACKSTONE = 536;
    int BLACKSTONE_SLAB = 537;
    int BLACKSTONE_DOUBLE_SLAB = 538;
    //int POLISHED_BLACKSTONE_BRICK_SLAB = 539;
    //int POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB = 540;
    //int CHAIN_BLOCK = 541;
    //int TWISTING_VINES = 542;
    //int NETHER_GOLD_ORE = 543;
    //int CRYING_OBSIDIAN = 544;
    //int SOUL_CAMPFIRE = 545;
    //int POLISHED_BLACKSTONE = 546;
    //int POLISHED_BLACKSTONE_STAIRS = 547;
    //int POLISHED_BLACKSTONE_SLAB = 548;
    //int POLISHED_BLACKSTONE_DOUBLE_SLAB = 549;
    //int POLISHED_BLACKSTONE_PRESSURE_PLATE = 550;
    //int POLISHED_BLACKSTONE_BUTTON = 551;
    //int POLISHED_BLACKSTONE_WALL = 552;
    int WARPED_HYPHAE = 553;
    int CRIMSON_HYPHAE = 554;
    int STRIPPED_CRIMSON_HYPHAE = 555;
    int STRIPPED_WARPED_HYPHAE = 556;
    //int CHISELED_NETHER_BRICKS = 557;
    //int CRACKED_NETHER_BRICKS = 558;
    //int QUARTZ_BRICKS = 559;
}
