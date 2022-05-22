package io.github.yotutxt.UI

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info("online")
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}