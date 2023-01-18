package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Phonebook {

	public void exportPhonebook(Map<String, String> contacts, String output) {
		if (contacts == null || output == null) {
			throw new IllegalArgumentException();
		}
		List<String> result = new ArrayList<>();
		for (Map.Entry<String, String> entry : contacts.entrySet()) {
			result.add(entry.getKey() + ": " + entry.getValue());
		}
		try {
			Files.write(Path.of(output), result);
		} catch (IOException ioe) {
			throw new IllegalArgumentException("cannot create file!", ioe);
		}
	}
}
