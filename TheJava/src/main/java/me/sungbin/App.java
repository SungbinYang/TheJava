package me.sungbin;

/**
 * Hello world!
 *
 */
public class App 
{
    Book book = new Book(); // 링크 과정에서 이 객체의 레퍼런스는 실제 레퍼런스를 가지고 있지 않다.(심볼릭 레퍼런스)

    static String name = "sungbin"; // static은 Resolve 당시에 name에다가 할당이 이루어진다.

    static {
        name = "bini";
    }

    public static void main( String[] args ) {
        // 클래스 로더는 계층형 구조. 항상 부모를 가지고 있다.
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader);
        // 클래스 로더의 부모는 platformClassLoader
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent());
        // PlatformClassLoader의 부모는 있지만 우리가 볼수 없다. 왜? natice code로 이루어졌기 때문이다.
        System.out.println(classLoader.getParent().getParent());
    }
}
