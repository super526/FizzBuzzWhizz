package cn.supan.oop.fbw;

public class TestGame {
    /**
     * 用于测试：游戏
     */
    public static void main(String[] args) {
    	//使用获取特殊数字的类    调用返回特殊数字数组的方法  返回特殊数字的数组
        int nums[] = GainSpecialNum.getSpecialNums();
        //构造游戏的方法类，传入游戏规则需要的数组
        GameFizzBuzzWhizz game = new GameFizzBuzzWhizz(nums);
        //开始游戏
        game.launch();
    }

}
