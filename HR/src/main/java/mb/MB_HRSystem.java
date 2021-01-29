package mb;

import com.jk.web.faces.mb.JKManagedBean;

public class MB_HRSystem extends JKManagedBean  {
	public enum Mode {
		ADD, EDIT, READONLY
	}

	private Mode activeMode;

	public MB_HRSystem() {
		setAddMode();
	}
	
	public boolean isReadOnlyMode() {
		return getActiveMode() == Mode.READONLY;
	}

	public boolean isEditMode() {
		return getActiveMode() == Mode.EDIT;
	}

	public boolean isAddMode() {
		return getActiveMode() == Mode.ADD;
	}

	public Mode getActiveMode() {
		return activeMode;
	}

	public void setActiveMode(Mode activeMode) {
		this.activeMode = activeMode;
	}

	public void setEditMode() {
		setActiveMode(Mode.EDIT);
	}

	public String setAddMode() {
		activeMode = Mode.ADD;
		return null;
	}

	public String setReadOnlyMode() {
		activeMode = Mode.READONLY;
		return null;
	}
}
