package collection;

public enum DayNha {
	
	A("Nhà A"),
	B("Nhà B"),
	C("Nhà C"),
	D("Nhà D"),
	V("Nhà V"),
	X("Nhà X");
	
	private String moTa;
	
	private DayNha(String moTa) {
		this.moTa = moTa;
	}
	
	@Override
	public String toString() {
		return moTa;
	}

}
