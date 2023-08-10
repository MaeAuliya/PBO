package Predictive;

public class WordSig implements Comparable<WordSig>{ //this class function is to pair word and signature as ArrayList Component

    private String words;
    private String signature;
    public WordSig(String a, String b){
        this.words = a;
        this.signature = b;
    }

    public String Word() {
        return this.words;
    }

    public String Sign() {
        return this.signature;
    }

    public int compareTo(WordSig ws){
    	if(this.signature.compareTo(ws.signature) > 0) // greater than the argument object
    		return 1;
    	else if(this.signature.compareTo(ws.signature) < 0) // less than the argument object
    		return -1;
    	else // equal than the argument object
    		return 0;
    }
}

