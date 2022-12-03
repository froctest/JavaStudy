//这是我们教程学习的第一个项目
//这里定义了一个类
//类的定义规则是public class 类名{ ... }
//一个文件只能存在一个类
public class HelloWorld {//这里定义了一个名为HelloWorld的类
    //下面是main方法,程序运行时,JVM会先找到main方法,并运行
    //main方法的定义是固定的public static void main(String[] args) { ... }
    public static void main(String[] args) {
        //下面是打印语句,打印了"Hello World"
        //打印语句的写法也是固定的System.out.println(这里填要打印的内容);
        //注意: 语句写完后记得加";"
        System.out.println("Hello World");
        //其实还有一种打印语句System.out.print(这里填要打印的内容);
        //它与上面的打印语句不同的是
        //System.out.println(这里填要打印的内容);会换行
        //System.out.print(这里填要打印的内容);是不会换行的
    }
}

/*
小任务
    1.将System.out.println("Hello World");换成System.out.print("Hello World");
    2.打印:
        Powered by Java for AIDE
        Owner: OCTest
        Time: 2022.12.3
 */
