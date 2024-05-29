public class Test {
    private int age = 0;
    public static int count = 0;

    private void pupAge() {
        age += 7;
        for (int i = 0; i < 10; i++) {
            System.out.println("小狗的年龄是 : " + (i + age));
        }
    }

    protected boolean setAge(int age) {
        int num = 10;
        this.age = age;
        System.out.println("小狗的年龄是 : " + age);
        return num == this.age;
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.pupAge();
//        System.out.println(test.setAge(10));
        Test.count = 10;
        System.out.println(Test.count);
        Test test1 = new Test();
        test1.count += 20;
        System.out.println(Test.count);

    }
}