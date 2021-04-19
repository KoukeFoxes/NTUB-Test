import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) throws Exception {
        SimpleGuess sg = new SimpleGuess("0512");
        String yourguess = sg.getInput();
        Result result = sg.compare(yourguess);
        System.out.println("結果：" + result);
        //////////////////////////////////////////
        SimpleGuess sg2 = new SimpleGuess();
        String yourguess2 = sg2.getInput();
        Result result2 = sg2.compare(yourguess2);
        System.out.println("結果：" + result2);
    }
}

class SimpleGuess{
    String answer = "";
    public SimpleGuess(){ for(int i=0;i<4;i++) this.answer+=(int)(Math.random()*10); System.out.println("ANS:" + answer);}
    public SimpleGuess(String answer){ this.answer=answer; System.out.println("ANS:" + answer);}
    public String getInput() {
        Scanner scn = new Scanner(System.in);
        String res = scn.nextLine();
        return res;
    }
    public Result compare(String yourguess) {
        boolean check[]=new boolean[4]; //紀錄每個位數是否檢查過
        int A=0,B=0;

		for(int i=0;i<4;i++){
			if(answer.charAt(i)==yourguess.charAt(i)){
				A++;
				check[i]=true;}
		}

		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(!check[j] && answer.charAt(j)==yourguess.charAt(i)){
					B++;
					check[j]=true;
					break;}}}
        return new Result(A+"A"+B+"B");
    }
}

class Result{
    String name;
    public Result(String tmp){ this.name = tmp; }
    public String toString(){return this.name;}
}