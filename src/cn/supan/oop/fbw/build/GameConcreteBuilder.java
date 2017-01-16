package cn.supan.oop.fbw.build;

import cn.supan.oop.fbw.GameFizzBuzzWhizz;
/**
 * 生成器模式定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 游戏对象构建器：构造游戏对象的构建器
 * */
public class GameConcreteBuilder {
	private int[] speicalNums;
	private int gameCount;
	  /**
	   * 构造方法，传入必须要有的参数
	   * @param speicalNums 游戏对象所需初始数据
	   * @param gameCount 游戏对象的游戏次数
	   */
	public GameConcreteBuilder(int[] speicalNums, int gameCount) {
		super();
		this.speicalNums = speicalNums;
		this.gameCount = gameCount;
	}
	public GameConcreteBuilder() {
	}
	 /**
	   * 构建真正的游戏对象并返回
	   * @return 构建的游戏对象
	   */
	public GameFizzBuzzWhizz build(){
		//return new GameFizzBuzzWhizz(speicalNums, gameCount);
		return new GameFizzBuzzWhizz(this);
	}
	  /**
	   * 选填数据，其它数据
	   * @return 构建器对象
	   */
	public GameConcreteBuilder setSpeicalNums(int[] speicalNums) {
		this.speicalNums = speicalNums;
		return this;
	}
	public GameConcreteBuilder setGameCount(int gameCount) {
		this.gameCount = gameCount;
		return this;
	}
	public int[] getSpeicalNums() {
		return speicalNums;
	}
	public int getGameCount() {
		return gameCount;
	}
	

}
