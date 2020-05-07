public class singleton2 {//对getinstance加锁 就可以避免被多次实例化了
    //但是因为一个线程进入后其他都需要等待，即时已经被实例化了，所以这个方法性能不好
    private static singleton2 uniqueinstance;
    private singleton2(){
    }
    public static synchronized singleton2 getUniqueinstance(){
        if(uniqueinstance==null){
            uniqueinstance =new singleton2();
        }
        return uniqueinstance;
    }
}
