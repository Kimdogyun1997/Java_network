public class Node {
    public String data;

    @Override
    public String toString() {
        return "노드의 데이터 값은" + data + "입니다";
    }


    public Node link; // Node = 받을 타입이 자기 자신


}
