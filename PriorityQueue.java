import java.util.ArrayList;

public class PriorityQueue {
    ArrayList<Integer> data= new ArrayList<>();
    void add(int val){
        data.add(val);
        unheapefy(data.size()-1);
    }
    private void unheapefy(int ci){
        int pi=(ci-1)/2;
        if (data.get(pi)<data.get(ci)){
            swap(pi,ci);
            unheapefy(pi);
        }
    }
    private void swap(int pi,int ci){
        int parent=data.get(pi);
        data.set(pi, data.get(ci));
        data.set(ci,parent);

    }
    int remove(){
        int values=data.get(0);
        data.set(0,data.get(data.size()-1));
        data.remove(data.size()-1);
        downheapefy(0);
        return values;
    }
    private void downheapefy(int pi){
        int idx=pi;
        int lci=2*pi+1;
        int rci=2*pi+2;
        if(lci<data.size()&&data.get(lci)>data.get(idx)){
            idx=lci;
        }
        if(rci<data.size() && data.get(rci)>data.get(idx)){
            idx=rci;
        }
        if(idx!=pi){
            swap(pi,idx);
            downheapefy(idx);
        }
    }
    

    public static void main(String[] args) {
        PriorityQueue pq= new PriorityQueue();
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(4);
        pq.add(1);
        pq.add(9);
        System.out.println(pq.data);
        pq.remove();
        System.out.println(pq.data);
    }
}











