public class StringCompression
{
    public static int compress(char[] arr){
        int cnt=1;
        int j=0;
        if (arr.length<1)
            return 0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
                if (cnt>1){
                    String str=getNumAsString(cnt);
                    for (int k=0;k<str.length();k++){
                        arr[j++]=str.charAt(k);
                    }
                }
                cnt=1;
            }else {
                cnt++;
            }
        }

        arr[j++]=arr[arr.length-1];
        if (cnt>1){
            String str=getNumAsString(cnt);
            for (int k=0;k<str.length();k++){
                arr[j++]=str.charAt(k);
            }
        }
        return j;
    }

    public static String getNumAsString(int num){
        return String.valueOf(num);
    }
}
