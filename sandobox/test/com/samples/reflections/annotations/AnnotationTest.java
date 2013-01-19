package com.samples.reflections.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SampleRecord target = new SampleRecord();

		Annotation[] annotations = target.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("Annotation: " + annotation);
		}

		Annotation annotation = target.getClass().getAnnotation(Record.class);
		Record record = (Record) annotation;
		System.out.println("Target: " + record);
		System.out.println(record.value());

		Field[] fields = target.getClass().getDeclaredFields();
		for (Field field : fields) {
			Annotation[] fieldAnnotations = field.getAnnotations();
			for (Annotation fieldAnnotation : fieldAnnotations) {
				System.out.println("Field Annotation: " + fieldAnnotation);
			}
		}
	}
}
