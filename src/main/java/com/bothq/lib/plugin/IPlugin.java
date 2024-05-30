package com.bothq.lib.plugin;

import com.bothq.lib.plugin.config.IConfig;
import com.bothq.lib.plugin.config.enabled.IEnabled;
import net.dv8tion.jda.api.JDA;

/**
 * The Plugin interface needed for the core framework to know where the entry point is, as well as handling
 * other interactions between core framework and the plugin. Class instance will be created using Reflection.
 * Constructor must be public accessible, without any parameters.
 */
public interface IPlugin {
    IEnabled getEnabled();
    default boolean isEnabled(long serverId) {
        return getEnabled()
                .get(serverId)
                .isEnabled();
    }


    /**
     * Get the name of the plugin.
     *
     * @return The name of the plugin.
     */
    String getName();

    /**
     * Get the description of the plugin.
     *
     * @return The description of the plugin.
     */
    String getDescription();

    /**
     * Initializes the plugin by calling this method and passing the JDA instance to store for later use.
     *
     * @param jda The JDA instance.
     */
    void initialize(JDA jda);

    /**
     * Create the configuration for the core framework to use.
     *
     * @param config The config instance provided by the core.
     */
    void createConfig(IConfig config);

    /**
     * Triggered once the plugin is loaded by the core framework and ready to be used. This does not automatically
     * mean that JDA is already in ready state. Use DiscordEventListener along with ReadyEvent for that.
     */
    void pluginLoad();

    /**
     * Triggered once the plugin is unloaded by the core framework. Should be used to dispose all memory allocations.
     */
    void pluginUnload();
}
