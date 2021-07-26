package top.pdev.bot.plugin.data;

import top.pdev.bot.plugin.utils.PreferenceHelper;

import java.io.File;

/**
 * 插件信息
 *
 * @author Peter1303
 */
public class PluginData {
    private int version;
    private File plugin;
    private PreferenceHelper preferenceHelper;

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

    /**
     * 获取偏好数据帮助类
     * @return 偏好数据对象
     */
    public PreferenceHelper getPreferenceHelper() {
        return preferenceHelper;
    }
}
