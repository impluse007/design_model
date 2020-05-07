public class singleton3 {//饿汉式的
    //直接进行实例化就不会产生线程不安全的，但是这样也就没有了之前的延迟实例化的好处
    //基于classloader机制
    private static singleton3 uniqueistance =new singleton3();
    private singleton3(){}
    public static singleton3 getuniqueinstance(){
        return uniqueistance;
    }
}
