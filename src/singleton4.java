public class singleton4 {//静态内部类的实现
    //同样也是采用了classloader的机制
    //和饿汉的不同是 饿汉只要single类被装载就会被实例化，这里只有现实通过调用getinstance方法才会被实例化
    private  singleton4(){}
    private static class singletonholder{
        public static final singleton4 instance=new singleton4();
    }
    public static singleton4 getInstance(){
        return singletonholder.instance;
    }
}
