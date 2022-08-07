import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Codon A = new Codon("gca", 0);
        Codon C = new Codon("tgc", 0);
        Codon D = new Codon("gat", 0);
        Codon E = new Codon("gaa", 0);
        Codon F = new Codon("ttt", 0);
        Codon G = new Codon("ggc", 0);
        Codon H = new Codon("cat", 0);
        Codon I = new Codon("att", 0);
        Codon K = new Codon("aaa", 0);
        Codon L = new Codon("ctg", 0);
        Codon M = new Codon("atg", 0);
        Codon N = new Codon("aat", 0);
        Codon P = new Codon("ccg", 0);
        Codon Q = new Codon("caa", 0);
        Codon R = new Codon("aga", 0);
        Codon S = new Codon("agc", 0);
        Codon T = new Codon("aca", 0);
        Codon V = new Codon("gtt", 0);
        Codon W = new Codon("tgg", 0);
        Codon Y = new Codon("tat", 0);

        Hashtable<Character, Codon> codon_ht = new Hashtable<>();

        codon_ht.put('A', A);
        codon_ht.put('C', C);
        codon_ht.put('D', D);
        codon_ht.put('E', E);
        codon_ht.put('F', F);
        codon_ht.put('G', G);
        codon_ht.put('H', H);
        codon_ht.put('I', I);
        codon_ht.put('K', K);
        codon_ht.put('L', L);
        codon_ht.put('M', M);
        codon_ht.put('N', N);
        codon_ht.put('P', P);
        codon_ht.put('Q', Q);
        codon_ht.put('R', R);
        codon_ht.put('S', S);
        codon_ht.put('T', T);
        codon_ht.put('V', V);
        codon_ht.put('W', W);
        codon_ht.put('Y', Y);

        System.out.println("This program provides the optimized codon sequence for Bacillus subtilis from the input amino acid sequence based on literature.");
        System.out.println("Please enter the amino acid sequence: ");

        Scanner input = new Scanner(System.in);
        String string_AA_sequence = input.nextLine();

        String output_DNA_sequence=Optimize_DNA_Sequence.optimize(string_AA_sequence, codon_ht);
        System.out.println("Optimized DNA sequence: "+output_DNA_sequence);
        System.out.printf("The size of the amino acid sequence is %d.%nThe size of the DNA sequence is %d.%n", string_AA_sequence.length(),output_DNA_sequence.length());
        System.out.println("The frequency of each amino acid is as follows:");
        for (Map.Entry<Character,Codon> codon : codon_ht.entrySet()) //iterating through codon hashtable
        {
            System.out.printf("%c: %d %n", codon.getKey(), codon.getValue().frequency);
        }

        System.out.printf("%nWould you like the DNA sequence as a file?%nPlease enter 'Yes' or No': ");
        String file_option = input.nextLine();
        input.close();
        if (file_option.compareTo("Yes")==0){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("Optimized_DNA_Sequence.gb"));
                writer.write(output_DNA_sequence);
                writer.close();
                System.out.println("The file is named:'Optimized_DNA_Sequence.gb'.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("Optimization Complete.");
        }
    }
}
