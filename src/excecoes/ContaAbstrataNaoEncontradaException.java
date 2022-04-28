package excecoes;

public class ContaAbstrataNaoEncontradaException extends Exception{
    public ContaAbstrataNaoEncontradaException(){
        super("Conta abstrata não encontrada!");
    }
}
