package gft_exercicio4;
import java.util.ArrayList;


public class GFT_Exercicio4 {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList<>();
	Pessoa pessoa1 = new Pessoa("João ", 15);
	Pessoa pessoa2 = new Pessoa("Leandro ", 21);
	Pessoa pessoa3 = new Pessoa("Paulo ", 27);
	Pessoa pessoa4 = new Pessoa("Jessica ", 18);
		
	pessoa.add(pessoa1);
	pessoa.add(pessoa2);
	pessoa.add(pessoa3);
	pessoa.add(pessoa4);
	
	String maisVelho = null;
        int maiorIdade = 0;

	for (Pessoa p : pessoa) {			
            if(p.getIdade() > maiorIdade) {
            maisVelho = p.getNome();
            maiorIdade = p.getIdade();
            System.out.println("Segue a lista:" + pessoa + "\n");
            break;
            }
        }
        
	for (int i = 0; i < pessoa.size(); i++) {
            Pessoa p = pessoa.get(i);
            if (p.getIdade()<18) {
            pessoa.remove(p);
            break;
            }
        }
        System.out.println("Da lista, o mais velho é o " + maisVelho + "e sua idade é " + maiorIdade + "\n");
        System.out.println("Após a exclusão do menor de idade a lista foi atualizada:");
        System.out.println(pessoa + "\n");
        
        for (Pessoa p : pessoa) {			             
             System.out.println("Jessica ainda está na lista ? " + (pessoa.contains(pessoa4)));
             System.out.println("Sua idade é de " + pessoa4.getIdade());
             break;
        }
        		
    }

	
}
    
    

