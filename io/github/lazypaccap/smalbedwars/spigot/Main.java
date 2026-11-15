//Copyright (C) 2026 lazypaCCap
//smalBedwars
//This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
//This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
//You should have received a copy of the GNU Affero General Public License along with this program. If not, see <https://www.gnu.org/licenses/>.

package io.github.lazypaccap.smalbedwars.spigot;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import java.io.File;
public class Main extends JavaPlugin {
    private int[] status = {2}; //初始化一个房间
    @Override
    public void onEnable(){
        String version = getDescription().getVersion();
        Bukkit.getLogger().info("smalbedwars启动。");
        getLogger().info("版本："+version);
        File configfile=new File("plugins/smalbedwars/config.yml");
        File plugindire=new File("plugins/smalbedwars");
        if (!plugindire.isDirectory()){ //创建目录
            var isok=plugindire.mkdir();
            if (!isok){
                getLogger().severe("创建目录时报错，本插件已禁用");
                Bukkit.getPluginManager().disablePlugin(this);
                return;
            }
        }
    }
}
