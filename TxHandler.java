import java.util.ArrayList;
import java.util.HashMap;

import Transaction.Output;

public class TxHandler {

	public UTXOPool UTXOPool;
    /**
     * Creates a public ledger whose current UTXOPool (collection of unspent transaction outputs) is
     * {@code utxoPool}. This should make a copy of utxoPool by using the UTXOPool(UTXOPool uPool)
     * constructor.
     */
    public TxHandler(UTXOPool utxoPool) {
    	UTXOPool = new UTXOPool(utxoPool);
    }

    /**
     * @return true if:
     * (1) all outputs claimed by {@code tx} are in the current UTXO pool, 
     * (2) the signatures on each input of {@code tx} are valid, 
     * (3) no UTXO is claimed multiple times by {@code tx},
     * (4) all of {@code tx}s output values are non-negative, and
     * (5) the sum of {@code tx}s input values is greater than or equal to the sum of its output
     *     values; and false otherwise.
     */
    public boolean isValidTx(Transaction tx) {
		// consumed cons valid
		// not already consumed
		// total value out = total value in
		// signed by owners of all consumed coins
    	Boolean isValid = false;
    	Map<int, List<Output>> validRoots = new HashMap<>(); // Java 7
    	for (Transaction.Input i : tx.getInputs())
    	{
    		if(!UTXOPool.contains(utxo))
    	}
    	return isValid;
    }

    /**
     * Handles each epoch by receiving an unordered array of proposed transactions, checking each
     * transaction for correctness, returning a mutually valid array of accepted transactions, and
     * updating the current UTXO pool as appropriate.
     */
    public Transaction[] handleTxs(Transaction[] possibleTxs) {
        // IMPLEMENT THIS
    	ArrayList<Transaction> validTxs = new ArrayList<Transaction>(); 
    	
    	for (Transaction t : possibleTxs)
    	{
    		
    		if (isValidTx(t))
    			validTxs.add(t);
    	}
    	
    	Transaction[] validTxsArray = new Transaction[validTxs.size()]; 
    	validTxsArray = validTxs.toArray(validTxsArray);
    	return validTxsArray;
    }
    

}
