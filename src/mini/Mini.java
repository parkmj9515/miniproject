package mini;

public class Mini {

	private int num;
	private String name;
	private String hp;
	private  String tel;
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void showInfo() {
		System.out.printf("%, %s, %s%n",name,hp,tel);
	}
	@Override
	public String toString() {
		return "Mini [name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}
	
	
	
}
