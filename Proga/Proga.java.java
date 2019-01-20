import java.io.*;

class Proga {
		public static void main(String[] args) {
System.out.print("Write ur words: \n");
int inChar;
String s = "";
try {
    inChar = System.in.read();
    while (System.in.available() > 0) {
        s += (char) inChar;
        inChar = System.in.read();
    }
} catch (Exception e) {
    System.out.println("Error");
}
	
	String[] wstr=s.split(" "); 
	int length=wstr.length;		
	int [] wcount=new int [length]; 
		for(int i=0; i<length;i++){
			wcount[i]=1;		
}
	for(int i=0; i<length;i++){
		for(int j=0; j<length;j++){
		
if (wstr[i].compareTo(wstr[j]) == 0 && i != j){wcount[i]=wcount[i]+1;
			wstr[j] = " ";}
			
}
		if(wstr[i]!=" ") {System.out.println(wstr[i]);System.out.println("_"+wcount[i]+" time's was used_");}							
}
}			
}