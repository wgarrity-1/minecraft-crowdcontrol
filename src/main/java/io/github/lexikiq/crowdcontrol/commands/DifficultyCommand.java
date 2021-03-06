package io.github.lexikiq.crowdcontrol.commands;

import io.github.lexikiq.crowdcontrol.ChatCommand;
import io.github.lexikiq.crowdcontrol.CrowdControl;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DifficultyCommand extends ChatCommand {
    private final Difficulty difficulty;

    public DifficultyCommand(CrowdControl plugin, Difficulty difficulty) {
        super(plugin);
        this.difficulty = difficulty;
    }

    @Override
    public @NotNull String getCommand() {
        return difficulty.name();
    }

    @Override
    public int getCooldownSeconds() {
        return 0;
    }

    @Override
    public boolean execute(String authorName, List<Player> players, String... args) {
        for (World world : plugin.getServer().getWorlds()) {
            world.setDifficulty(difficulty);
        }
        return true;
    }
}
