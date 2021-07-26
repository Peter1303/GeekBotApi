package top.pdev.bot.plugin.log;

import top.pdev.bot.plugin.data.PluginInfo;

/**
 * 日志
 *
 * @author Peter1303
 */
public class GBPLogger {

    private PluginInfo pluginInfo;

    /**
     * 需要传入插件信息
     * 推荐 init 时候就实例化打印工具
     * @param pluginInfo
     */
    public GBPLogger(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    /**
     * 打印调试日志
     * @param object
     */
    public void debug(Object object) {
    }

    /**
     * 信息级别
     * @param object
     */
    public void i(Object object) {
    }

    /**
     * 错误级别
     * @param object
     */
    public void e(Object object) {
    }

    /**
     * 警告级别
     * @param object
     */
    public void w(Object object) {
    }

    /**
     * 控制台显示级别
     * @param object
     */
    public void c(Object object) {
    }
}
