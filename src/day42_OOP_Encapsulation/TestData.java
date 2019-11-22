package day42_OOP_Encapsulation;

public class TestData {

	/*
    Name
    ID
    */
   
    private String name = "Bekir";
    private int ID = 007;

	public String getname() {
		return name;
	}
    
	
	public int getter() {
		return ID;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int ID) {
		this.ID = ID;
	}
}
