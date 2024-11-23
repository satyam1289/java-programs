import java.util.*;
public class disjoint{
    int val;
    Node parent;
    int rank;
    
}
HashMap<Integer,Node>map=new HashMap<>();

public void create(int v){
    Node nn=new Node();
    nn.val=v;
    nn.rank=0;
    nn.parent=nn;
    map.put(v,nn);
}

}
public int findparent(int v){
    Node nn=map.get(v);
    return findparent(nn).val;
    
}
public Node findparent(Node nn){
    if(nn.parent==nn){
        return nn;
    }
    Node n=findparent(nn.parent);
    nn.parent=n;
}

public void union(int v1,int v2){
    Node n1=map.get(v1);
    Node n2=map.get(v2);
    Node re1=findparent(n1);
    Node re2=findparent(n2);
    if(re1.rank==re2.rank){
        re1.parent=re2;
        re2.rank=re2.rank+1;
        
    }else if(re1.rank>re2.rank){
        re2.parent=re1;
    }else{
        re1.parent=re2
    }
    public static void main(string[]agrs){
        
    }
    
}
