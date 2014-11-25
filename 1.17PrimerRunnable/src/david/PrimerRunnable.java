package david;

class MiHebra implements Runnable{
	public void run(){
		while (true);
	}
}

public class PrimerRunnable {

	public static void main(String[] args) {
		MiHebra mh = new MiHebra();
		Thread t = new Thread(mh);
		t.start();
		while(true);
	}

}