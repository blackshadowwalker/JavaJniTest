class HelloJNI{

  //本地方法声明
  native void printHello();
  native void printString(String str);

  //加载库
  static {
    System.loadLibrary("hellojni");
  }

  public static void main(String args[]) {
    long start = System.currentTimeMillis();
    HelloJNI myJNI = new HelloJNI();
    //调用本地方法
    myJNI.printHello();
    myJNI.printString("Zhuanggy is a man!");
    long finish = System.currentTimeMillis();
    System.out.println(("\r\nExcutetime: " + (finish - start) + "ms"));
  }

}
