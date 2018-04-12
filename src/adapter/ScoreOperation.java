package adapter;

/**
 * @author coderyong
 * @date 2018/3/20
 */
public interface ScoreOperation {
    /**
     * 成绩排序
     *
     * @param array 成绩数组
     * @return 排序结果
     */
    int[] sort(int[] array);

    /**
     * 成绩查找
     *
     * @param array 成绩数组
     * @param key
     * @return 查询结果
     */
    int search(int[] array, int key);
}
