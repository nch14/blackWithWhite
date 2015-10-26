package bl.blservice;

public interface MoneyBLService {

	ResultMessage getPayid(int i);

	ResultMessage getExpenseid(int i);

	ResultMessage getSumMoney();

	void endMoneyService();

	ResultMessage submit();

	ResultMessage save();

}
