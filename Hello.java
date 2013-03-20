class Hello{

  //直接输出，与JNI做对比
  public static void main(String args[]) {

    long start = System.currentTimeMillis();
    HelloJNI myJNI = new HelloJNI();
    System.out.println("Hello");
    long finish = System.currentTimeMillis();
    System.out.println(("\r\nExcutetime: " + (finish - start) + "ms"));
  }

}
