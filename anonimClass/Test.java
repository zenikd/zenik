package anonimClass;

public class Test {
	public static void main(String[] args) {
		IFunction action1 = new IFunction() {
			public void doAction() {
				System.out.println("action");
			}
		};
		execute(action1);
		
	}
	
	private static void execute(IFunction actionHolder) {
		actionHolder.doAction();
	}
}
