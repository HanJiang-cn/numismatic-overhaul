package com.glisco.numismaticoverhaul;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RestartRequired;

@Modmenu(modId = "numismatic-overhaul")
@Config(name = "numismatic-overhaul", wrapperName = "NumismaticOverhaulConfig")
public class NumismaticOverhaulConfigModel {

    @RestartRequired
    @Comment("Whether villagers should use Numismatic currency for trading")
    public boolean enableVillagerTrading = true;

    @Comment("Whether taxes from Minecraft Comes Alive: Reborn should be delivered as Numismatic currency")
    public boolean enableMcaCompatibility = true;

    @RestartRequired
    @Comment("Whether Numismatic currency should be injected into the loot tables of loot chests")
    public boolean generateCurrencyInChests = true;

    @Comment("Where the purse in your inventory should be placed on the X axis")
    public int pursePositionX = 129;

    @Comment("Where the purse in your inventory should be placed on the Y axis")
    public int pursePositionY = 20;
}