public class RunoobTest {
    // 成员变量
    private int instanceVar;
    // 静态变量
    private static int staticVar;

    public void method(int paramVar) {
        // 局部变量
        int localVar = 10;

        // 使用变量
        instanceVar = localVar;
        staticVar = paramVar;

        System.out.println("成员变量: " + instanceVar);
        System.out.println("静态变量: " + staticVar);
        System.out.println("参数变量: " + paramVar);
        System.out.println("局部变量: " + localVar);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(" x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        RunoobTest v = new RunoobTest();
        v.method(20);
        int a = 10, b = 20;
        swap(a, b); // 调用swap方法
        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值
    }
}