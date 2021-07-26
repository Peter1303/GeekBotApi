package top.pdev.bot.util.network;

import java.util.HashMap;

/**
 * 网络请求工具类
 *
 * @author Peter1303
 */
public class HttpRequest {

    public static final String UTF_8 = "UTF-8";
    public static final String GB2312 = "GB2312";

    public static final String UA_CHROME = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.101 Safari/537.36";

    private String userAgent = "";
    private HashMap<String, String> headers = null;
    private HashMap<String, String> getParams = null;

    private String url;
    private HashMap<String, String> params = new HashMap<>();

    public HttpRequest(String url) {
        this.url = url;
    }

    /**
     * 设置 UA
     * @param userAgent UA
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * 设置请求头
     * @param headers 请求头
     */
    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    /**
     * 设置 GET 参数
     * <p>GET / POST 均使用</p>
     * @param getParams
     */
    public void setGetParams(HashMap<String, String> getParams) {
        this.getParams = getParams;
    }

    /**
     * 发起 GET 请求
     *
     * @param params  参数列表
     * @param charset 编码
     * @return 结果
     */
    public String get(HashMap<String, String> params, String charset) {
        return get(url, 0, params, charset);
    }

    /**
     * 发起 GET 请求
     * 默认 UTF-8编码
     *
     * @param params 参数列表
     * @return 结果
     */
    public String get(HashMap<String, String> params) {
        return get(url, 0, params, UTF_8);
    }

    /**
     * 发起 GET 请求
     *
     * @return
     */
    public String get() {
        return get(url, 0, null, UTF_8);
    }

    /**
     * 发起 POST 请求
     *
     * @param params  参数列表
     * @param charset 编码
     * @return 结果
     */
    public String post(HashMap<String, String> params, String charset) {
        return post(url, params, charset);
    }

    /**
     * 发起 POST 请求
     * 默认 UTF-8 编码
     *
     * @param params 参数列表
     * @return 结果
     */
    public String post(HashMap<String, String> params) {
        return post(url, params, UTF_8);
    }

    /**
     * GET 请求
     *
     * @param link 链接
     * @param port 端口
     * @param list 参数
     * @return 字符串
     */
    public String get(String link, int port, HashMap<String, String> list, String charset) {
        return null;
    }

    /**
     * POST 请求
     *
     * @param url     链接
     * @param list    参数
     * @param charset 编码
     * @return 结果
     */
    public String post(String url, HashMap<String, String> list, String charset) {
        return null;
    }
}
