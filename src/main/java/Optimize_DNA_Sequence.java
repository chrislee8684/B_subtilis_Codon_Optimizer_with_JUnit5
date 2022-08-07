import java.util.Hashtable;
import java.util.Map;

public class Optimize_DNA_Sequence {
    static String optimize(String string_AA_sequence, Hashtable<Character, Codon> codon_ht) {
        char[] char_AA_sequence = string_AA_sequence.toUpperCase().toCharArray();
        String output_DNA_sequence = "";
        for (char letter : char_AA_sequence) {
            if (codon_ht.containsKey(letter)) {
                output_DNA_sequence = output_DNA_sequence + codon_ht.get(letter).DNA_sequence;
                codon_ht.get(letter).frequency += 1; //increase frequency of AA
            }
        }
        return output_DNA_sequence;
    }
}
