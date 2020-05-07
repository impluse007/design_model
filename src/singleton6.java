public class singleton6 {//双重校验锁
    //因为实例只需要被实例化一次之后就可以直接使用了，所以加锁实际上只需要对实例化那部分的代码使用
    //只有没有被实例化的时候才需要被加锁
    private volatile static singleton6 Singleton;//这里采用violatile关键字也是有必要的 可以禁止jvm的指令重排
    private singleton6(){}
    public static singleton6 getSingleton(){
        if(Singleton==null){
            synchronized (singleton6.class){
                if(Singleton==null)
                    Singleton=new singleton6();
            }
        }
        return Singleton;
    }
}
