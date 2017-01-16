package cn.supan.oop.fbw;

import cn.supan.oop.fbw.build.GameConcreteBuilder;

public class TestGame {
    /**
     * 用于测试：游戏
     * 客户端充当指导者角色
     */
    public static void main(String[] args) {
    	//使用获取特殊数字的类    调用返回特殊数字数组的方法  返回特殊数字的数组
        int[] speicalNums = GainSpecialNum.getSpecialNums();
        //构建游戏生成器对象
        GameConcreteBuilder gameConcreteBuilder = new GameConcreteBuilder();
        //设置游戏所需数据
        gameConcreteBuilder.setSpeicalNums(speicalNums).setGameCount(100);
        //生成游戏对象
        GameFizzBuzzWhizz game = gameConcreteBuilder.build();
        //调用开始游戏方法
        game.launch();
    }

}
