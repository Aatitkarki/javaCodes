public class Mobile{
	private String companyName;
	private String mobileName;
	private int modelNumber;
	private byte ram;
	private int internalStorage;
	private double screenSize;
	static int count;
	private boolean expandableStorage;

	public String getCompanyName(){
		return companyName;
	}
	public String setCompanyName(String cn){
		companyName=n;
	}
	public String getMobileName(){
		return mobileName;
	}
	public String setMobileName(String mn){
		mobileName=mn;
	}
	public int getModelNumber(){
		return modelNumber;
	}
	public int setModelNumber(int mn){
		modelNumber=mn;
	}
	public byte getRam(){
		return ram;
	}
	public byte setRam(byte r){
		ram=r;	
	}
	public int getInternalStorage(){
		return internalStorage;
	}
	public int setInternalStorage(int is){
		internalStorage=is;
	}
	public double getScreenSize(){
		return screenSize;
	}
	public double setScreenSize(double ss){
		screenSize=ss;
	}
	public boolean getExpandableStorage(){
		return expandableStorage;
	}
	public boolean setExpandableStorage(boolean es){
		expandableStorage=es;
	}
	public Mobile(String companyName,String mobileName,int modelNumber,byte ram,int internalStorage,double screenSize,boolean expandableStorage){
		count+=1;
		this.companyName=companyName;
		this.mobileName=mobileName;
		this.modelNumber=modelNumber;
		this.ram=ram;
		this.internalStorage=internalStorage;
		this.screenSize=screenSize;
		this.expandableStorage=expandableStorage;

	}
	public void displayDetails(){
		System.out.println("Company Name: "+companyName);
		System.out.println("Mobile Name: "+mobileName);
		System.out.println("Model Number: "+modelNumber);
		System.out.println("Ram size: "+ram);
		System.out.println("Internal Storage: "+internalStorage);
		System.out.println("Screen Size: "+screenSize);
		if (expandableStorage==true){
			System.out.println("Expandable storage is avilable.");
		}else{
			System.out.println("Expandable storage is not avilable.")
		}
		
	}
}