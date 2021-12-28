package dev.salmon.weatherchanger;

import dev.salmon.weatherchanger.command.WeatherChangerCommand;
import dev.salmon.weatherchanger.config.WeatherChangerConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = WeatherChanger.ID, name = WeatherChanger.NAME, version = WeatherChanger.VER)
public class WeatherChanger {
    public static final String NAME = "@NAME@", VER = "@VER@", ID = "@ID@";
    private static WeatherChanger instance;
    private WeatherChangerConfig config;

    @Mod.EventHandler
    protected void preInit(FMLPreInitializationEvent event) {
        instance = this;
    }

    @Mod.EventHandler
    protected void init(FMLInitializationEvent event) {
        new WeatherChangerCommand().register();
        this.config = new WeatherChangerConfig();
    }

    public WeatherChangerConfig getConfig() { return this.config; }

    public static WeatherChanger getWeatherChanger() { return instance; }
}
