package brocode.datastructures.lists;

public class TestDynamics {
    public static void main(String[] args) {
        DynamicArrays dynamicArrays = new DynamicArrays(4);

        dynamicArrays.add("a");//0
        dynamicArrays.add("h");//1
        dynamicArrays.add("y");//2
        dynamicArrays.insert(2,"A48");
        dynamicArrays.insert(3,"B48");

        System.out.println(dynamicArrays);
        System.out.println(dynamicArrays.isEmpty());


    }
}
