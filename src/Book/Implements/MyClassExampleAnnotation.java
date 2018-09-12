package Book.Implements;

@Deprecated
public class MyClassExampleAnnotation {

    private String msg;

    MyClassExampleAnnotation(String m ){
        msg = m;
    }

    @Deprecated
    String getMsg(){
        return msg;
    }
}
