package hqs;
import java.io.*;


public class hqexercise {
	public static void main(String[] args) throws Exception{
		
		int meaningless;
		if(args.length == 0) {
			System.out.println("입력받은 파일이 없습니다.");
			System.exit(0);
		}
		
		File file = new File(args[0]);
		if(file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
		    
				while(br.ready()) {
					String str = br.readLine();					
					char[] array_word = new char[str.length()];
					
					
					for(int i=0;i<array_word.length;i++){ 
						array_word[i]=(str.charAt(i));
					}
					
					for(int i = 0; i<array_word.length; i++) {
						if(array_word[i] == 'H') {
							System.out.println("Hello world");
						}
						else if(array_word[i] == 'Q'){
							System.out.println(str);
						}
						else if(array_word[i] == '9') {
							for(int j = 0; j <97; j++) {
								System.out.println( (99-j) + "bottles of beer on the wall,"+ (99-j) + "bottles of beer.\r\n" + 
										"Take one down and pass it around," + (98-j)  + "bottles of beer on the wall.");
							}
							System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\n" + 
									"Take one down and pass it around, no more bottles of beer on the wall." );
							System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\n" + 
									"Go to the store and buy some more, 99 bottles of beer on the wall." );
						}
						else if(array_word[i] == '+') {
							meaningless=+1;
						}
						else;
					}

				}
				br.close();
		}
		
		
	}
}
