package proxy;

/**
 * @author coderyong
 * @date 2018/4/10
 */
public interface Searcher {
    /**
     * 执行搜索
     *
     * @param userId  用户Id
     * @param keyword 搜索字段
     * @return
     */
    String doSearch(String userId, String keyword);
}
