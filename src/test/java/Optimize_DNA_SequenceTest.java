import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class Optimize_DNA_SequenceTest {

    @Test
    @DisplayName("DNA Sequence output test")
    void optimize() {
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


        assertAll(
                () ->assertEquals("gatgcaagcggccatgcaaaaagcgatcattttggcgcaagcgatttt", Optimize_DNA_Sequence.optimize("dasghaksdhfgasdf",codon_ht)),
                () ->assertEquals("gcaagcggcgatgcaagcgattttgcaagcttt", Optimize_DNA_Sequence.optimize("ASGDASDFASF", codon_ht)),
                () ->assertEquals("gcaagcgatgaaaaagcaaatagcgatgcaagcgatggcgcaagcgat", Optimize_DNA_Sequence.optimize("JASDEJKABNSDasdgasd", codon_ht)),
                () ->assertEquals("gcaagcggcgcaagcgatggctggggcctggaa", Optimize_DNA_Sequence.optimize("ASGasdgwGLOJEbzx", codon_ht)));
    }
}