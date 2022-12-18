import java.util.ArrayList;
import java.util.List;

public class StringMatchingArray {

	public static void main(String[] args) {
		String[] strArray = {"mass","as","hero","superhero"};
		System.out.println(stringMatching(strArray));

	}
	
	public static List<String> stringMatching(String[] words) {
        List<String> output = new ArrayList<String>();
        for(int i=0; i<words.length;i++){
            for(int j=0; j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    if(!output.contains(words[j]))
                    output.add(words[j]);
                }
            }
        }
        return output;
    }

}
