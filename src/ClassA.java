

public class ClassA {
public synchronized void EnterAndWait() {
		
		System.out.println("El hilo que est� ejecutando es: "+Thread.currentThread().getId());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error, el hilo se ha interrumpido.");		
		}
		System.out.println("El hilo que est� acabando de ejecutar es: "+Thread.currentThread().getId());
	}

}
