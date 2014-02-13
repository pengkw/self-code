package com.pengkw.bit;

/**
 * 位图表示
 * @author pengkw
 *
 */
public class Bit {
	
	/**
	 * 表示位数
	 */
	private int size;
	
	/**
	 * 存储结果
	 */
	private int[] bits;
	
	public Bit(int size) {
		super();
		this.size = size;
		init();
	}
	
	private void init() {
		//计算初始化数组大小
		int len = (int)Math.ceil(size/32.0);
		bits = new int[len];
	}
	
	/**
	 * 将指定位置设置为1
	 * @param index
	 */
	public void set(int index) {
		//计算数组下标
		int i = index / 32;
		//计算偏移位
		int pos = index % 32;
		//将指定位设置为1
		bits[i] = bits[i] | (1 << (31 - pos));
	}
	
	/**
	 * 将指定位设置为0
	 * @param index
	 */
	public void clear(int index) {
		//计算数组下标
		int i = index / 32;
		//计算偏移位
		int pos = index % 32;
		//将指定位设置为0
		bits[i] = bits[i] & ~(1 << (31 - pos));
	}
	
	public void display() {
		int len = bits.length;
		for(int i = 0; i < len; i++) {
			int v = bits[i];
			for(int j = 1; j < 32; j++) {
				if((v & (1 << (31 - j))) > 0) {
					System.out.println(i * 32 + j);
				}
			}
		}
	}
}

