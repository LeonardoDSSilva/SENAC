public class Pilha {
	private int[] vetorPilha;
	private boolean isFull = false;
	private boolean isEmpty = true;

	int top = -1;

	Pilha() {
		vetorPilha = new int[5];
	}

	
	Pilha(int tamanhoPilha) {
		vetorPilha = new int[tamanhoPilha];
	}

	public boolean push(int valorEmpilhar) {
        if (!isFull) {
            top++;
            vetorPilha[top] = valorEmpilhar;
            isEmpty = false;
            if (top == (vetorPilha.length - 1)) {
                isFull = true;
            }
            return true;
        } else {
            return false;
        }
	}

	public int pop() {
		if(!isEmpty) {
			int valorRetorno = vetorPilha[top];
			isFull = false;
			top--;
            if (top == -1) {
                isEmpty = true;
            }
			return valorRetorno;
		}
		return -1;
	}

	public int peek() {
		if(isEmpty == false) {
			return vetorPilha[top];
		}else {
			return -1;
		}
	}

	public void clear() {
		top = -1;
		isEmpty = true;
		isFull = false;
	}

	public boolean getIsEmpty() {
		return isEmpty;
	}

	public boolean getIsFull() {
		return isFull;
	}


}
