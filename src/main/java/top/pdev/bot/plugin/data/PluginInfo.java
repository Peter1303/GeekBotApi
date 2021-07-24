package top.pdev.bot.plugin.data;

/**
 * 构造插件信息
 *
 * @author Peter1303
 */
public class PluginInfo {
    private String version;
    private int versionCode;
    private String pluginName;
    private String summary;
    private String author;

    public PluginInfo() {
    }

    public PluginInfo(String version, int versionCode, String pluginName, String author) {
        this.version = version;
        this.versionCode = versionCode;
        this.pluginName = pluginName;
        this.author = author;
    }

    /**
     * @return 插件版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version 插件版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return 插件代码
     */
    public int getVersionCode() {
        return versionCode;
    }

    /**
     * 设置插件版本代码
     *
     * @param versionCode 代码
     */
    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * @return 插件名字
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * 设置插件名字
     * 不宜过长
     *
     * @param pluginName 插件名字
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * 插件作者
     *
     * @return 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置插件作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 设置插件描述信息
     *
     * @param summary 插件描述
     *                非必要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
