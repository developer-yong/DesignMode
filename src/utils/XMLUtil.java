package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author coderyong
 */
public class XMLUtil {

    public static Document createDocument() throws Exception {
        return DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().parse(new File("config.xml"));
    }

    /**
     * 该方法用于从XML配置文件中提取图表类型，并返回类型名
     *
     * @return
     */
    public static String getChartType() {
        try {
            //创建文档对象
            Document doc = createDocument();

            //获取包含图表类型的文本节点  
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            if (classNode != null) {
                String chartType = classNode.getNodeValue();
                return chartType.trim();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     *
     * @return 实体对象
     */
    public static Object getBean() {
        try {
            Document doc = createDocument();

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            if (classNode != null) {
                String cName = classNode.getNodeValue();
                //通过类名生成实例对象并将其返回
                return Class.forName(cName).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}