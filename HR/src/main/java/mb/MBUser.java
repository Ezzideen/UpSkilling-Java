package mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.HrDao;
import entity.EBUser;

@ManagedBean(name = "mbUser")
@SessionScoped
public class MBUser {

	private EBUser user;

	public EBUser getUser() {
		if(user == null) {
			user = new EBUser();
		}
		return user;
	}

	public void setUser(EBUser user) {
		this.user = user;
	}
	
	public String validateUser() {
		HrDao dao = new HrDao();
		EBUser findUser = dao.findUser(user);
		if (findUser != null) {
			if (user.getPassword().equals(findUser.getPassword())) {
				return "home.xhtml?faces-redirect=true";
			} else {
				System.out.println("password not correct");
			}

		} else {
			System.out.println("user not found");
		}
		return null;
	}
}
