package edu.htu.day8;

public class Persone extends Humman {
	private String name;
	private int id;

	public Persone(int id, String name) {
		setId(id);
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(name + " is eating");
	}

	public void work() {
		System.out.println("person working");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persone) {

			Persone otherPerson = (Persone) obj;
			if (otherPerson.getId() == getId()) {
				return true;
			}
		}
		return false;
	}

}
