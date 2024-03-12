package interfaces_prac.marker;

public class MarkerDemo {

    public void delete(Object obj) {
        try{
        if (obj instanceof MyInterface){
            System.out.println("hello" );
        }
        else { throw new Exception("missed");}
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MarkerDemo demo = new MarkerDemo();
//        demo.delete(new MarkableInterfaceimpl());
        demo.delete("");
    }
}
