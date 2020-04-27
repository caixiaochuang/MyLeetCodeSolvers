import java.util.List;

public class NmaxDepth {

    //深度就是递归节点的最大值
    int maxlen = 1;
    int templen = 0;
    public int maxDepth(Node root) {
        if(root == null ) return 0;
        List<Node> nodes = root.children;
        for (Node node : nodes) {
            templen++;
            maxDepth(node);
            maxlen = Integer.max(maxlen,templen);
            //回溯为0
            templen = 0;
        }
        return maxlen;
    }

}
