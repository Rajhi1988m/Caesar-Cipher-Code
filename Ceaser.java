/**
 * 
 */

/**
 * @author Mohammed
 *
 */
public class Ceaser {

	/**
	 * 
	 */
	public Ceaser() {
		// TODO Auto-generated constructor stub
	}
	
	 //first encrypt method
    public String Encryption(String msg)
    {
        String str = "";
        int key = 5;
        //loop all characters of string
        for(int i = 0;i<msg.length();i++)
        {
            //if lowercase
            if(msg.charAt(i)>='a' && msg.charAt(i)<='z')
            {
                //apply to move next key slots
                char newChar = (char)((((msg.charAt(i) - 'a') + key) % 26) + 'a');
                str += newChar;
            }
            //if uppercase
            else if(msg.charAt(i)>='A' && msg.charAt(i)<='Z')
            {
                //apply to move next key slots
                char newChar = (char)((((msg.charAt(i) - 'A') + key) % 26) + 'A');
                str += newChar;
            }
            else
            {
                //no change
                str += msg.charAt(i);
            }
        }
        return str;
    }
    public String Decryption(String msg)
    {
        String str = "";
        int key = 5;
        //Loop all characters
        for(int i = 0;i<msg.length();i++)
        {
            //lowcase
            if(msg.charAt(i)>='a' && msg.charAt(i)<='z')
            {
                //replace the current character with the previous character (key slots)
                char newChar = (char)((((msg.charAt(i) - 'a') +26 - key) % 26) + 'a');
                str += newChar;
            }
            //uppercase
            else if(msg.charAt(i)>='A' && msg.charAt(i)<='Z')
            {
                //replace the current character with the previous character (key slots)
                char newChar = (char)((((msg.charAt(i) - 'A')  +26 -  key) % 26) + 'A');
                str += newChar;
            }
            else
            {
                str += msg.charAt(i);
            }
        }
        return str;
    }
    
 //second encrypt function 
    public String Impelmentation_Encryption(String msg)
    {
        String str = "";
        char key = 'K'; //Any char will work
        //loop all characters 
        for (int i = 0; i < msg.length(); i++)
        {
            //use XOR current character with key
            str+= (char)(msg.charAt(i) ^ key);
        }
    
        return str;
    }
// The second decrypt function 
    public String Impelmentation_Decryption(String msg)
    {
        String str = "";
        char key = 'K'; //Any char will work
//loop all characters 
        for (int i = 0; i < msg.length(); i++)
        {
//use XOR current character with key
            str+= (char)(msg.charAt(i) ^ key);
        }
    
        return str;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	    System.out.println("######################################################################################");
	    System.out.println("#                         Mohammed T Rajhi                                           # ");                    
	    System.out.println("#                     Kentucky State University                                      # ");
	    System.out.println("#                      Cryptography Algorithms                                       # ");
	    System.out.println("#                      Caesar Cipher Assignments                                     #");
	    System.out.println("#               Encryption | Decryption | Impelmentation                             #");
	    System.out.println("#                         Written in Java                                            #");
	    System.out.println("#                                                                                    #");
	    System.out.println("#                                                                                    #");
	    System.out.println("#                                                                                    #");
	    System.out.println("######################################################################################");

// The first method is .. 
	    System.out.println("\n The First method is: \n");
        String messageText = "Now is the time for all good men to come to the aid of their country";
        String messageText2 = "Nk dtz hfs wjfi ymnx dtz mfaj xzhhjxxkzqqd ijhwduyji ymj rjxxflj Htslwfyzqfyntsx";

//create new object
        Ceaser call = new Ceaser();
        System.out.println(call.Encryption(messageText));
        System.out.println(call.Decryption(messageText2));
        
// The new method is below 
        System.out.println("\n The Second method is: \n");
        String str2 = call.Impelmentation_Encryption(messageText);
        System.out.println(str2);
        System.out.println(call.Impelmentation_Decryption(str2));

	}

}
