package muddy.top.wechatdemo.Utils;

/**
 * @Author Muddy
 * @Time 2018/8/28
 * @Describe 配置地址
 */
public class StaticClass {
    //语言字段
    public static final String LOCALE_LANGUAGE = "locale_language";
    //腾讯微信软件许可及服务协议url
    public static final String PROTOCOL_ONE    = "https://weixin.qq.com/agreement?lang=zh_CN";
        //腾讯隐私保护指南url
        public static final String PROTOCOL_TWO = "https://weixin.qq.com/agreement?lang=zh_CN&cc=CN&s=privacy&scene=setting&v=0&needopenplatform=0";
        //手机号码正则
        public static final String PHONE_NUMBER_REG = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";

}
