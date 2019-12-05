public class MobileDemo{
    public static void main(String[] args){
        Mobile mobiles[]=new Mobile [30];
        Mobile s8 = new Mobile("Samsung","s8","SMG950",(byte)4,64,5.8,true);
        
        Mobile s9 = new Mobile("Samsung","S9+","G960F",(byte)6,64,6.2,true);
        
        Mobile s10 =new Mobile("Samsung","S10","SMG97",(byte)8,128,6.1,true);
        
        Mobile iPhone6s =new Mobile("Apple","iPhone 6s","A1633",(byte)2,16,5.5,false);
        
        Mobile iPhone8 =new Mobile("Apple","iPhone 8+","A1633",(byte)3,64,5.5,false);
        
        Mobile iPhoneX =new Mobile("Apple","iPhone X","A1865",(byte)3,64,5.8,false);
        
        Mobile iPhone11=new Mobile("Apple","iPhone 11","A2221",(byte)4,64,6.1,false);
        
        Mobile k20Pro = new Mobile("Xiaomi","Redmi k20 Pro","M1903F11",(byte)6,64,6.39,false);
        
        Mobile nova5T= new Mobile("Huawei","Nova 5T","YAL-L21",(byte)6,128,6.26,false);
        
        Mobile p30 =new Mobile("Huawei","P30","ELE-TL00",(byte)8,64,6.1,true);
        
        mobiles[0]=s8;
        mobiles[1]=s9;
        mobiles[2]=s10;
        mobiles[3]=iPhone6s;
        mobiles[4]=iPhone8;
        mobiles[5]=iPhoneX;
        mobiles[6]=iPhone11;
        mobiles[7]=k20Pro;
        mobiles[8]=nova5T;
        mobiles[9]=p30;
    
        System.out.println("The total smartphone is "+Mobile.count);
        System.out.println();
        
        for(int i=0; i<10;i++){
        if(mobiles[i].getCompanyName()=="Apple"){
            mobiles[i].displayDetails();
            }
        }
        System.out.println("The details of Mobiles having 4GB ram and 64GB internal storage are");
        for(int i=0;i<10;i++){
        if(mobiles[i].getRam()==4 && mobiles[i].getInternalStorage()==64){
        mobiles[i].displayDetails();
        }
    }
        System.out.println("Checking if the model is same or not:");
         System.out.println();
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
            boolean test=mobiles[i].isSame(mobiles[j]);
            if(test==true){
            System.out.println(mobiles[i].getMobileName()+" has same model number as "+mobiles[j].getMobileName());
            }else{
            System.out.println(mobiles[i].getMobileName()+" has not same model number as "+mobiles[j].getMobileName());
            }
        }
        }
        
}
}