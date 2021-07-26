package top.pdev.bot.plugin.utils;

import java.util.List;

/**
 * 数据偏好设置
 * <p>所有的数据据将会保存在插件的目录下</p>
 * <p>数据发生变动的时候别忘了 commit 进行提交保存哦</p>
 * @author Peter1303
 */
public class PreferenceHelper {

    /**
     * 默认加载配置文件
     * <p>默认文件名为 config</p>
     */
    public PreferenceHelper() {
    }

    /**
     * 配置文件的文件名
     * @param name 文件名（无需拓展名）
     */
    public PreferenceHelper(String name) {
    }

    /**
     * 存入字符串
     * @param tag 标签
     * @param value 值
     * @return 链式调用
     */
    public PreferenceHelper putString(String tag, String value) {
        return this;
    }

    /**
     * 存入 int
     * @param tag 标签
     * @param value 值
     * @return 链式调用
     */
    public PreferenceHelper putInt(String tag, int value) {
        return this;
    }

    /**
     * 存入 Long
     * @param tag 标签
     * @param value 值
     * @return 链式调用
     */
    public PreferenceHelper putLong(String tag, long value) {
        return this;
    }

    /**
     * 存入 Double
     * @param tag 标签
     * @param value 值
     * @return 链式调用
     */
    public PreferenceHelper putDouble(String tag, double value) {
        return this;
    }

    /**
     * 存入 String 泛型列表
     * @param tag 标签
     * @param list 列表
     * @return 链式调用
     */
    public PreferenceHelper putStrings(String tag, List<String> list) {
        return this;
    }

    /**
     * 存入 int 泛型列表
     * @param tag 标签
     * @param list 列表
     * @return 链式调用
     */
    public PreferenceHelper putInts(String tag, List<Integer> list) {
        return this;
    }

    /**
     * 存入 long 泛型列表
     * @param tag 标签
     * @param list 列表
     * @return 链式调用
     */
    public PreferenceHelper putLongs(String tag, List<Long> list) {
        return this;
    }

    /**
     * 存入 double 泛型列表
     * @param tag 标签
     * @param list 列表
     * @return 链式调用
     */
    public PreferenceHelper putDoubles(String tag, List<Double> list) {
        return this;
    }

    /**
     *
     * @param tag 标签
     * @return 链式调用
     */
    public String getString(String tag) {
        return null;
    }

    /**
     *
     * @param tag 标签
     * @param def 默认值
     * @return 链式调用
     */
    public int getInt(String tag, int def) {
        return 0;
    }

    /**
     *
     * @param tag 标签
     * @param def 默认值
     * @return 链式调用
     */
    public long getLong(String tag, long def) {
        return 0;
    }

    /**
     *
     * @param tag 标签
     * @param def 默认值
     * @return 链式调用
     */
    public double getDouble(String tag, double def) {
        return 0;
    }

    /**
     * 删除 tag 数据
     * @param tag 标签
     */
    public void remove(String tag) {
    }

    /**
     * 清空所有的数据
     */
    public void clear() {
    }

    /**
     * 返回 string 泛型列表
     * @param tag 标签
     * @return 不存在为 null
     */
    public List<String> getStrings(String tag) {
        return null;
    }

    /**
     * 返回 int 泛型列表
     * @param tag 标签
     * @return 不存在为 null
     */
    public List<Integer> getInts(String tag) {
        return null;
    }

    /**
     * 返回 long 泛型列表
     * @param tag 标签
     * @return 不存在为 null
     */
    public List<Long> getLongs(String tag) {
        return null;
    }

    /**
     * 返回 double 泛型列表
     * @param tag 标签
     * @return 不存在为 null
     */
    public List<Double> getDoubles(String tag) {
        return null;
    }

    /**
     * 提交数据变动
     * @return 是否保存成功
     */
    public boolean commit() {
        return false;
    }
}
