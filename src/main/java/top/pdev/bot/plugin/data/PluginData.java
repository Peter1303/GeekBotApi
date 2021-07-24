package top.pdev.bot.plugin.data;

import java.io.File;

/**
 * 插件信息
 *
 * @author Peter1303
 */
public class PluginData {
    private int version;
    private File plugin;

    /**
     * 插件版本
     *
     * @return 版本说明
     */
    public int getVersion() {
        return version;
    }

    /**
     * 插件资料目录
     *
     * @return 不存在则会自动创建
     */
    public File getPlugin() {
        return plugin;
    }
}
