package com.epam.vijoosh.Junit;

public class RemoveAat0and1index {

	public String remove(String string) {
		String result="";
		if(string.length()>=2){
			if(string.charAt(0)!='A')
				result=result+string.charAt(0);
			if(string.charAt(1)!='A')
				result=result+string.charAt(1);
			result=result+string.substring(2,string.length());
		}
		else
		{
			if(string.length()==1)
			{
				if(string.charAt(0)=='A')
					result="";
				else
					result=string;
			}
		}
		return result;
	}

}
