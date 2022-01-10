package studio.craftory

import org.bstats.bukkit.Metrics
import org.bukkit.plugin.java.JavaPlugin

lateinit var BLAZE: Blaze

class Blaze : JavaPlugin() {
    override fun onEnable() {
        BLAZE = this

        Metrics(this, 13890)
        println("Blaze is enabled!")
    }

    override fun onDisable() {
        println("Blaze is disabled!")
    }
}