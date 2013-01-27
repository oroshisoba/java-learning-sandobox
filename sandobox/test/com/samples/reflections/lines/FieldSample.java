package com.samples.reflections.lines;

import java.lang.reflect.Field;

public class FieldSample {

	/**
	 * Field Reflection Sample
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SampleMppedDto dto = new SampleMppedDto();
		
		for (Field field : dto.getClass().getDeclaredFields()) {
			if (field.getAnnotation(FieldMapping.class) != null) {
				boolean isAccessible = false;
				if (!field.isAccessible()) {
					field.setAccessible(true);
					isAccessible = true;
				}
				try {
					field.set(dto, "ABC");
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (isAccessible) {
						field.setAccessible(false);
					}
				}
			}
		}
		
		System.out.println(dto.getField1());

	}

}
