package Enumeration;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 summer = Season2.SUMMER;
        //输出枚举对象名
        System.out.println(summer.name());
        //输出枚举对象次序/编号(从0开始）
        System.out.println(summer.ordinal());
        //values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
            //valuOf:将字符串转化为枚举对象
            //1.根据你输入的“AUTUMN”到Season2的枚举对象查找
            //如果找到就返回，没有就报错
            Season2 autumn = Season2.valueOf("AUTUMN");
            System.out.println("autumn=" + autumn);
            //compareTo:比较两个枚举常量，比较的是编号
            //值为前一个的编号减后一个
            System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
        }
    }
}

enum Season2 {
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private Season2(String name, String description) {
        this.name = name;
        this.description = description;

    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}