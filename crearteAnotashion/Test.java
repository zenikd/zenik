package crearteAnotashion;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		SampleObject sampleObject = new SampleObject();
		
		printOjectVersion(sampleObject);
	}
	
	private static void printOjectVersion(SampleObject sampleObject) {
		Class<? extends SampleObject> clazz = sampleObject.getClass();
		
		Version annotation = clazz.getAnnotation(Version.class);
		System.out.println("SampleObject version: " + annotation.info());
		
		Method[] methods = clazz.getMethods();
		
		for (Method method : methods) {
			Version methodVersion = method.getAnnotation(Version.class);
			String versionString = methodVersion ==null ? "version unsupported" : methodVersion.info();
			System.out.println(String.format("method '\5s version: %s", method.getName(), versionString));
		}
	}
}
