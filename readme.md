# 程序员翻译工具后端（java）
技术栈：java,springboot,httpClient,有道云翻译api
前端页面：[https://github.com/qiuquanwu/vite-programer](https://github.com/qiuquanwu/vite-programer)
## 使用方法：
- 注册有道智云：[注册地址](http://ai.youdao.com/product-fanyi-text.s "注册地址")
- 添加应用
![](https://i.loli.net/2020/08/08/XJIZFRQAl9zUMbG.png)
- 添加翻译实例
![](https://i.loli.net/2020/08/08/XTUW24YgROvJfm8.png)
- 绑定应用
![](https://i.loli.net/2020/08/08/hENDWf2bZSIJtkY.png)
- 获取appKey和appSecret
![](https://i.loli.net/2020/08/08/76hZuMIxvAcOBlK.png)

修改配置文件(src\main\resources\application.yml)的appKey和appSecret
```yaml
spring:
    application:
        name: programmerTranslator
serve:
    port: 8080
ydCloud:
    translate:
        ydUrl: https://openapi.youdao.com/api
        appKey: xxxx
        appSecret: xxxx
```