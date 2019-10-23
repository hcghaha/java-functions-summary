public class JavaBaseDataType {

    public static void main(String[] args) {
//        testFloat();
        testFloat2();
    }


    private static void testFloat(){
        float f = 0.1f;
        double d = 1.0 /10;
        System.out.println(f==d);
    }


    private static void testFloat3(){
        double f =0.1f;
        System.out.println(f==0.1f);
    }

    private static void testFloat2(){
        float d1 = 423432423f;
        float d2 = d1+1;
        if(d1==d2){
            System.out.println("d1==d2");//输出结果为d1==d2
        }else{
            System.out.println("d1!=d2");
        }
    }


}
