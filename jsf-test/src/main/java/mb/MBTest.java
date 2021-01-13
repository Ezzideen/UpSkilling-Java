package mb;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "mbTest")
@ViewScoped
public class MBTest {

	private Integer numberOne;
	private Integer numberTow;
	private Integer sum;

	public Integer getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(Integer numberOne) {
		this.numberOne = numberOne;
	}

	public Integer getNumberTow() {
		return numberTow;
	}

	public void setNumberTow(Integer numberTow) {
		this.numberTow = numberTow;
	}

	public String add() {
		setSum(numberOne + numberTow);
		if(getSum()>5) {
			return "x";
		}else {
			return "y";
		}
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
