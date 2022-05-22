package io.github.yotutxt.UI

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.plugin.java.JavaPlugin

class UIPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info("online")
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    public fun onJoin(event: PlayerJoinEvent) {
        val name = event.player.name
        event.joinMessage = "§a[+] §r${name} §2joined! ˊ꒳ˋ"
    }

    @EventHandler
    public fun onQuit(event: PlayerQuitEvent) {
        event.quitMessage = null
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}