import java.util.ArrayList;
import java.util.List;

public class BinaryWatch
{
    public static List<String> readingBinaryWatch(int num){
        List<String> result=new ArrayList<>();
        for (int h=0;h<=4;h++){
            for (int m=0;m<=6;m++){
                if (h+m==num){
                    int numofHors=getHours(h);
                    int numofMins=getMinutes(m);
                    StringBuilder x=new StringBuilder();
                    x.append(String.valueOf(h));
                    x.append(":");

                    if (m==0){
                        x.append("00");
                    }else if(m>=1 && m<=9){
                        x.append("0");
                        x.append(String.valueOf(m));
                    }else if (m>=10 && m<=59){
                        x.append(String.valueOf(m));
                    }
                    result.add(x.toString());
                }
            }
        }
        return result;
    }

    public static int getHours(int h){
        int numofHLights=0;
        if (h==0) return 0;
        while (h>0){
            int rem=h%2;
            if (rem==1){
                numofHLights++;
            }
            h/=2;
        }
        return numofHLights;
    }
    public static int getMinutes(int m){
        int numofMLights=0;
        if (m==0) return 0;
        while (m>0){
            int rem=m%2;
            if (rem==1){
                numofMLights++;
            }
            m/=2;
        }
        return numofMLights;
    }
    public static void main(String[] args){
        List<String> res=readingBinaryWatch(7);
        System.out.println(res);
    }


}
