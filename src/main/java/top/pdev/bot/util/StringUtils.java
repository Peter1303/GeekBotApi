package top.pdev.bot.util;

public class StringUtils {
    /**
     * 是否有其中之一
     *
     * @param object
     * @param values
     * @return
     */
    public static boolean has(String object, String... values) {
        return false;
    }

    /**
     * 是否开头有
     *
     * @param object 检测
     * @param values 内容
     * @return
     */
    public static boolean startsWith(String object, String... values) {
        return false;
    }

    /**
     * 是否空白
     * 可判断 null
     *
     * @param string
     * @return
     */
    public static boolean isBlank(String string) {
        return false;
    }

    /**
     * 任意一个空白
     * @param values
     * @return null/空
     */
    public static boolean isAnyBlank(String... values) {
        return false;
    }

    /**
     * 删除多余的空格
     *
     * @param string
     * @return
     */
    public static String deleteRedundantBlank(String string) {
        return null;
    }

    /**
     * 状态文本
     * @param enabled 状态
     * @return TRUE 为 ● | FALSE 为 ○
     */
    public static String getStatusText(boolean enabled) {
        return "";
    }
}
