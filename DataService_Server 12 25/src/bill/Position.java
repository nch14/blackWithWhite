package bill;

import java.io.Serializable;

class Position implements Serializable{
	/**
	 * 仓库中的一个位置
	 * ID为货物编号
	 * empty表示是否为空
	 */
	private static final long serialVersionUID = 1594989676954128362L;
	public String id;
	public boolean empty;
}