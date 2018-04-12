package proxy;

class Client {
    public static void main(String[] args) {

        //反射生成对象，针对抽象编程，客户端无须分辨真实主题类和代理类
        Searcher searcher = new ProxySearcher();

        String result = searcher.doSearch("杨过", "玉女心经");
        System.out.println(result);
    }
}