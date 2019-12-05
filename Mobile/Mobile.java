public class Mobile{
    private String companyName;
    private String mobileName;
    private String modelNumber;
    private byte ram;
    private int internalStorage;
    private double screenSize;
    static int count;
    private boolean expandableStorage;

    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String cn){
        companyName=cn;
    }
    public String getMobileName(){
        return mobileName;
    }
    public void setMobileName(String mn){
        mobileName=mn;
    }
    public String getModelNumber(){
        return modelNumber;
    }
    public void setModelNumber(String mn){
        modelNumber=mn;
    }
    public byte getRam(){
        return ram;
    }
    public void setRam(byte r){
        ram=r;  
    }
    public int getInternalStorage(){
        return internalStorage;
    }
    public void setInternalStorage(int is){
        internalStorage=is;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public void setScreenSize(double ss){
        screenSize=ss;
    }
    public boolean getExpandableStorage(){
        return expandableStorage;
    }
    public void setExpandableStorage(boolean es){
        expandableStorage=es;
    }
    public Mobile(String companyName,String mobileName,String modelNumber,byte ram,int internalStorage,double screenSize,boolean expandableStorage){
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
        System.out.println("Ram size: "+ram+"GB");
        System.out.println("Internal Storage: "+internalStorage+"GB");
        System.out.println("Screen Size: "+screenSize+" inch.");
        if (expandableStorage==true){
            System.out.println("Expandable storage is avilable.");
        }else{
            System.out.println("Expandable storage is not avilable.");
        }
        System.out.println();
    }
    
    public boolean isSame(Mobile mobiles){
        boolean isSame=false;
                if(getModelNumber() == mobiles.getModelNumber()){
                    isSame=true;
        }
        return isSame;      
    }

}