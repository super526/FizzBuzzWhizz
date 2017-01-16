package cn.supan.oop.fbw;

import cn.supan.oop.fbw.build.GameConcreteBuilder;

/**
 * 游戏类：
 * 	属性：
 * 		特殊数字数组  speicalNums
 * 		对应输出单词  "Fizz"、"Buzz"、"Whizz"
 * 	函数：
 * 	     游戏规则：
 * 		规则五  isContainFirstNum()
 * 		规则三、四  multipleOper()
 * 
 *    开始游戏方法  launch()
 *    
 * */
public class GameFizzBuzzWhizz {
    /* 特殊数的数组，在构造方法中初始化*/
    private int[] speicalNums;
    private int gameCount;
    /*public GameFizzBuzzWhizz(int[] speicalNums) {
		super();
		this.speicalNums = speicalNums;
	}*/
	private static final String ECHO1 = "Fizz";
    private static final String ECHO2 = "Buzz";
    private static final String ECHO3 = "Whizz";
    /* 构造方法中初始化特殊数数组*/
    public GameFizzBuzzWhizz(int[] speicalNums,int gameCount) {
        this.speicalNums = speicalNums;
        this.gameCount = gameCount;
        System.out.println("The game is ready to go! Oh,yeah!");
    }
    public GameFizzBuzzWhizz(GameConcreteBuilder builder) {
        this.speicalNums = builder.getSpeicalNums();
        this.gameCount = builder.getGameCount();
        System.out.println("The game is ready to go! Oh,yeah!");
    }

    /**
     * 判断是否包含第一个特殊数:规则五  
     * 开始游戏的方法
     */
    public void launch() {
        System.out.println("Game start!!!");
        for (int index = 1; index <= gameCount; index++) {
            if (this.isContainFirstNum(index)) {
                System.out.println(index + ": " + ECHO1);
            } else {
                this.multipleOper(index);
            }
        }
    }
    
    /**
     * 判断是否包含第一个特殊数:规则五
     */
    private boolean isContainFirstNum(int i) {
        String firstSpecialNum = Integer.toString(speicalNums[0]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        String index = Integer.toString(i);
        return index.contains(firstSpecialNum);
    }
    /**
     * 进行倍数规则的处理方法:规则三、四
     */
    private void multipleOper(int index) {
        String str = "";
        if (speicalNums[0] != 0 && index % speicalNums[0] == 0) {
            str = str + ECHO1;
        }
        if (speicalNums[1] != 0 && index % speicalNums[1] == 0) {
            str = str + ECHO2;
        }
        if (speicalNums[2] != 0 && index % speicalNums[2] == 0) {
            str = str + ECHO3;
        }
        if (str != "") {
            System.out.println(index + ": " + str);
        } else {
            System.out.println(index + ": " + index);
        }
    }

   
}