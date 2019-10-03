public class RomanToInteger {
	public int romanToInt(String s) {
        int value=0;
        char arr[]=s.toCharArray();
        int len=arr.length;
        for(int j=0;j<len;j++){
            switch(arr[j]){
                case 'I':
                    if(j<(len-1)){
                    if(arr[j+1]=='V'){
                        value=value+4;
                        j++;
                        break;
                    }else if(arr[j+1]=='X'){
                        value=value+9;
                        j++;
                        break;
                    }else{
                        value=value+1;
                    }}else{
                        value=value+1;
                    }
                    break;
                case 'V':
                    value=value+5;
                    break;
                case 'X':
                    if(j<(len-1)){
                    if(arr[j+1]=='L'){
                        value=value+40;
                        j++;
                        break;
                    }else if(arr[j+1]=='C'){
                        value=value+90;
                        j++;
                        break;
                    }else{
                    value=value+10;
                    }}else{
                        value=value+10;
                    }
                    break;
                case 'L':
                    value=value+50;
                    break;
                case 'C':
                    if(j<(len-1)){
                    if(arr[j+1]=='D'){
                        value=value+400;
                        j++;
                        break;
                    }else if(arr[j+1]=='M'){
                        value=value+900;
                        j++;
                        break;
                    }else{
                    value=value+100;
                    }}else{
                        value=value+100;
                    }
                    break;
                case 'D':
                    value=value+500;
                    break;
                case 'M':
                    value=value+1000;
                    break;
            }
        }
        return value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger r =new RomanToInteger();
		System.out.println(r.romanToInt("III"));
		System.out.println(r.romanToInt("XIV"));
	}

}
