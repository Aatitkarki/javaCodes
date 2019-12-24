
/**
 * Write a description of class MobileDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MobileDemo
{
    public static void main(String [] args){
        ArrayList <Mobile> mobiles = new ArrayList<Mobile>();
        Mobile s8 = new Mobile("Samsung","s8","SMG950",(byte)4,64,5.8,true);

        Mobile s9 = new Mobile("Samsung","s9+","G960F",(byte)6,64,6.2,true);

        Mobile s10 =new Mobile("Samsung","s10","SMG97",(byte)8,128,6.1,true);

        Mobile iPhone6s =new Mobile("Apple","iPhone 6s","A1633",(byte)2,16,5.5,false);

        Mobile iPhone8 =new Mobile("Apple","iPhone 8+","A1633",(byte)3,64,5.5,false);

        Mobile iPhoneX =new Mobile("Apple","iPhone X","A1865",(byte)3,64,5.8,false);

        Mobile iPhone11=new Mobile("Apple","iPhone 11","A2221",(byte)4,64,6.1,false);

        Mobile k20Pro = new Mobile("Xiaomi","Redmi k20 Pro","M1903F11",(byte)6,64,6.39,false);

        Mobile nova5T= new Mobile("Huawei","Nova 5T","YAL-L21",(byte)6,128,6.26,false);

        Mobile p30 =new Mobile("Huawei","P30","ELE-TL00",(byte)8,64,6.1,true);
        
        mobiles.add(s8);
        mobiles.add(s9);
        mobiles.add(s10);
        mobiles.add(iPhone6s);
        mobiles.add(iPhone8);
        mobiles.add(iPhoneX);
        mobiles.add(iPhone11);
        mobiles.add(k20Pro);
        mobiles.add(nova5T);
        mobiles.add(p30);
        
        System.out.println("The total smartphone is "+Mobile.count);
        System.out.println();
        
        for(int i=0; i<mobiles.size();i++){
            if(mobiles.get(i).getCompanyName().equals("Apple")){
                mobiles.get(i).displayDetails();
            }
        }
        for(int i=0;i<mobiles.size();i++){
        if(mobiles.get(i).getRam()==4 && mobiles.get(i).getInternalStorage()==64){
        mobiles.get(i).displayDetails();
        }
        }
        
        for(int i=0;i<mobiles.size();i++){
            for(int j=i;j<mobiles.size();j++){
           boolean testing= mobiles.get(i).isSame(mobiles.get(j));
            if(testing==true){
            System.out.println(mobiles.get(i).getMobileName()+" has same model number as "+mobiles.get(j).getMobileName());
            }else{
            System.out.println(mobiles.get(i).getMobileName()+" does not have same model number as "+mobiles.get(j).getMobileName());
            }
        }
        }
    }

}
