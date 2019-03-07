package com.stackroute;
public class Palindrome
{
    boolean checkPalindrome(String numAsString)
    {
        int i, flag = 0;
        for(i=0; i<numAsString.length(); i++)
        {
            if(numAsString.charAt(i) != numAsString.charAt(numAsString.length() - (i+1)))
            {
                flag = 1;
            }
        }
        if(flag == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
