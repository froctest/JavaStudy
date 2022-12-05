package study.a2;

//学习变量
public class HelloVar {
    public static void main(String[] args) {
        /*
        Java中共有八种类型,我现在只介绍7种,剩下一种(char)已经过时,就不去介绍了
        数字(6种)
            整数(4种)
                不包括小数点的数字,如5454 , 2354243 , -43435 , -23
                int :最常用,你一定要记住(int能表示9位的数字)
                long :int的增强版,它可表示的范围比int大(long能表示21位的数字),它默认会被当成int,需要在数字后面加L:    long l=7457874358743843984L;
                byte :了解一下就行了,它能表示的范围很小(-128~127),一般只用于底层文件处理,它默认会当成int,需要使用强制类型转换来提示JVM这是byte:    byte b=(byte)5
                short :至少对我来说没有什么用,非常少会用到,范围比int小,比byte大,它默认会当成int,需要使用强制类型转换来提示JVM这是short:    short b=(short)5
                取值范围从大到小递减:long > int > short > byte
            浮点数(2种)
                包括小数点的数叫做浮点数,如1145.14 , 3.1415 , 9955.2
                double :最常用
                float :比较少用,但还是要记住它的用法,它的取值范围比double小,它默认会被当成double,需要在数字后面加F:    float f=7457874358743843984F;
            运算
                +(加) , -(减) , *(乘) , /(除) , %(取余)
                取余
                    小学教的除法,当被除数不能完整除以除数,那就将余数写在......后面
                    还不懂看链接: https://zhidao.baidu.com/question/20849997.html
        布尔值(boolean),很常用
            它只有两种取值范围
                true:符合
                false:不符合
            运算
                || 或运算 它左右分别接收一个boolean,当左右两个boolean中有一个true,那么它就会返回true
                && 与运算 它左右分别接收一个boolean,当左右两个boolean中都是true,那么它就会返回true
        但我还是要插一脚,介绍String,虽然它并不属于基本类型,但是因为它实在太常用了,不得不介绍
            String是字符串,用于构建一段文本
            String str = "一段文本";
            用"来包围文本,如"Text"
            包围成的文本就成了字符串对象:String str = "Contents";
            字符串对象有以下常用方法:
                .length(): 获取字符串长度
                当然,常用方法可不止这么点,之后我会继续介绍String的其他常用方法

        变量的声明:
            类型 变量名;
            例:
                int value;
                double d;
                boolean result;
        变量的赋值:
            变量名 = 值;
            例:
                value = 43;
                d = 43.54;
                result = false;
        变量的声明与赋值可以连起来:
            类型 变量名 = 值;
            例:
                int s = 42;
                double d = 42.24;
                boolean result = false;
        变量的读取:
            假设有一个int:
            int value = s42;
            要把它打印出来:
            System.out.println(value);
        可以将变量赋值到其他变量
            如:
                int value = 42;
                int s = value;      //value = 42
        当然,变量变量,顾名思义,量可以变,也就是赋值后可以重新赋值:
            如:
                int value = 4;
                value = 4;
                //现在value为4
         */

        //这是变量的声明与赋值的演示
        System.out.println("这是变量的声明与赋值的演示");
        int i = 3;//用int最简单,直接填数字就行了
        System.out.println(i);
        short s = (short) 43;//用short需要强制将int数字转换成short数字
        System.out.println(s);
        byte b = (byte) 127;//用byte需要强制将int数字转换成byte数字
        System.out.println(b);
        long l = 2387438889328L;//用long需要在数字后面加上L
        System.out.println(l);
        double d = 43.234;//用double最简单,直接填数字就行了
        System.out.println(d);
        float f = 4332.1F;//用float需要在数字后面加上F
        System.out.println(f);
        boolean b1 =true;//
        System.out.println(b1);
        boolean b2 = false;//
        System.out.println(b2);
        String str = "This is a string";//
        System.out.println(str);

        //这里是数字的运算演示
        System.out.println("这里是数字的运算演示");
        System.out.println(1+2);
        System.out.println(5-1);
        System.out.println(10*15);
        System.out.println(60/6);
        System.out.println(5%2);

        //这里是字符串的演示
        System.out.println("这里是字符串的演示");
        System.out.println("Hello World".length());

        //这里是boolean的运算演示
        System.out.println("这里是boolean的运算演示");
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(true && false);
        System.out.println(true && true);
    }
}
