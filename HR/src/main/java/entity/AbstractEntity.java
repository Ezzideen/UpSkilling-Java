package entity;

import javax.persistence.Table;

public abstract class AbstractEntity {

	public abstract int getId();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractEntity) {
			AbstractEntity otherEntity = (AbstractEntity) obj;
			String otherTableName = otherEntity.getClass().getAnnotation(Table.class).name();
			String currentTableName = getClass().getAnnotation(Table.class).name();
			if (otherTableName.equals(currentTableName)) {
				if (otherEntity.getId() == getId()) {
					return true;
				}
			}
		}
		return false;
	}

}
