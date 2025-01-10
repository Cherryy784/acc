package com.teomaik.demospring.themes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ThemeServices {

	List<Theme> themes = new ArrayList<Theme>();

	public List<Theme> getAllThemes() {
		return themes;
	}

	public List<Theme> addTheme(Theme theme) {
		int newId = 1;
		if(themes.size()>0) {
			newId = themes.get(themes.size()-1).getId() +1;
		}
		
		theme.setId(newId);
		themes.add(theme);
		return themes;
	}

	public List<Theme> removeTheme(Integer id) {
		themes.removeIf(theme -> theme.getId() == id);
		return themes;
	}

	public Theme updateTheme(int id, String name, String description) {
		for (Theme theme : themes) {
			if (theme.getId() == id) {
				if (name != null)
					theme.setName(name);
				if (description != null)
					theme.setDescription(description);
				return theme;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Theme with id " + id + " doesnt exist");
	}
}
