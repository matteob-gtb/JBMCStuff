package OOPFeatures;
 

class C {

}

class D extends C {

}

public class IllegalCasting {
    public static void main(String[] args) {
        C objC = new C();
        try {
            D otherObj = (D) objC;
        } catch (Exception e) {
            assert false;
        }
    }
}
