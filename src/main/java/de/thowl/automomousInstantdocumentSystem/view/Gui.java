/*
 * Autonomous Instantdocument System -- Automatically generate LaTeX Documents
 * Copyright (C) 2023 Jonas Schwind, Marvin Boschmann
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.thowl.automomousInstantdocumentSystem.view;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class represents the GUI of the Program.
 * It acts as a loader for an FXML file and sets up the graphical user
 * interface.
 * 
 * <p>
 * The controlling logic can be found in the
 * {@link de.thowl.automomousInstantdocumentSystem.control.Controller} class.
 * </p>
 * 
 * @author Jonas Schwind
 * @version 1.0.3
 * 
 * @see de.thowl.automomousInstantdocumentSystem.control.Controller
 */
public class Gui extends Application {

	/*
	 * Starts the GUI by loading the FXML file, applying the stylesheet,
	 * configuring the stage, and displaying it.
	 * 
	 * @param stage the primary stage for this application
	 * 
	 * @throws Exception if an error occurs during GUI initialization
	 */
	@Override
	public void start(Stage stage) throws Exception {
		URL resourceURL = getClass().getClassLoader().getResource("Main.fxml");
		URL stylesheetURL = getClass().getClassLoader().getResource("styles.css");
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(resourceURL);
		Parent root = fxmlLoader.load();
		root.getStylesheets().add(stylesheetURL.toExternalForm());
		stage.setTitle("Automomous Instantdocument System");
		stage.setScene(new Scene(root, 760, 490));
		stage.show();
	}
}
